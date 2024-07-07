import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String url="https://www.netflix.com";
		driver.get(url);
		String title=driver.getTitle();
		int titleLength=driver.getTitle().length();
		System.out.println("Title"+title);
		System.out.println("Length"+titleLength);
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.equals(url)) {
			System.out.println("Verification successful");
			
		}
		else {
			System.out.println("Verification Failed");
			System.out.println("Actual url"+actualUrl);
			System.out.println("Expected URL"+url);
			
			}

	}

}
