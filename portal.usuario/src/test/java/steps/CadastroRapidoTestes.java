package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTestes;

public class CadastroRapidoTestes {
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
		metodos.escrever(el.cRemail, "tanaka6630496@moenode.com", "preenchendo o email");
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
		metodos.clicar(el.cREntendi, "clicando em entendi");
		metodos.clicar(el.cRaviso, "aceitando aviso de privacidade");
		metodos.clicar(el.cRSalvarCadastro, "enviando curriculo");
		metodos.esperar(5000);

	}

	@Entao("sistema realiza o cadastro de usuario")
	public void sistemaRealizaOCadastroDeUsuario() throws IOException {
		metodos.validarTexto(el.leveParaLogin, "", "validando a mensagem de sucesso");
		metodos.screenShot("cadastro_rapido_sucesso");
		metodos.esperar(3000);

	}

	@Quando("nao preencher os campos")
	public void naoPreencherOsCampos() {
		metodos.clicar(el.cookies, "aceitando os cookies");
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
		metodos.escrever(el.cRnomeCompleto, "Usuario com menos de quatorze anos", "preenchendo nome");

	}

	@Quando("preencher idade inferior a quatorze anos")
	public void preencherIdadeInferiorAQuatorzeAnos() {
		metodos.escrever(el.cRnascimento, "16122015", "preenchendo data de nascimento");
		metodos.esperar(2000);

	}

	@Entao("o sistema retorna uma modal")
	public void oSistemaRetornaUmaModal() {
		metodos.validarTexto(el.nomeResponsavel, "", "validando o modal de retorno");
		metodos.screenShot("usuario_menor_de_quatorze");
		metodos.encerrarTeste();

	}

	@Quando("preencher os dados do formulario corretamente")
	public void preencherOsDadosDoFormularioCorretamente() {
		metodos.escrever(el.cRnascimento, "16122015", "escrevendo data de nascimento");
		metodos.esperar(1000);
		metodos.escrever(el.nomeResponsavel, "Tutor do Usuario Teste", "preenchendo nome do responsavel");
		metodos.escrever(el.emailResponsavel, "test1246878243@teste.com", "preenchendo email do responsavel");
		metodos.esperar(1000);
		metodos.clicar(el.btnProsseguir, "clicando no botao prosseguir");
		metodos.esperar(1000);

	}

	@Quando("preencher modal de validacao de usuaario")
	public void preencherModalDeValidacaoDeUsuaario() {
		metodos.escrever(el.cRnomeCompleto, "teste cadastro rapido", "escrendo nome");
		metodos.escrever(el.cRemail, "tanaka6205446@moenode.com", "preenchendo o email");
		metodos.escrever(el.cRsenha, "Teste123", "preenchendo a senha");
		metodos.clicar(el.cRCurriculo, "clicando no upload de curriculo");
		metodos.esperar(1000);
		metodos.uploadArquivo("anexando curriculo");
		metodos.clicar(el.cRtermos, "aceitando termos");
		metodos.esperar(2000);
		metodos.clicar(el.cREntendi, "clicando em entendi");
		metodos.esperar(1000);
		metodos.clicar(el.cRaviso, "aceitando aviso de privacidade");
	}

	@Entao("usuario de menor cadastrado com sucesso")
	public void usuarioDeMenorCadastradoComSucesso() {
		metodos.clicar(el.cRSalvarCadastro, "clicando no bota salvar cadastro");
		metodos.screenShot("sucesso_usuario_menor_quatorze");
		

	}

	@Quando("preencher a idade do usuario menor que quatorze anos")
	public void preencherAIdadeDoUsuarioMenorQueQuatorzeAnos() {
		metodos.escrever(el.cRnascimento, "16122025", "preenchendo campo data de nascimento");

	}

	@Quando("deixar os campos do modal em branco")
	public void deixarOsCamposDoModalEmBranco() {
		metodos.clicar(el.nomeResponsavel, "clicando para mostrar o erro dese");
		metodos.esperar(2000);

	}

	@Entao("validamos o retorno do sistema nos campos com erro")
	public void validamosORetornoDoSistemaNosCamposComErro() {
		metodos.validarTexto(el.btnProsseguir, "", "clicando no botao prosseguir");
		metodos.screenShot("modal_campo_em_branco");
		

	}

	@Quando("acessar o modal")
	public void acessarOModal() {
		metodos.escrever(el.cRnascimento, "16122015", "acessando modal de validacao");

	}

	@Quando("preencher campo nome com dados invalidos")
	public void preencherCampoNomeComDadosInvalidos() {
		metodos.escrever(el.emailResponsavel, "test@tetse.com", "emal responsavel");
		metodos.escrever(el.nomeResponsavel, "123e", "escrevendo nome invalido");
		metodos.clicar(el.btnProsseguir, "clicando no botao prosseguir");
		metodos.escrever(el.nomeResponsavel, " ", "");
		metodos.esperar(2000);

	}

	@Entao("sistema informa erro nos campos")
	public void sistemaInformaErroNosCampos() {
		metodos.validarTexto(el.msgErroNome, "", "validando a msg de erro do sistema");
		metodos.screenShot("modal_nome_invalido");

		

	}

	@Quando("acessar o modal de validacao")
	public void acessarOModalDeValidacao() {
		metodos.escrever(el.cRnascimento, "16122015", "acessando modal de validacao");

	}

	@Quando("preencher o email com dados incorretos")
	public void preencherOEmailComDadosIncorretos() {
		metodos.escrever(el.nomeResponsavel, "teste email invalido", "escrevendo nome");
		metodos.escrever(el.emailResponsavel, "tes.com", "escrevendo email invalido");
		metodos.clicar(el.btnProsseguir, "clicando no botao prosseguir");
		metodos.esperar(2000);

	}

	@Entao("validamos se o sistema informa erro nos campos")
	public void validamosSeOSistemaInformaErroNosCampos() {
		metodos.validarTexto(el.msgErroEmail, "", "validando msg de erro no email");
		metodos.screenShot("modal_email_invalido");

	}

	@Quando("preencher os campos")
	public void preencherOsCampos() {
		metodos.escrever(el.cRnomeCompleto, "teste senha sem numeral", "escrevendo nome");
		metodos.escrever(el.cRnascimento, "16121986", "escrevendo data de nascimento");
		metodos.escrever(el.cRemail, "tanaka6658496@mirnode.com", "preenchendo o email");
		

	}

	@Quando("no campo senha faltarem os numerais")
	public void noCampoSenhaFaltaremOsNumerais() {
		metodos.escrever(el.cRsenha, "TesteTeste", "preenchendo a senha sem numeral");
		metodos.esperar(1000);

	}

	@Entao("o sistema retorna uma mensagem de aviso")
	public void oSistemaRetornaUmaMensagemDeAviso() {
		metodos.validarTexto(el.msgSenhaNumeral, "", "validando senha sem numeral");
		metodos.screenShot("senha_sem_numeral");
		

	}

	@Quando("colocar nos dados nos campos")
	public void colocarNosDadosNosCampos() {
		metodos.escrever(el.cRnomeCompleto, "teste senha sem numeral", "escrevendo nome");
		metodos.escrever(el.cRnascimento, "16121986", "escrevendo data de nascimento");
		metodos.escrever(el.cRemail, "tanaka6058496@mirnode.com", "preenchendo o email");
		

	}

	@Quando("no campo senha faltare a letra aminuscula")
	public void noCampoSenhaFaltareALetraAminuscula() {
		metodos.escrever(el.cRsenha, "TESTE1234", "preenchendo a senha minuscula");
		metodos.esperar(1000);

	}

	@Entao("validamos a mesagem de retorno do sistema")
	public void validamosAMesagemDeRetornoDoSistema() {
		metodos.validarTexto(el.msgSenhaMinuscula, "", "validando senha sem minuscula");
		metodos.screenShot("senha_sem_minuscula");

	}

	@Quando("preencher os campos com dados")
	public void preencherOsCamposComDados() {
		metodos.escrever(el.cRnomeCompleto, "teste senha sem numeral", "escrevendo nome");
		metodos.escrever(el.cRnascimento, "16121986", "escrevendo data de nascimento");
		metodos.escrever(el.cRemail, "tanaka605834496@mirnode.com", "preenchendo o email");
		

	}

	@Quando("no campo senha faltar a letra maiuscula")
	public void noCampoSenhaFaltarALetraMaiuscula() {
		metodos.escrever(el.cRsenha, "teste1234", "preenchendo a senha maiuscula");
		metodos.esperar(1000);

	}

	@Entao("o sistema avisa o erro no campo senha")
	public void oSistemaAvisaOErroNoCampoSenha() {
		metodos.validarTexto(el.msgSenhaMaiuscula, "", "validando senha sem maiuscula");
		metodos.screenShot("senha_sem_maiuscula");

	}

	@Quando("preencher todos os campos")
	public void preencherTodosOsCampos() {
		metodos.escrever(el.cRnomeCompleto, "teste senha sem numeral", "escrevendo nome");
		metodos.escrever(el.cRnascimento, "16121986", "escrevendo data de nascimento");
		metodos.escrever(el.cRemail, "tana496@mirpode.com", "preenchendo o email");
		

	}

	@Quando("no campo senha nao inserir os oito caracteres")
	public void noCampoSenhaNaoInserirOsOitoCaracteres() {
		metodos.escrever(el.cRsenha, "Teste12", "senha sem os oito caracteres");
		metodos.esperar(1000);

	}

	@Entao("sistema retorna uma mensagem com um aviso no campo")
	public void sistemaRetornaUmaMensagemComUmAvisoNoCampo() {
		metodos.validarTexto(el.msgSenhaOito, "", "validando senha sem oito caracteres");
		metodos.screenShot("senha_sem_oito_caracteres");

	}

	@Quando("preencher os campos com dados validos")
	public void preencherOsCamposComDadosValidos() {
		metodos.escrever(el.cRnomeCompleto, "teste cadastro rapido", "escrendo nome");
		metodos.escrever(el.cRemail, "tanasa60546@mokode.com", "preenchendo o email");
		metodos.escrever(el.cRsenha, "Teste123", "preenchendo a senha");
		
	}

	@Quando("nao aceitar os termos de uso e condicoes")
	public void naoAceitarOsTermosDeUsoECondicoes() {
		metodos.clicar(el.cRCurriculo, "clicando no upload de curriculo");
		metodos.esperar(1000);
		metodos.uploadArquivo("anexando curriculo");

	}

	@Entao("sistema nao permite avancar no cadastro")
	public void sistemaNaoPermiteAvancarNoCadastro() {
		metodos.esperar(1000);
		metodos.screenShot("nao_aceitar_termos");
		

	}

}
