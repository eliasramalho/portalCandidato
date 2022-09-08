package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.MetodosDeTestes;

public class RecContaEmailValido{

	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Given("Que eu esteja no menu de recuperar conta")
	public void queEuEstejaNoMenuDeRecuperarConta() {
		metodos.clicar(el.cliqueAqui);
		metodos.clicar(el.esqueciSenha);

	}

	@When("Preencher com um email valido")
	public void preencherComUmEmailValido() {
		metodos.escrever(el.emailEsqueciSenha, "usuarioteste41@yahoo.com");
		metodos.clicar(el.recuperarSenha);

	}

	@Then("Sistema retorna uma mensagem de aviso")
	public void sistemaRetornaUmaMensagemDeAviso() throws InterruptedException, IOException {
		metodos.esperar(3000);
		metodos.validarTexto(el.voltar, "");
		metodos.screenShot("recConta_sucesso");
		metodos.encerrarTeste();
		
		
	}

}
