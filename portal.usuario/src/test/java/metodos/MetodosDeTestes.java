package metodos;

import static org.junit.Assert.assertTrue;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import coneccoes.DriversFactory;

public class MetodosDeTestes extends DriversFactory {

	public void clicar(By elemento, String descricaoPasso) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("*******erro no passo**********" + descricaoPasso);
			System.out.println(e.getCause());
			System.out.println(e.getMessage());

		}

	}

	public void escrever(By elemento, String texto, String descricaoPasso) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("*******erro no passo**********" + descricaoPasso);
			System.out.println(e.getCause());
			System.out.println(e.getMessage());

		}

	}
	public void validarTexto(By elemento, String textoDesejado, String descricaoPasso) {
		try {
			String textoCapturado = driver.findElement(elemento).getText();
			assertTrue(textoCapturado.contains(textoDesejado));
		} catch (Exception e) {
			System.out.println("*******erro no passo**********" + descricaoPasso);
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
		
	}

	public void clicarPorNome(String valor, String descricaoPasso) {
		try {
			driver.findElement(By.xpath("//*[@id=\"mat-input-'" + valor + "']")).click();
		} catch (Exception e) {
			System.out.println("*******erro no passo**********" + descricaoPasso);
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}

	}

	public void escreverPorNome(String valor, String texto, String descricaoPasso) {
		try {
			driver.findElement(By.xpath("//*[@id=\"mat-input-" + valor + "\"]")).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("*******erro no passo**********" + descricaoPasso);
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
		
		// *[@id="mat-input-6"] nome
		// *[@id="mat-input-7"] data nascimento
		// *[@id="mat-input-8"] email
	}

	

	public void screenShot(String nomeEvidencia) {
		try {
			TakesScreenshot srcShot = (TakesScreenshot) driver;
			File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
			FileUtils.copyFile(srcFile, destFile);
		} catch (Exception e) {
			
		}
	}

	public void esperar(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			
		}

	}

	public void encerrarTeste() {
		driver.quit();
	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();

	}

	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");
	}

	public void login(String descricaoPasso) {
		try {
			driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
			driver.findElement(By.xpath("//span[text()='Clique aqui']")).click();
			driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("usuarioteste41@yahoo.com");
			driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("Teste123");
			driver.findElement(By.xpath("//span[text()='fazer login ']")).click();
		} catch (Exception e) {
			System.out.println("*******erro no passo**********" + descricaoPasso);
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}

	}

	public void selecionarPorVaga(String valor, String descricaoPasso) {
		try {
			driver.findElement(By.xpath(
					"//div[2]/div/div/app-root/app-private-layout/main/section/app-private-search/app-private-candidature-card/div/div["
							+ valor + "]/button"));
		} catch (Exception e) {
			System.out.println("*******erro no passo**********" + descricaoPasso);
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}

	}

	public void uploadArquivo(String descricaoPasso) {
		try {
			Robot robot = new Robot();
			robot.delay(1000);
			StringSelection ss = new StringSelection("C:\\Users\\Elias Silva\\Downloads\\curriculum.pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.delay(1000);
			robot.keyRelease(KeyEvent.VK_V);
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(2000);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			System.out.println("*******erro no passo**********" + descricaoPasso);
			System.out.println(e.getCause());
			System.out.println(e.getMessage());

		}
	}
}
