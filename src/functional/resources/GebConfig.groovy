import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

waiting {
	timeout = 2
}

boolean remote = System.getProperty("remote.test")

environments {

	//TODO: - setup a cool way to get the drivers chromedriver.exe on demand.
	
	chrome {
		//ensure chromedriver.exe is on the PATH
		driver = { new ChromeDriver() }
	}

	ie {
		driver = { new InternetExplorerDriver() }
	}

    firefox {
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        if(remote){
            driver = { new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability) }
        }
        else {
            driver = { new FirefoxDriver() }
        }
    }

	//TODO: Add firefox config
}