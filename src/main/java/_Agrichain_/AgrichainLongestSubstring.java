package _Agrichain_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AgrichainLongestSubstring {
    public String getLongestSubstring(String input) {
    	
    		// Set up ChromeDriver executable using WebDriverManager
    		WebDriverManager.chromedriver().setup();
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://agrichain.com");

        // Find the input field and submit button
        WebElement inputField = driver.findElement(By.id("inputField"));
        WebElement submitButton = driver.findElement(By.id("submitButton"));

        // Enter input text
        inputField.sendKeys(input);

        // Click on the submit button
        submitButton.click();

        // Wait for the output page to load
        // You might need to use WebDriverWait here to wait for specific elements to appear on the page

        // Once on the output page, find the element containing the output text
        WebElement outputElement = driver.findElement(By.id("outputText"));

        // Get the text of the output element
        String outputText = outputElement.getText();

        // Close the browser
        driver.quit();

        return outputText;
    }
}
