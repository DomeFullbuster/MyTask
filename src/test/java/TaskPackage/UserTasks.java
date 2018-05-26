package TaskPackage;

import io.restassured.RestAssured;
import org.apache.commons.validator.routines.UrlValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class UserTasks {

    private static WebDriver driver;

    @DataProvider(name = "Registration")
    public static Object[][] fields() {

        return UserAdd.provideUsers();
    }

    @Test(dataProvider = "Registration")

    public void Register(String firstName,
                         String lastName,
                         String phone,
                         String userName,
                         String email,
                         String password,
                         String confirmPassword) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://demoqa.com/registration/");

        //Validates Site URL
        UrlValidator defaultValidator = new UrlValidator(); // default schemes
        if (defaultValidator.isValid("http://demoqa.com/registration/")) {
            System.out.println("We are on the Registration page");
        }
        else {
            System.out.println("We are not on the correct page");
        }

        //Completes all the fields on the page
            driver.findElement(By.xpath("//*[@id=\"name_3_firstname\"]")).click();
            driver.findElement(By.id("name_3_firstname")).sendKeys(firstName);
            driver.findElement(By.xpath("//*[@id=\"name_3_lastname\"]")).click();
            driver.findElement(By.id("name_3_lastname")).sendKeys(lastName);
            driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[3]/div/div[1]/input[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"phone_9\"]")).click();
            driver.findElement(By.id("phone_9")).sendKeys(phone);
            driver.findElement(By.xpath("//*[@id=\"username\"]")).click();
            driver.findElement(By.id("username")).sendKeys(userName);
            driver.findElement(By.xpath("//*[@id=\"email_1\"]")).click();
            driver.findElement(By.id("email_1")).sendKeys(email);
            driver.findElement(By.xpath("//*[@id=\"password_2\"]")).click();
            driver.findElement(By.id("password_2")).sendKeys(password);
            driver.findElement(By.xpath("//*[@id=\"confirm_password_password_2\"]")).click();
            driver.findElement(By.id("confirm_password_password_2")).sendKeys(confirmPassword);
            driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[14]/div/input")).click();


            //Verifies if the user registered or is already present

            if (driver.getPageSource().contains("Thank you for your registration")){
                System.out.println("User Registered");
            }

            else {
                System.out.println("User is already present");
            }


            driver.quit();
            }
        }




