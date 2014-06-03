import org.openqa.selenium.chrome.ChromeDriver

waiting {
	timeout = 2
}

environments {

	//TODO: - setup a cool way to get the drivers chromedriver.exe on demand.
	
	chrome {
		//ensure chromedriver.exe is on the PATH
		driver = { new ChromeDriver() }
	}

	//TODO: Add IE config

	//TODO: Add firefox config
}