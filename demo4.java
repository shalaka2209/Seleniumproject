import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		Actions actions=new Actions(driver);
		WebElement fullname=driver.findElement(By.id("userName"));
		fullname.sendKeys("xyz");
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("xyz@gmail.com");
		WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("43 school Lane London 9G0");
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		driver.findElement(By.id("submit")).click();
		
		

	}

}
