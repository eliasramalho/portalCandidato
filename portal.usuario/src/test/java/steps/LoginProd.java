package steps;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTestes;

public class LoginProd {
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Dado("Que eu esteja no menu home")
	public void queEuEstejaNoMenuHome() throws InterruptedException {
		metodos.esperar(3000);
		metodos.clicar(el.cookies);
		metodos.escrever(el.emailProd, "usuarioteste41@yahoo.com");

	}

	@Quando("Preencher email e senha")
	public void preencherEmailESenha() {
		metodos.escrever(el.senhaProd, "Teste123");

	}

	@Quando("Clicar no botao fazer login")
	public void clicarNoBotaoFazerLogin() {
		metodos.clicar(el.fazerLoginPtod);

	}

	@Entao("Login realizado com sucesso")
	public void loginRealizadoComSucesso() {
		metodos.clicar(el.btnPerfil);

	}

}
