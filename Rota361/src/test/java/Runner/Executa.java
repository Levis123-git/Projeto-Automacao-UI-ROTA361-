package Runner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

import Drivers.DriversFactory;

public class Executa extends DriversFactory {

	@BeforeAll
	public static void antesDosTestes() {
		driver = new ChromeDriver();
		driver.get("https://stg-new.rota361.com.br/login");
		driver.manage().window().maximize();

	}

	@AfterAll
	public static void depoisDosTestes() {
		driver.quit();

	}

}
