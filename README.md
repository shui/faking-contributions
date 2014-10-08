##Faking Contributions

GitHub has a feature where commits can be amended with older dates.

For the lols (and I was bored), I decided to create a program that would fill GitHub's contributions calendar.

![faked contributions calendar](http://www.justicesuh.com/images/fc.png)

###Instructions
Make sure you have Python 2.7 installed

Create a GitHub repository to hold the fake commits

Clone this repository locally

Delete the .git folder (make sure the directory doesn't have a .git folder)

Then run
    
    python faking-contributions.py username password repository

example:

    python faking-contributions.py justicesuh hunter2 fake-commits
    
###Todo
Allow templating (pretty pictures)