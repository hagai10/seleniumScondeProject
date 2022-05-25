import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

    public class test {
        public static <CromeDriver> void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver" , "C:\\DriverForGame\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.leumi.co.il/");
            driver.manage().window().maximize();

            WebElement personalButton = driver.findElement(By.className("includeLink"));
            personalButton.click();
            WebElement userNameInput = driver.findElement(By.id("uid"));
            userNameInput.sendKeys("messi12");
            WebElement passwordNameInput = driver.findElement(By.id("password"));
            passwordNameInput.sendKeys("acef6804");
            WebElement enter = driver.findElement(By.id("enter"));
            enter.click();

        }
    }


