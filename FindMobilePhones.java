package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FindMobilePhones {

	public static void main(String[] args) {
     ChromeOptions options = new ChromeOptions();
		
		// Launch the browser
		ChromeDriver driver1 = new ChromeDriver(options);
		
		// Load the url - get
		driver1.get("https://www.amazon.in/");
		
		// Maximize the browser
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        driver1.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
        driver1.findElement(By.id("nav-search-submit-button")).click();
        driver1.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
        driver1.findElement(By.xpath("//a[@id='s-result-sort-select_1'][1]")).click();
        WebElement sortDropdown = driver1.findElement(By.id("s-result-sort-select"));
        Select sortBy = new Select(sortDropdown);
        sortBy.selectByVisibleText("Price: Low to High");
        List<WebElement> priceElements = driver1.findElements(
                By.xpath("//span[@class='a-price-whole']")
        );

     // Step 3: Store prices in a list
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < priceElements.size(); i++) 
        {
            String priceText = priceElements.get(i).getText().replace(",", "").trim();
            if (!priceText.isEmpty())
            { 
                prices.add(Integer.parseInt(priceText));
            }
        }

        // Step 4: Sort and get lowest price
        Collections.sort(prices);
        System.out.println("Lowest phone price: ₹" + prices.get(0));
            
        // Close browser
        driver1.quit();
	}
}

	


