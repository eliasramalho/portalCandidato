package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.MetodosDeTestes;

public class RecContaEmailInvalido {
	
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Given("que eu esteja no menu de recuperar conta")
	public void queEuEstejaNoMenuDeRecuperarConta() {
		metodos.clicar(el.cliqueAqui);
		metodos.clicar(el.esqueciSenha);

	}

	@When("preencher o campo email com dados invalidos")
	public void preencherOCampoEmailComDadosInvalidos() {
		metodos.escrever(el.emailEsqueciSenha, "teste@teste.c");

	}

	@When("clicar em recuperar senha")
	public void clicarEmRecuperarSenha(){
		
		metodos.clicar(el.recuperarSenha);

	}

	@Then("validamos a mensagem de retorno")
	public void validamosAMensagemDeRetorno() throws IOException, InterruptedException {
		metodos.esperar(4000);
		metodos.screenShot("nenhuma_conta_encontrada");
		metodos.encerrarTeste();
	}

}
