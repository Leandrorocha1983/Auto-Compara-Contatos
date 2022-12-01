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
public class ST02ContatoAutoComparaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void sT02ContatoAutoCompara() {
    driver.get("https://www.autocompara.com.br/");
    driver.manage().window().setSize(new Dimension(1058, 678));
    driver.findElement(By.linkText("Fale conosco")).click();
    js.executeScript("window.scrollTo(0,50)");
    js.executeScript("window.scrollTo(0,213)");
    driver.findElement(By.cssSelector(".ng-tns-c59-0:nth-child(4)")).click();
    driver.findElement(By.cssSelector("#mat-option-0 > .mat-option-text")).click();
    driver.findElement(By.id("mat-input-1")).click();
    driver.findElement(By.id("mat-input-2")).click();
    driver.findElement(By.id("mat-input-3")).click();
    driver.findElement(By.id("mat-input-4")).click();
    driver.findElement(By.cssSelector(".ng-tns-c59-7 > .mat-form-field-infix")).click();
    driver.findElement(By.cssSelector(".cdk-overlay-backdrop")).click();
    driver.findElement(By.cssSelector(".ng-tns-c64-10 > .mat-select-arrow")).click();
    driver.findElement(By.cssSelector(".cdk-overlay-backdrop")).click();
    driver.findElement(By.cssSelector(".ng-tns-c64-12:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".cdk-overlay-backdrop")).click();
    driver.findElement(By.cssSelector(".ng-tns-c64-12:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".cdk-overlay-backdrop")).click();
    driver.findElement(By.cssSelector(".ng-tns-c64-12 > .mat-select-arrow")).click();
    driver.findElement(By.cssSelector(".cdk-overlay-backdrop")).click();
    driver.findElement(By.cssSelector(".ng-tns-c59-6 > .mat-form-field-infix")).click();
    driver.findElement(By.cssSelector("ac-textarea")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-tns-c59-2 > .mat-error"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-tns-c59-3 > .mat-error"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-tns-c59-4 > .mat-error"));
      assert(elements.size() > 0);
    }
    assertThat(driver.findElement(By.cssSelector(".ng-tns-c59-5 > .mat-error")).getText(), is("Campo obrigatório."));
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-tns-c59-5 > .mat-error"));
      assert(elements.size() > 0);
    }
    assertThat(driver.findElement(By.cssSelector(".ng-tns-c59-7 > .mat-form-field-infix")).getText(), is("  Seguradora *"));
    {
      List<WebElement> elements = driver.findElements(By.id("mat-error-6"));
      assert(elements.size() > 0);
    }
    assertThat(driver.findElement(By.cssSelector(".ng-tns-c64-10 > .mat-select-placeholder")).getText(), is(" "));
    {
      List<WebElement> elements = driver.findElements(By.id("mat-error-7"));
      assert(elements.size() > 0);
    }
    assertThat(driver.findElement(By.cssSelector(".ng-tns-c59-11 > .mat-form-field-infix")).getText(), is("  Tipo de documento"));
    assertThat(driver.findElement(By.id("mat-input-0")).getText(), is("  "));
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-tns-c59-6 > .mat-error"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.id("mat-input-1")).click();
    driver.findElement(By.id("mat-input-1")).sendKeys("Leandro Lima Da Rocha");
    driver.findElement(By.id("mat-input-2")).click();
    driver.findElement(By.id("mat-input-2")).sendKeys("316.186.518-97");
    driver.findElement(By.cssSelector(".ng-tns-c59-4:nth-child(4)")).click();
    driver.findElement(By.id("mat-input-3")).sendKeys("(11) 9 3471-5462");
    driver.findElement(By.id("mat-input-4")).click();
    driver.findElement(By.id("mat-input-4")).sendKeys("lrocha1983@gmail.com");
    driver.findElement(By.cssSelector(".ng-tns-c64-8 > .mat-select-placeholder")).click();
    driver.findElement(By.cssSelector("#mat-option-11 > .mat-option-text")).click();
    driver.findElement(By.cssSelector(".ng-tns-c64-10:nth-child(2)")).click();
    driver.findElement(By.cssSelector("#mat-option-14 > .mat-option-text")).click();
    driver.findElement(By.id("mat-input-5")).click();
    driver.findElement(By.id("mat-input-5")).sendKeys("frv-6930");
    driver.findElement(By.cssSelector(".mat-select-placeholder")).click();
    driver.findElement(By.cssSelector("#mat-option-16 > .mat-option-text")).click();
    driver.findElement(By.cssSelector(".ng-tns-c59-14:nth-child(4)")).click();
    driver.findElement(By.id("mat-input-6")).sendKeys("123456789088555555");
    driver.findElement(By.id("mat-input-0")).click();
    driver.findElement(By.id("mat-input-0")).sendKeys("Boa tarde, gostaria de saber da minha apólice...");
    driver.findElement(By.cssSelector(".ng-star-inserted > button")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ng-star-inserted:nth-child(2) > div > .ng-star-inserted"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("div:nth-child(4) button"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector("div:nth-child(4) button")).click();
    js.executeScript("window.scrollTo(0,0)");
  }
}
