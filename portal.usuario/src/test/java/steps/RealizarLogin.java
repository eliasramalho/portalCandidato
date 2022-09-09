package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTestes;

public class RealizarLogin{
	
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();
	

	@Dado("que eu esteja no menu login")
	public void queEuEstejaNoMenuLogin() {
		metodos.clicar(el.cliqueAqui);
	    
	}
	@Dado("preencher os campos email e senha")
	public void preencherOsCamposEmailESenha() {
		metodos.escrever(el.email, "usuarioteste41@yahoo.com");
		metodos.escrever(el.senha, "Teste123");
	    
	}
	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
		metodos.clicar(el.btnFazerLogin);
	    
	}
	@Entao("login realizado com sucesso")
	public void loginRealizadoComSucesso() throws IOException, InterruptedException {
		metodos.esperar(4000);
		metodos.screenShot("login_sucesso");
		
		metodos.encerrarTeste();
		
		
	    
	}




}
