# Duotify
INSTRUCTIONS:

In this assignment you will be creating an automation script for signing up and logging into the web application.
Create the script in your own IDE, once finished, push the PROJECT to your own repository and share the repository link here in a given repoLink.txt file and submit. (Don't write your code here in Replit, I just need your repository link)


STEPS:
1. Navigate to http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php
2. Verify the the title is "Welcome to Duotify!"
3. Click on Signup here link
4. Fill out the form with the required info
5. Click on Sign up button
6. Once logged in to the application, verify that the URL is:
http://qa-duotify.us-east-2.elasticbeanstalk.com/browse.php?
7. In the left navigation bar, verify that your first and last name matches the first and last name that you used when signing up.
  (Use getText() method to extract the text from the WebElement)
8. Click on the username on the left navigation bar and verify the username on the main window above the User Details button is correct 
 and then click logout.
   (Use By.tagName() as your locator)
10. Verify that you are logged out by verifying the URL is:
http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php
11. Login using the same username and password when you signed up.
12. Verify successful login by verifying that the home page contains the text "You Might Also Like".
13. Log out once again and close the browser.

  NOTE: This application does not allow you to create a user with the same username or email again, so find a workaround so that you can execute your script as many times as you possible.
