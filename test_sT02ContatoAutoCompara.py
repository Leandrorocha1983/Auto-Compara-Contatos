import pytest
import time
import json
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities

class TestST02ContatoAutoCompara():
  def setup_method(self, method):
    self.driver = webdriver.Chrome()
    self.vars = {}
  
  def teardown_method(self, method):
    self.driver.quit()
  
  def test_sT02ContatoAutoCompara(self):
    self.driver.get("https://www.autocompara.com.br/")
    self.driver.set_window_size(1058, 678)
    self.driver.find_element(By.LINK_TEXT, "Fale conosco").click()
    self.driver.execute_script("window.scrollTo(0,50)")
    self.driver.execute_script("window.scrollTo(0,213)")
    self.driver.find_element(By.CSS_SELECTOR, ".ng-tns-c59-0:nth-child(4)").click()
    self.driver.find_element(By.CSS_SELECTOR, "#mat-option-0 > .mat-option-text").click()
    self.driver.find_element(By.ID, "mat-input-1").click()
    self.driver.find_element(By.ID, "mat-input-2").click()
    self.driver.find_element(By.ID, "mat-input-3").click()
    self.driver.find_element(By.ID, "mat-input-4").click()
    self.driver.find_element(By.CSS_SELECTOR, ".ng-tns-c59-7 > .mat-form-field-infix").click()
    self.driver.find_element(By.CSS_SELECTOR, ".cdk-overlay-backdrop").click()
    self.driver.find_element(By.CSS_SELECTOR, ".ng-tns-c64-10 > .mat-select-arrow").click()
    self.driver.find_element(By.CSS_SELECTOR, ".cdk-overlay-backdrop").click()
    self.driver.find_element(By.CSS_SELECTOR, ".ng-tns-c64-12:nth-child(2)").click()
    self.driver.find_element(By.CSS_SELECTOR, ".cdk-overlay-backdrop").click()
    self.driver.find_element(By.CSS_SELECTOR, ".ng-tns-c64-12:nth-child(2)").click()
    self.driver.find_element(By.CSS_SELECTOR, ".cdk-overlay-backdrop").click()
    self.driver.find_element(By.CSS_SELECTOR, ".ng-tns-c64-12 > .mat-select-arrow").click()
    self.driver.find_element(By.CSS_SELECTOR, ".cdk-overlay-backdrop").click()
    self.driver.find_element(By.CSS_SELECTOR, ".ng-tns-c59-6 > .mat-form-field-infix").click()
    self.driver.find_element(By.CSS_SELECTOR, "ac-textarea").click()
    elements = self.driver.find_elements(By.CSS_SELECTOR, ".ng-tns-c59-2 > .mat-error")
    assert len(elements) > 0
    elements = self.driver.find_elements(By.CSS_SELECTOR, ".ng-tns-c59-3 > .mat-error")
    assert len(elements) > 0
    elements = self.driver.find_elements(By.CSS_SELECTOR, ".ng-tns-c59-4 > .mat-error")
    assert len(elements) > 0
    assert self.driver.find_element(By.CSS_SELECTOR, ".ng-tns-c59-5 > .mat-error").text == "Campo obrigatório."
    elements = self.driver.find_elements(By.CSS_SELECTOR, ".ng-tns-c59-5 > .mat-error")
    assert len(elements) > 0
    assert self.driver.find_element(By.CSS_SELECTOR, ".ng-tns-c59-7 > .mat-form-field-infix").text == "  Seguradora *"
    elements = self.driver.find_elements(By.ID, "mat-error-6")
    assert len(elements) > 0
    assert self.driver.find_element(By.CSS_SELECTOR, ".ng-tns-c64-10 > .mat-select-placeholder").text == " "
    elements = self.driver.find_elements(By.ID, "mat-error-7")
    assert len(elements) > 0
    assert self.driver.find_element(By.CSS_SELECTOR, ".ng-tns-c59-11 > .mat-form-field-infix").text == "  Tipo de documento"
    assert self.driver.find_element(By.ID, "mat-input-0").text == "  "
    elements = self.driver.find_elements(By.CSS_SELECTOR, ".ng-tns-c59-6 > .mat-error")
    assert len(elements) > 0
    self.driver.find_element(By.ID, "mat-input-1").click()
    self.driver.find_element(By.ID, "mat-input-1").send_keys("Leandro Lima Da Rocha")
    self.driver.find_element(By.ID, "mat-input-2").click()
    self.driver.find_element(By.ID, "mat-input-2").send_keys("316.186.518-97")
    self.driver.find_element(By.CSS_SELECTOR, ".ng-tns-c59-4:nth-child(4)").click()
    self.driver.find_element(By.ID, "mat-input-3").send_keys("(11) 9 3471-5462")
    self.driver.find_element(By.ID, "mat-input-4").click()
    self.driver.find_element(By.ID, "mat-input-4").send_keys("lrocha1983@gmail.com")
    self.driver.find_element(By.CSS_SELECTOR, ".ng-tns-c64-8 > .mat-select-placeholder").click()
    self.driver.find_element(By.CSS_SELECTOR, "#mat-option-11 > .mat-option-text").click()
    self.driver.find_element(By.CSS_SELECTOR, ".ng-tns-c64-10:nth-child(2)").click()
    self.driver.find_element(By.CSS_SELECTOR, "#mat-option-14 > .mat-option-text").click()
    self.driver.find_element(By.ID, "mat-input-5").click()
    self.driver.find_element(By.ID, "mat-input-5").send_keys("frv-6930")
    self.driver.find_element(By.CSS_SELECTOR, ".mat-select-placeholder").click()
    self.driver.find_element(By.CSS_SELECTOR, "#mat-option-16 > .mat-option-text").click()
    self.driver.find_element(By.CSS_SELECTOR, ".ng-tns-c59-14:nth-child(4)").click()
    self.driver.find_element(By.ID, "mat-input-6").send_keys("123456789088555555")
    self.driver.find_element(By.ID, "mat-input-0").click()
    self.driver.find_element(By.ID, "mat-input-0").send_keys("Boa tarde, gostaria de saber da minha apólice...")
    self.driver.find_element(By.CSS_SELECTOR, ".ng-star-inserted > button").click()
    elements = self.driver.find_elements(By.CSS_SELECTOR, ".ng-star-inserted:nth-child(2) > div > .ng-star-inserted")
    assert len(elements) > 0
    elements = self.driver.find_elements(By.CSS_SELECTOR, "div:nth-child(4) button")
    assert len(elements) > 0
    self.driver.find_element(By.CSS_SELECTOR, "div:nth-child(4) button").click()
    self.driver.execute_script("window.scrollTo(0,0)")
  
