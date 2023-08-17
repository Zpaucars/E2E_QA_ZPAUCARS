
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;


public class Main {
    private  static WebDriver driver;
    public static void main(String[] args) {
        //Browser test
        System.setProperty("webdriver.chrome.driver", "D://Selenium jars and drivers//drivers//chromedriver//chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();

        //Go to url test
        driver.get("https://www.saucedemo.com/");

        //User test
        WebElement username = driver.findElement(By.id("user-name"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("standard_user");

        //Password test
        WebElement password = driver.findElement(By.id("password"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("secret_sauce");

        //Button test
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.isDisplayed();
        loginButton.isEnabled();
        loginButton.click();

        //Add two products test
        //inventory_item_name ---> label of product

        //driver.close();


    }
}