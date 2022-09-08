package steps;

import java.io.IOException;

import coneccoes.DriversFactory;
import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.MetodosDeTestes;

public class realizarBusca extends DriversFactory{

	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Given("Que eu esteja no perfil do usuario")
	public void queEuEstejaNoPerfilDoUsuario() throws InterruptedException {
		metodos.clicar(el.cliqueAqui);
		metodos.escrever(el.email, "usuarioteste41@yahoo.com");
		metodos.escrever(el.senha, "Teste123");
		metodos.clicar(el.btnFazerLogin);
		metodos.esperar(5000);
		

	}

	@When("Preencher o campo de pesquisa")
	public void preencherOCampoDePesquisa(){
		metodos.escrever(el.campoBuscaHome, "analista");
				

	}

	@When("E clicar em buscar")
	public void eClicarEmBuscar() {
		metodos.clicar(el.btnBuscar);
		


	}

	@Then("Valido a resposta do sistema")
	public void validoARespostaDoSistema() throws InterruptedException, IOException {
		
		metodos.validarTexto(el.analista, "Analista de Desenvolvimento Pleno");

		metodos.esperar(3000);
		metodos.screenShot("busc_sucess0");
		metodos.encerrarTeste();
	}

}
