package removeodditemshomework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RemoveOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:\\Edgedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/index.html");
		List <WebElement> myOptions = driver.findElements(By.tagName("option"));
		for(int i=0; i<myOptions.size();i++) {
			if(i % 2 == 0) {
				myOptions.get(i).click();
				System.err.println("i will remove "+myOptions.get(i).getText());
				driver.findElement(By.id("remove")).click();
				
			}else {
				System.out.println("i will keep "+myOptions.get(i).getText());
			}
		}
		

	}

}
