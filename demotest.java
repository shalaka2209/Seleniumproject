import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.edge.*;


public class demotest {
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
		
		dr.get("http://localhost:8081");
		dr.manage().window().maximize();
		dr.findElement(By.id("APjFqb")).sendKeys("mobile");
		
		
		
		

	}

}
