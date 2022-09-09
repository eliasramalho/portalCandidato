package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.MetodosDeTestes;

public class EmailInvalido {
	
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Given("Que eu esteja no menu login")
	public void queEuEstejaNoMenuLogin() {
		metodos.clicar(el.cookies);
		metodos.clicar(el.cliqueAqui);
		
	}

	@When("Preencher o campo email")
	public void preencherOCampoEmail() {
		metodos.escrever(el.email, "teste.com");
		metodos.escrever(el.senha, "teste123");
		metodos.clicar(el.mostrarSenha);

	}

	@When("Os dados forem invalidos")
	public void osDadosForemInvalidos() {
		

	}

	@Then("Validamos a mensagem de retorno")
	public void validamosAMensagemDeRetorno() throws IOException, InterruptedException {
		metodos.validarTexto(el.email, "");
		metodos.esperar(1000);
		metodos.screenShot("email_invalido");
		metodos.encerrarTeste();

	}

}
