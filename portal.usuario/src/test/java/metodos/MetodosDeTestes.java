package metodos;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import coneccoes.DriversFactory;

public class MetodosDeTestes extends DriversFactory {
	

	public void clicar(By elemento) {
		driver.findElement(elemento).click(); 
		
	}
	
	public void clicarPorNome(String valor) {
	 driver.findElement(By.xpath("//*[@id=\"mat-input-'"+valor+"']")).click();
		
	}
	
	public void escreverPorNome(String valor, String texto) {
		 driver.findElement(By.xpath("//*[@id=\"mat-input-"+valor+"\"]")).sendKeys(texto);
		//*[@id="mat-input-6"] nome
		//*[@id="mat-input-7"] data nascimento
		//*[@id="mat-input-8"] email  
		}
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEsperado));
	}
	
	public void screenShot(String nomeEvidencia) throws IOException {
		TakesScreenshot srcShot = (TakesScreenshot) driver;
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/"+nomeEvidencia+".png");
		FileUtils.copyFile(srcFile, destFile);
	}
	
	public void esperar(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
		
	}
	
	public void encerrarTeste() {
		driver.quit();
	}
	public void submit(By elemento) {
		driver.findElement(elemento).submit();
		
	}
	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(" +n1+ "," +n2+ ")");
	} 
	public void selecionarArquivo(String path) throws InterruptedException 
	{

	    WebElement fileInput = driver.findElement(By.xpath("//div[@class='upload-container']"));
	    fileInput.sendKeys("/portal.usuario/CV/Teste QA - PIX (1) (4).pdf");
	}
	
	public void login() {
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		driver.findElement(By.xpath("//span[text()='Clique aqui']")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("usuarioteste41@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("Teste123");
		driver.findElement(By.xpath("//span[text()='fazer login ']")).click();
		
	}
	
	public void selecionarPorVaga(String valor) {
		driver.findElement(By.xpath("//div[2]/div/div/app-root/app-private-layout/main/section/app-private-search/app-private-candidature-card/div/div["+valor+"]/button"));
		
	}


}
