import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumproj1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver ch = new ChromeDriver();
		ch.get("https://www.lakmeindia.com");
		ch.findElement(By.xpath("//*[@id=\"section-header\"]/div[1]/div[3]/div[1]/a[2]")).click();
		

	}

}
