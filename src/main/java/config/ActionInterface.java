package config;

import java.io.IOException;
import org.openqa.selenium.By;

public interface ActionInterface {
	public void waitDriver();
	
	public void sleep();

	public String timeStamp();

	public String screenShot() throws IOException;

	public String[] openBrowser();

	public String[] navigate(String dataValue);

	public String[] click(By locatorValue);

	public String[] input(By locatorValue, String dataValue);
	
	public String[] objExist(By locatorValue);

	public void closeBrowser();

}
