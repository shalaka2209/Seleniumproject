import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
public class jenkinproject {
	public static String browser="Chrome";
	public static WebDriver dr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(browser.equals("Chrome")) {
			dr=new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			dr=new FirefoxDriver();
			
		}
		else if(browser.equals("Edge")) {
			dr=new EdgeDriver();
			
		}
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.get("http://localhost:8081");
		dr.manage().window().maximize();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"j_username\"]")).sendKeys("shalakamande");
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"j_password\"]")).sendKeys("Shalu1234#");
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"main-panel\"]/div/form/button")).click();	
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"tasks\"]/div[1]/span/a")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Selenium9");
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"j-add-item-type-standalone-projects\"]/ul/li[1]")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"ok-button\"]")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"main-panel\"]/form/div[1]/div[2]/div/div[2]/textarea")).sendKeys("selenium");
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"main-panel\"]/form/div[1]/section[1]/div[6]/div[1]/div/span/label")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"main-panel\"]/form/div[1]/section[1]/div[6]/div[3]/div[1]/div[2]/input")).sendKeys("https://github.com/shalaka2209/sh4545");
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("window.scrollBy(0,500);");
		dr.findElement(By.xpath("//*[@id=\"main-panel\"]/form/div[1]/section[2]/div[3]/div[1]/div/div/label")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"main-panel\"]/form/div[1]/section[2]/div[3]/div[1]")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"main-panel\"]/form/div[1]/section[2]/div[3]/div[1]/div/div")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"main-panel\"]/form/div[1]/section[2]/div[3]/div[3]/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[2]/input")).sendKeys("https://github.com/shalaka2209/sh4545.git");
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"main-panel\"]/form/div[1]/section[2]/div[3]/div[3]/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/select")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"main-panel\"]/form/div[1]/section[2]/div[3]/div[3]/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/select/option[2]")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		js.executeScript("window.scrollBy(0,1100);");
		dr.findElement(By.xpath("//*[@id=\"main-panel\"]/form/div[1]/section[3]/div[6]/div[1]/div/span/label")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"main-panel\"]/form/div[1]/section[3]/div[6]/div[4]/div[1]/div[2]/textarea")).sendKeys("* * * * *");
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		js.executeScript("window.scrollBy(0,600);");
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"main-panel\"]/form/div[1]/section[5]/div[2]/div/div/div[2]/button")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"tippy-5\"]/div/div/div/div[2]/button[4]")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"textarea._.targets\"]")).sendKeys("install");
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		dr.findElement(By.xpath("//*[@id=\"bottom-sticker\"]/div/button[1]")).click();
		
		
		
		
		
		
		
		
		

	}

}
