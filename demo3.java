import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver ch = new ChromeDriver();
		ch.get("https://www.toolsqa.com/selenium-training/");
		ch.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/a")).click();
		ch.navigate().back();
		ch.navigate().forward();
		ch.navigate().to("https://www.toolsqa.com/selenium-training/");
		ch.navigate().refresh();
		ch.close();

	}

}
