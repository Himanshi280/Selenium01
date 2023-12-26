import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
public class App {
    public static void main(String[] args) throws Exception {
     
        System.setProperty("webdriver.edge.driver", "C:\\Users\\HimanshiSoni\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        
       
        WebDriver driver = new EdgeDriver();
 
        String baseUrl = "https://demo.guru99.com/test/newtours/register.php";
        driver.get(baseUrl);
       
        WebElement firstNameInput = driver.findElement(By.name("firstName"));
        firstNameInput.sendKeys("Himanshi");
 
        WebElement lastNameInput = driver.findElement(By.name("lastName"));
        lastNameInput.sendKeys("Soni");
 
        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("9315789630");
 
        WebElement email = driver.findElement(By.id("username"));  
        email.sendKeys("himanshi.soni@cloudeq.com");
 
        WebElement addressInput = driver.findElement(By.name("address1"));
        addressInput.sendKeys("Godrej Eternia");
 
        WebElement cityInput = driver.findElement(By.name("city"));
        cityInput.sendKeys("Chandigarh");

        WebElement stateInput = driver.findElement(By.name("state"));
        stateInput.sendKeys("Chandigarh");

        WebElement PostalInput = driver.findElement(By.name("postalCode"));
        PostalInput.sendKeys("1234");
        
        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByValue("INDIA");

        WebElement UserInput = driver.findElement(By.name("email"));
        UserInput.sendKeys("himanshi.soni@cloudeq.com");

        WebElement PasswordInput = driver.findElement(By.name("password"));
        PasswordInput.sendKeys("1234");

        WebElement ConfirmPasswordInput = driver.findElement(By.name("confirmPassword"));
        ConfirmPasswordInput.sendKeys("1234");

        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();
 
        Thread.sleep(10000);
       
       
    }
}