package steps;

import org.openqa.selenium.By;

import coneccoes.DriversFactory;
import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTestes;

public class EasyApply extends DriversFactory{
	
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();
	

	@Dado("que eu esteja no menu de cadidatura rapida")
	public void queEuEstejaNoMenuDeCadidaturaRapida() {
		metodos.escrever(el.nomeEasy, "Usuario teste ");
		metodos.escrever(el.dataEasy, "16121986");
		metodos.escrever(el.emailEasy, "novix88008@yasiok.com");
		metodos.escrever(el.senhaEasy, "Teste123");

	}

	@Quando("preenhcer os dados corretamente")
	public void preenhcerOsDadosCorretamente() throws InterruptedException {
		//metodos.selecionarArquivo("/portal.usuario/CV/Teste QA - PIX (1) (4).pdf");
		driver.findElement(By.xpath("//div[@class='upload-container']")).sendKeys("./CV/Teste QA - PIX (1) (4).pdf");

	}

	@Quando("clicar no botao enviar meu cv")
	public void clicarNoBotaoEnviarMeuCv() {

	}

	@Quando("clicar na pergunta filtro")
	public void clicarNaPerguntaFiltro() {

	}

	@Entao("candidatura enviada com sucesso")
	public void candidaturaEnviadaComSucesso() {

	}

}
