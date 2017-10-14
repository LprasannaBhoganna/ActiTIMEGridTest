package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google {

	@Parameters({ "node", "browser" })
	@Test
	public void testA(String node, String browser) throws MalformedURLException, InterruptedException {
		URL url = new URL(node);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(browser);

		WebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("https://www.google.co.in");

		Thread.sleep(2000);
		driver.close();
	}
}
