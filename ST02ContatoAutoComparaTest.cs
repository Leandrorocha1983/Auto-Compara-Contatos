using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Firefox;
using OpenQA.Selenium.Remote;
using OpenQA.Selenium.Support.UI;
using OpenQA.Selenium.Interactions;
using NUnit.Framework;
[TestFixture]
public class ST02ContatoAutoComparaTest {
  private IWebDriver driver;
  public IDictionary<string, object> vars {get; private set;}
  private IJavaScriptExecutor js;
  [SetUp]
  public void SetUp() {
    driver = new ChromeDriver();
    js = (IJavaScriptExecutor)driver;
    vars = new Dictionary<string, object>();
  }
  [TearDown]
  protected void TearDown() {
    driver.Quit();
  }
  [Test]
  public void sT02ContatoAutoCompara() {
    driver.Navigate().GoToUrl("https://www.autocompara.com.br/");
    driver.Manage().Window.Size = new System.Drawing.Size(1058, 678);
    driver.FindElement(By.LinkText("Fale conosco")).Click();
    js.ExecuteScript("window.scrollTo(0,50)");
    js.ExecuteScript("window.scrollTo(0,213)");
    driver.FindElement(By.CssSelector(".ng-tns-c59-0:nth-child(4)")).Click();
    driver.FindElement(By.CssSelector("#mat-option-0 > .mat-option-text")).Click();
    driver.FindElement(By.Id("mat-input-1")).Click();
    driver.FindElement(By.Id("mat-input-2")).Click();
    driver.FindElement(By.Id("mat-input-3")).Click();
    driver.FindElement(By.Id("mat-input-4")).Click();
    driver.FindElement(By.CssSelector(".ng-tns-c59-7 > .mat-form-field-infix")).Click();
    driver.FindElement(By.CssSelector(".cdk-overlay-backdrop")).Click();
    driver.FindElement(By.CssSelector(".ng-tns-c64-10 > .mat-select-arrow")).Click();
    driver.FindElement(By.CssSelector(".cdk-overlay-backdrop")).Click();
    driver.FindElement(By.CssSelector(".ng-tns-c64-12:nth-child(2)")).Click();
    driver.FindElement(By.CssSelector(".cdk-overlay-backdrop")).Click();
    driver.FindElement(By.CssSelector(".ng-tns-c64-12:nth-child(2)")).Click();
    driver.FindElement(By.CssSelector(".cdk-overlay-backdrop")).Click();
    driver.FindElement(By.CssSelector(".ng-tns-c64-12 > .mat-select-arrow")).Click();
    driver.FindElement(By.CssSelector(".cdk-overlay-backdrop")).Click();
    driver.FindElement(By.CssSelector(".ng-tns-c59-6 > .mat-form-field-infix")).Click();
    driver.FindElement(By.CssSelector("ac-textarea")).Click();
    var elements = driver.FindElements(By.CssSelector(".ng-tns-c59-2 > .mat-error"));
    Assert.True(elements.Count > 0);
    var elements = driver.FindElements(By.CssSelector(".ng-tns-c59-3 > .mat-error"));
    Assert.True(elements.Count > 0);
    var elements = driver.FindElements(By.CssSelector(".ng-tns-c59-4 > .mat-error"));
    Assert.True(elements.Count > 0);
    Assert.That(driver.FindElement(By.CssSelector(".ng-tns-c59-5 > .mat-error")).Text, Is.EqualTo("Campo obrigatório."));
    var elements = driver.FindElements(By.CssSelector(".ng-tns-c59-5 > .mat-error"));
    Assert.True(elements.Count > 0);
    Assert.That(driver.FindElement(By.CssSelector(".ng-tns-c59-7 > .mat-form-field-infix")).Text, Is.EqualTo("  Seguradora *"));
    var elements = driver.FindElements(By.Id("mat-error-6"));
    Assert.True(elements.Count > 0);
    Assert.That(driver.FindElement(By.CssSelector(".ng-tns-c64-10 > .mat-select-placeholder")).Text, Is.EqualTo(" "));
    var elements = driver.FindElements(By.Id("mat-error-7"));
    Assert.True(elements.Count > 0);
    Assert.That(driver.FindElement(By.CssSelector(".ng-tns-c59-11 > .mat-form-field-infix")).Text, Is.EqualTo("  Tipo de documento"));
    Assert.That(driver.FindElement(By.Id("mat-input-0")).Text, Is.EqualTo("  "));
    var elements = driver.FindElements(By.CssSelector(".ng-tns-c59-6 > .mat-error"));
    Assert.True(elements.Count > 0);
    driver.FindElement(By.Id("mat-input-1")).Click();
    driver.FindElement(By.Id("mat-input-1")).SendKeys("Leandro Lima Da Rocha");
    driver.FindElement(By.Id("mat-input-2")).Click();
    driver.FindElement(By.Id("mat-input-2")).SendKeys("316.186.518-97");
    driver.FindElement(By.CssSelector(".ng-tns-c59-4:nth-child(4)")).Click();
    driver.FindElement(By.Id("mat-input-3")).SendKeys("(11) 9 3471-5462");
    driver.FindElement(By.Id("mat-input-4")).Click();
    driver.FindElement(By.Id("mat-input-4")).SendKeys("lrocha1983@gmail.com");
    driver.FindElement(By.CssSelector(".ng-tns-c64-8 > .mat-select-placeholder")).Click();
    driver.FindElement(By.CssSelector("#mat-option-11 > .mat-option-text")).Click();
    driver.FindElement(By.CssSelector(".ng-tns-c64-10:nth-child(2)")).Click();
    driver.FindElement(By.CssSelector("#mat-option-14 > .mat-option-text")).Click();
    driver.FindElement(By.Id("mat-input-5")).Click();
    driver.FindElement(By.Id("mat-input-5")).SendKeys("frv-6930");
    driver.FindElement(By.CssSelector(".mat-select-placeholder")).Click();
    driver.FindElement(By.CssSelector("#mat-option-16 > .mat-option-text")).Click();
    driver.FindElement(By.CssSelector(".ng-tns-c59-14:nth-child(4)")).Click();
    driver.FindElement(By.Id("mat-input-6")).SendKeys("123456789088555555");
    driver.FindElement(By.Id("mat-input-0")).Click();
    driver.FindElement(By.Id("mat-input-0")).SendKeys("Boa tarde, gostaria de saber da minha apólice...");
    driver.FindElement(By.CssSelector(".ng-star-inserted > button")).Click();
    var elements = driver.FindElements(By.CssSelector(".ng-star-inserted:nth-child(2) > div > .ng-star-inserted"));
    Assert.True(elements.Count > 0);
    var elements = driver.FindElements(By.CssSelector("div:nth-child(4) button"));
    Assert.True(elements.Count > 0);
    driver.FindElement(By.CssSelector("div:nth-child(4) button")).Click();
    js.ExecuteScript("window.scrollTo(0,0)");
  }
}
