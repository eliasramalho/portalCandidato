package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTestes;

public class CamposEmBranco {
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Dado("que eu esteja no menu de login")
	public void queEuEstejaNoMenuDeLogin() {
		metodos.clicar(el.cookies);
		metodos.clicar(el.cliqueAqui);
		
	}

	@Quando("deixar os campos em branco")
	public void deixarOsCamposEmBranco() {
		metodos.escrever(el.email,"");
		metodos.escrever(el.senha, "");
	
	}

	@Quando("clicar no botao fazer login")
	public void clicarNoBotaoFazerLogin() throws InterruptedException {
		metodos.esperar(3000);
		

	}

	@Quando("o botao nao esta clicavel")
	public void oBotaoNaoEstaClicavel() {
		

	}

	@Entao("validamos a mensagem de aviso")
	public void validamosAMensagemDeAviso() throws IOException {
		metodos.validarTexto(el.email, "");
		metodos.screenShot("campos_em_branco");
		metodos.encerrarTeste();

	}

}
