package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ConfigurationGrid {

//	public static String DRIVER_DIR = System.getProperty("user.dir") + File.separator + "drivers" + File.separator;
//
//	public static String CHROME_DRIVER_PATH = DRIVER_DIR + "chromedriver";
//	public static String GECKO_DRIVER_PATH = DRIVER_DIR + "geckodriver";

	private static String IP = "http://34.205.129.96:8080";
	public static String BLOG_URL = IP + "/";
	public static String ADMIN_URL = IP + "/wp-admin";
	
	public static String USER_NAME = "user";
	public static String PASSWORD = "bitnami";

//	private static String modifyIfWindows(String inPath) {
//		if (System.getProperty("os.name").toLowerCase().contains("windows")) {
//			return inPath + ".exe";
//		} else
//			return inPath;
//
//	}

//	static String NODE_IP = "http://34.239.248.3:4444"; //aws IP with port
//	static String NODE = NODE_IP + "/wd/hub";
		
	static String NODE = "http:localhost:4444/wd/hub";
	
	public static WebDriver createDriverGrid() throws MalformedURLException {
//		System.setProperty("webdriver.chrome.driver", modifyIfWindows(CHROME_DRIVER_PATH));
		return new RemoteWebDriver(new URL(NODE), DesiredCapabilities.chrome());
	}
	


	
//	public static WebDriver createChromeDriver() {
//		System.setProperty("webdriver.chrome.driver", modifyIfWindows(CHROME_DRIVER_PATH));
//		return new ChromeDriver();
//	}
//
//	public static WebDriver createFireFoxDriver() {
//		System.setProperty("webdriver.gecko.driver", modifyIfWindows(GECKO_DRIVER_PATH));
//		return new FirefoxDriver();
//	}
}
