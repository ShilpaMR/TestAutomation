import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path="C:\\Users\\Dell\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dell/Desktop/New%20folder%20(2)/DemoSite/DemoSite.html");
		String dest="C:\\Users\\Dell\\eclipse-workspace\\Automation\\Screenshot\\firstshot.png";
		File f=new File(dest);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		//Fileutils.copy();
		Files.copy(src, f);
		BufferedImage fullimgage=ImageIO.read(src);
		WebElement elementpopup=driver.findElement(By.xpath("//button[text()='Pop1']"));
		Point p=elementpopup.getLocation();
		Dimension d=elementpopup.getSize();
		
		BufferedImage cropimgage=fullimgage.getSubimage(p.getX(), p.getY(), d.getHeight(), d.getWidth());
		
		ImageIO.write(cropimgage, "png", src);
		String dest1="C:\\Users\\Dell\\eclipse-workspace\\Automation\\Screenshot\\firstshot1.png";
		File f1=new File(dest1);
		Files.copy(src, f1);
		
	}

}
