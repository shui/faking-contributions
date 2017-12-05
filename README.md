## Faking Contributions

Git has a feature where commits can be amended with older dates.

For the lols (and I was bored), I decided to create a program that would fill GitHub's contributions calendar.

![faked contributions calendar](http://i.imgur.com/5vkUDzh.png)

### Instructions
Make sure you have Python 3+ installed

Create a GitHub repository to hold the fake commits

Clone this repository locally

Delete the .git folder (make sure the directory doesn't have a .git folder)

Then run
    
    python3 faking-contributions.py username password repository

example:

    python3 faking-contributions.py justicesuh hunter2 fake-commits
    
### Creating a word template
    
![oh hai](http://www.justicesuh.com/images/ohhai.png)

    python3 generator.py "the string" filename

example:

    python3 generator.py "oh hai" templates/ohhai

### Running with a template

![faked calendar with template](http://i.imgur.com/9ZFdqpx.png)

    python3 faking-contributions.py username password repository template
    
example:

    python3 faking-contributions.py justicesuh hunter2 fake-commits templates/ohhai