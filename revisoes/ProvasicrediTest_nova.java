// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ProvasicrediTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void provasicredi() {
    driver.get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.id("switch-version-select")).click();
    {
      WebElement dropdown = driver.findElement(By.id("switch-version-select"));
      dropdown.findElement(By.xpath("//option[. = 'Bootstrap V4 Theme']")).click();
    }
    driver.findElement(By.linkText("Add Customer")).click();
    driver.findElement(By.id("field-customerName")).click();
    driver.findElement(By.id("field-customerName")).sendKeys("Teste Sicredi");
    driver.findElement(By.id("field-contactLastName")).sendKeys("Teste");
    driver.findElement(By.id("field-contactFirstName")).sendKeys("seu nome");
    driver.findElement(By.id("field-phone")).sendKeys("51 9999-9999");
    driver.findElement(By.id("field-addressLine1")).sendKeys("Av Assis Brasil, 3970");
    driver.findElement(By.id("field-addressLine2")).sendKeys("Torre D");
    driver.findElement(By.id("field-city")).sendKeys("Porto Alegre");
    driver.findElement(By.id("field-state")).sendKeys("RS");
    driver.findElement(By.id("field-postalCode")).sendKeys("91000-000");
    driver.findElement(By.id("field-country")).sendKeys("Brasil");
    driver.findElement(By.cssSelector("span")).click();
    driver.findElement(By.cssSelector(".chosen-search > input")).sendKeys("Fixter");
    driver.findElement(By.cssSelector("em")).click();
    driver.findElement(By.id("field-creditLimit")).click();
    driver.findElement(By.id("field-creditLimit")).sendKeys("200");
    driver.findElement(By.id("form-button-save")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("report-success")));
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"report-success\"]/p/a[1]"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.linkText("Edit Customer")).click();
    driver.close();
  }
}
