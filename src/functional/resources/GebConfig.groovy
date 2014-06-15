import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.ie.InternetExplorerDriver

import org.openqa.selenium.remote.DesiredCapabilities

waiting {
	timeout = 2
}

environments {

	//TODO: - setup a cool way to get the drivers chromedriver.exe on demand.
	
	chrome {
		//ensure chromedriver.exe is on the PATH
		driver = { new ChromeDriver() }
	}

	ie {
		driver = { new InternetExplorerDriver() }
	}

	//TODO: Add IE config

	//TODO: Add firefox config
}