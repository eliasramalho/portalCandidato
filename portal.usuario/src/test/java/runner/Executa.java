package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import coneccoes.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@teste",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","html:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		
		)

public class Executa extends DriversFactory { 
	
	@BeforeClass
	public static void IniciarTeste() {
		String prod = "https://myrandstad.randstad.com.br/#/login";
		String url = "https://qa-fe-pca.randstad.com.br/#/";
		String urlEasyApply = "https://qa-fe-pca.randstad.com.br/#/easy-apply?jobPositionId=jp-2027";
		String navegador = "Chrome";
		
		if (navegador.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if (navegador.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else {
			System.out.println("Digite chrome ou firefox");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	@AfterClass
	 public static void fecharNavegador() {
		 driver.quit();
	 }

}
