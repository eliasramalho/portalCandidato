package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTestes;

public class cadastroRapidoTestes {
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Dado("que eu esteja na tela de cadastro rapido")
	public void queEuEstejaNaTelaDeCadastroRapido() {
		metodos.clicar(el.cookies, "clicando nos cookeis");

	}

	@Quando("eu preencher os dados corretamente")
	public void euPreencherOsDadosCorretamente() {
		metodos.escrever(el.cRnomeCompleto, "teste cadastro rapido", "escrendo nome");
		metodos.escrever(el.cRnascimento, "16121986", "escrevendo data de nascimento");
		metodos.escrever(el.cRemail, "tanaka36366896@moenode.com", "preenchendo o email");
		metodos.escrever(el.cRsenha, "Teste123", "preenchendo a senha");

	}

	@Quando("incluir um curriculo")
	public void incluirUmCurriculo() throws InterruptedException {
		metodos.clicar(el.cRCurriculo, "clicando no upload de curriculo");
		metodos.esperar(1000);
		metodos.uploadArquivo("anexando curriculo");

	}

	@Quando("aceitar os termos e condicoes")
	public void aceitarOsTermosECondicoes() throws InterruptedException {
		metodos.clicar(el.cRtermos, "aceitando termos");
		metodos.esperar(2000);
		metodos.clicar(el.cREntendi,"clicando em entendi");
		metodos.clicar(el.cRaviso, "aceitando aviso de privacidade");
		metodos.clicar(el.cRSalvarCadastro, "enviando curriculo");
		metodos.esperar(5000);

	}

	@Entao("sistema realiza o cadastro de usuario")
	public void sistemaRealizaOCadastroDeUsuario() throws IOException {
		metodos.validarTexto(el.leveParaLogin, "", "validando a mensagem de sucesso");
		metodos.screenShot("cadastro_rapido_sucesso");
		metodos.encerrarTeste();

	}

	@Quando("nao preencher os campos")
	public void naoPreencherOsCampos() {
		metodos.clicar(el.cookies,"aceitando os cookies");
		metodos.clicar(el.cRnomeCompleto, "clicando no campo");
		metodos.clicar(el.cRsenha, "clicando no campo");
		metodos.clicar(el.cRemail, "clicando no campo");

	}

	@Entao("o sistema retorna a mensagem de erro")
	public void oSistemaRetornaAMensagemDeErro() throws IOException, InterruptedException {
		metodos.esperar(1000);
		metodos.screenShot("Cadastro_Rapido_em_branco");
		metodos.encerrarTeste();

	}

	@Quando("preencher o campo email")
	public void preencherOCampoEmail() {
		metodos.clicar(el.cookies, "aceitando os cookies");

	}

	@Quando("os dados forem invalidos")
	public void osDadosForemInvalidos() {
		metodos.escrever(el.cRemail, "test.com", "preenchendo o campo email");
		metodos.clicar(el.cRsenha, "clicando no campo");

	}

	@Entao("o sistema retorna uma mensagem")
	public void oSistemaRetornaUmaMensagem() throws InterruptedException, IOException {
		metodos.esperar(2000);
		metodos.screenShot("email_dados_invalidos");
		metodos.encerrarTeste();
	}

	@Quando("Preencher o campo data de nascimento")
	public void preencherOCampoDataDeNascimento() {
		metodos.clicar(el.cookies, "aceitando os cookies");

	}

	@Quando("Contem dados invalidos no campo")
	public void contemDadosInvalidosNoCampo() {
		metodos.escrever(el.cRnascimento, "00002999", "preenchendo data com dados invalidos");

	}

	@Entao("O sistema retorna um modal com uma mensagem")
	public void oSistemaRetornaUmModalComUmaMensagem() throws IOException, InterruptedException {
		metodos.esperar(2000);
		metodos.screenShot("idade_nao_permitida");
		metodos.encerrarTeste();

	}

	@Quando("preencher os campos com dados corretos")
	public void preencherOsCamposComDadosCorretos() {
		metodos.escrever(el.cRnomeCompleto, "teste cadastro rapido", "preenchendo nome");
		metodos.escrever(el.cRnascimento, "16122015", "preenchendo data de nascimento");
		metodos.escrever(el.cRemail, "tanaka36226896@moenode.com", "preenchendo email");
		

	}

	@Quando("usuario for menor de quatorze anos")
	public void usuarioForMenorDeQuatorzeAnos(){
		metodos.escrever(el.cRsenha, "Teste123", "preenchendo a senha");
		metodos.clicar(el.cRCurriculo, "clicando para anexar um curriculo");
		metodos.esperar(1000);
		metodos.uploadArquivo("anexando curriculo");

	}

	@Quando("enviar o curriculo")
	public void enviarOCurriculo() {
		metodos.clicar(el.cRtermos, "clicando nos termos de uso");
		metodos.esperar(2000);
		metodos.clicar(el.cREntendi, "aceitando os termos de uso");
		metodos.clicar(el.cRaviso, "aceitando aviso de privacidade");
		metodos.clicar(el.cRSalvarCadastro, "enviando curriculo");
		metodos.esperar(5000);
	

	}

	@Entao("o sistema retorna uma modal")
	public void oSistemaRetornaUmaModal(){
		metodos.validarTexto(el.nomeResponsavel, "", "validando o modal de retorno");
		metodos.screenShot("usuario_menor_de_quatorze");
		metodos.encerrarTeste();
		

	}

}
