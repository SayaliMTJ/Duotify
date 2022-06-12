import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

    public class Duotify{
        // INSTRUCTIONS:
        //
        //In this assignment you will be creating an automation script for signing up and logging into the web application.
        //Create the script in your own IDE, once finished, push the PROJECT to your own repository and share the repository link here in a given repoLink.txt file and submit. (Don't write your code here in Replit, I just need your repository link)

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/Users/sayalimammadova/Desktop/BrowserDrivers/chromedriver");

            WebDriver driver = new ChromeDriver();

            //1. Navigate to http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php
            driver.navigate().to("http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php");
            driver.manage().window().maximize();

            //2. Verify the the title is "Welcome to Duotify!"
            String actualTitle = driver.getTitle();
            String expectedTitle = "Welcome to Duotify!";
            Assert.assertEquals(actualTitle, expectedTitle);
            Thread.sleep(2000);

            //3. Click on Signup here link
            driver.findElement(By.id("hideLogin")).click();

            //4. Fill out the form with the required info
            WebElement userName = driver.findElement(By.name("username"));
            WebElement firstName = driver.findElement(By.name("firstName"));
            WebElement lastName = driver.findElement(By.name("lastName"));
            WebElement email = driver.findElement(By.name("email"));
            WebElement confMail = driver.findElement(By.name("email2"));
            Thread.sleep(2000);
            WebElement password = driver.findElement(By.name("password"));
            WebElement confPassword = driver.findElement(By.name("password2"));

            int randomUser = (int) (4 + Math.random() * 999);
            userName.sendKeys("sayalimmm" + randomUser);
            firstName.sendKeys("Sayali");
            lastName.sendKeys("Mammadova");
            int random2 = (int) (4 + Math.random() * 999);
            email.sendKeys("sayali" + random2 + "mammadovaaa" + random2 + "@gmail.com");
            confMail.sendKeys("sayali" + random2 + "mammadovaaa" + random2 + "@gmail.com");
            password.sendKeys("sayali7667");
            confPassword.sendKeys("sayali7667");

            //5. Click on Sign up button
            driver.findElement(By.name("registerButton")).click();

            //6. Once logged in to the application, verify that the URL is:
            //http://qa-duotify.us-east-2.elasticbeanstalk.com/browse.php?
            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "http://qa-duotify.us-east-2.elasticbeanstalk.com/browse.php?";
            Assert.assertEquals(expectedUrl, actualUrl);

            //7. In the left navigation bar, verify that your first and last name matches the first and last name that you used when signing up.
            // (Use getText() method to extract the text from the WebElement)
            String str = driver.findElement(By.id("nameFirstAndLast")).getText();
            Assert.assertTrue(str.contains("Sayali Mammadova"));
            Thread.sleep(2000);

            //8. Click on the username on the left navigation bar and verify the username on the main window above the User Details button is correct
            // and then click logout.
            //   (Use By.tagName() as your locator)
            driver.findElement(By.id("nameFirstAndLast")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("rafael")).click();

            //10. Verify that you are logged out by verifying the URL is:
            //http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php
            actualUrl=driver.getPageSource();
            expectedUrl="http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php";
            Assert.assertFalse(actualUrl.contains(expectedUrl));
            Thread.sleep(2000);

            //11. Login using the same username and password when you signed up.
            driver.findElement(By.id("loginUsername")).sendKeys("sayalimmm"+randomUser);
            driver.findElement(By.id("loginPassword")).sendKeys("sayali7667");
            driver.findElement(By.name("loginButton")).click();
            Thread.sleep(2000);

            //12. Verify successful login by verifying that the home page contains the text "You Might Also Like".
            driver.getPageSource().contains("You Might Also Like");
            driver.findElement(By.id("nameFirstAndLast")).click();
            Thread.sleep(2000);

            // 13. Log out once again and close the browser.
            //  NOTE: This application does not allow you to create a user with the same username or email again, so find a workaround so that you can execute your script as many times as you possible.
            driver.findElement(By.id("rafael")).click();
            driver.quit();



        }}

