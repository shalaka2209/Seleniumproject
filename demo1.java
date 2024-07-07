import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver ch=new ChromeDriver();
		
		ch.get("http://www.google.com");
		ch.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("mobile");
		ch.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		ch.switchTo().newWindow(WindowType.TAB);
		ch.get("http://www.amazon.com");
//		ch.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
//		ch.findElement(By.xpath("//*[@id=\"AddToCartLibrary-AddToCartButton-Personalization\"]")).click();
		ch.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
		ch.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		ch.findElement(By.xpath("//*[@id=\"a-autoid-1\"]")).click();
		
		
				

	}

}
