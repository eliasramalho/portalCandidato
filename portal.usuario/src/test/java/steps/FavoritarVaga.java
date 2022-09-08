package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTestes;

public class FavoritarVaga {
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Dado("que eu tenha feito uma busca por vaga")
	public void queEuTenhaFeitoUmaBuscaPorVaga() throws InterruptedException {
		metodos.login();
		metodos.esperar(5000);
		metodos.escrever(el.campoBuscaHome, "Analista");
		metodos.clicar(el.btnBuscar);

	}

	@Quando("clicar em favoritar")
	public void clicarEmFavoritar() throws InterruptedException {
		metodos.esperar(3000);
		metodos.clicar(el.favoritar);
		
	}

	@Entao("vaga favoritada com sucesso")
	public void vagaFavoritadaComSucesso() throws IOException, InterruptedException {

		metodos.validarTexto(el.favoritar, "");
		metodos.esperar(4000);
		metodos.screenShot("favoritar");
		metodos.encerrarTeste();
		

	}

}
