package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTestes;

public class MeCandidatar {
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Dado("que eu tenha feita uma busca com sucesso")
	public void queEuTenhaFeitaUmaBuscaComSucesso() throws InterruptedException {
		metodos.login();
		metodos.esperar(4000);
		metodos.escrever(el.campoBuscaHome, "Analista");
		metodos.clicar(el.btnBuscar);

	}

	@Quando("clicar na vaga desejada")
	public void clicarNaVagaDesejada() throws InterruptedException {
		metodos.esperar(3000);
		metodos.clicar(el.resultadoBusca);

	}

	@Quando("clicar em se candidatar")
	public void clicarEmSeCandidatar() {
		metodos.clicar(el.seCandidatar);

	}

	@Quando("clicar em confirmar candidatura")
	public void clicarEmConfirmarCandidatura() throws InterruptedException {
		metodos.esperar(3000);
		metodos.clicar(el.confCandidatura);

	}

	@Entao("valido a mensagem do sistema")
	public void validoAMensagemDoSistema() throws IOException, InterruptedException {
		metodos.esperar(5000);
		metodos.screenShot("candidatura_sucesso");
		
		metodos.encerrarTeste();

	}

}
