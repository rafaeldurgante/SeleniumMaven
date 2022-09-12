package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class seleniumdemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Test name: desafio1
        // Step # | name | target | value
        // 1 | open | /v1.x/demo/bootstrap_theme |
        driver.get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");
        // 2 | setWindowSize | 1382x744 |
        driver.manage().window().setSize(new Dimension(1382, 744));
        // 3 | click | id=switch-version-select |
        driver.findElement(By.id("switch-version-select")).click();
        // 4 | select | id=switch-version-select | label=Bootstrap V4 Theme
        {
            WebElement dropdown = driver.findElement(By.id("switch-version-select"));
            dropdown.findElement(By.xpath("//option[. = 'Bootstrap V4 Theme']")).click();
        }
        // 5 | click | linkText=Add Customer |
        driver.findElement(By.linkText("Add Customer")).click();
        // 6 | click | id=field-customerName |
        driver.findElement(By.id("field-customerName")).click();
        // 7 | type | id=field-customerName | Teste Sicredi
        driver.findElement(By.id("field-customerName")).sendKeys("Teste Sicredi");
        // 8 | type | id=field-contactLastName | Teste
        driver.findElement(By.id("field-contactLastName")).sendKeys("Teste");
        // 9 | type | id=field-contactFirstName | rafael
        driver.findElement(By.id("field-contactFirstName")).sendKeys("rafael");
        // 10 | type | id=field-phone | 51 9999-9999
        driver.findElement(By.id("field-phone")).sendKeys("51 9999-9999");
        // 11 | type | id=field-addressLine1 | Av Assis Brasil, 3970
        driver.findElement(By.id("field-addressLine1")).sendKeys("Av Assis Brasil, 3970");
        // 12 | type | id=field-addressLine2 | Torre D
        driver.findElement(By.id("field-addressLine2")).sendKeys("Torre D");
        // 13 | type | id=field-city | Porto Alegre
        driver.findElement(By.id("field-city")).sendKeys("Porto Alegre");
        // 14 | type | id=field-state | RS
        driver.findElement(By.id("field-state")).sendKeys("RS");
        // 15 | type | id=field-postalCode | 91000-000
        driver.findElement(By.id("field-postalCode")).sendKeys("91000-000");
        // 16 | type | id=field-country | Brasil
        driver.findElement(By.id("field-country")).sendKeys("Brasil");
        // 17 | click | css=span |
        driver.findElement(By.cssSelector("span")).click();
        // 18 | type | css=.chosen-search > input | Fixter
        driver.findElement(By.cssSelector(".chosen-search > input")).sendKeys("Fixter");
        // 19 | click | css=em |
        driver.findElement(By.cssSelector("em")).click();
        // 20 | click | id=field-creditLimit |
        driver.findElement(By.id("field-creditLimit")).click();
        // 21 | type | id=field-creditLimit | 200
        driver.findElement(By.id("field-creditLimit")).sendKeys("200");
        // 22 | click | id=form-button-save |
        driver.findElement(By.id("form-button-save")).click();
        // 23 | Check | linkText= Report-sucess |
       driver.findElement(By.id("report-success"));
        // 24 | Edit |
        driver.findElement(By.id("Edit Customer")).click();
        // 25 | Close |
        driver.close();
    }
}
