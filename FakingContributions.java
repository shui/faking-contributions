import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FakingContributions
{
	public static final String[] DAYS = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
	
	public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	
	public static final String COMMIT_TIME = "12:00";
	
	public static final String UTC_OFFSET = "-0500";
	
	public static final String REPO = "for-the-lols";
	
	public FakingContributions() throws Exception
	{	
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR) - 1;
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int limit = isLeapYear(year) ? 366 : 365;
		Calendar start = new GregorianCalendar(year, month, day);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(REPO));
		for (int i=0; i<limit; i++)
		{
			bw.write(DAYS[start.get(Calendar.DAY_OF_WEEK) - 1] + " " + MONTHS[start.get(Calendar.MONTH)] + " " + start.get(Calendar.DAY_OF_MONTH) + " " + COMMIT_TIME + " " + start.get(Calendar.YEAR) + " " + UTC_OFFSET + System.getProperty("line.separator"));
			start.add(Calendar.DAY_OF_MONTH, 1);
		}
		bw.flush();
		bw.close();
	}
	
	public boolean isLeapYear(int year)
	{
		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}
	
	public static void main(String[] args) throws Exception
	{
		new FakingContributions();
	}
	

}
