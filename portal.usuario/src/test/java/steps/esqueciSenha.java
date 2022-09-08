package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.MetodosDeTestes;

public class esqueciSenha {
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Given("que esteja no menu de login")
	public void queEstejaNoMenuDeLogin() {
		metodos.clicar(el.cookies);
		metodos.clicar(el.cliqueAqui);

	}

	@When("clicar no botao esqueci senha")
	public void clicarNoBotaoEsqueciSenha() {
		//metodos.clicar(el.esqueciSenha);

	}

	@Then("valido se o sistema abre guia para recuperacao de conta")
	public void validoSeOSistemaAbreGuiaParaRecuperacaoDeConta() throws IOException, InterruptedException {
		metodos.esperar(3000);
		metodos.escrever(el.emailEsqueciSenha, "teste");
		metodos.validarTexto(el.emailEsqueciSenha, "");
		metodos.screenShot("esqueci_Senha");
		metodos.encerrarTeste();

	}

}
