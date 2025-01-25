import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager


@pytest.fixture(scope="function")
def browser():
   
   
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
    driver.maximize_window()
    yield driver
    
    driver.quit()


def test_w3schools_logo(browser):
   
   
    browser.get("https://www.w3schools.com/")
    
    
    logo_locator = (By.CSS_SELECTOR, "a#w3-logo i.fa-logo")
    logo = browser.find_element(*logo_locator)
    
    
    assert logo.is_displayed(), "W3Schools logo is not visible on the page."
    print("W3Schools logo is displayed on the page.")