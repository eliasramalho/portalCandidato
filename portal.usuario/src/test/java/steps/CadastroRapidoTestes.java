package steps;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTestes;
import runner.Executa;

public class CadastroRapidoTestes {
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Dado("que eu esteja na tela de cadastro rapido")
	public void queEuEstejaNaTelaDeCadastroRapido() {
		Executa.IniciarTeste();
		metodos.clicar(el.cookies, "clicando nos cookeis");

	}

	@Quando("eu preencher os dados corretamente")
	public void euPreencherOsDadosCorretamente() {
		metodos.escrever(el.cRnomeCompleto, "teste cadastro rapido", "escrendo nome");
		metodos.escrever(el.cRnascimento, "16121986", "escrevendo data de nascimento");
		metodos.escrever(el.cRemail, "9hfc5@fknde.com", "preenchendo o email");
		metodos.escrever(el.cRsenha, "Teste123", "preenchendo a senha");

	}

	@Quando("incluir um curriculo")
	public void incluirUmCurriculo() {
		metodos.anexarCurriculo("anexando um curriculo");

	}

	@Quando("aceitar os termos e condicoes")
	public void aceitarOsTermosECondicoes() {
		metodos.aceitarTermos(null);
		metodos.esperar(2000);
		metodos.clicar(el.cRSalvarCadastro, "enviando curriculo");
		metodos.esperar(9000);

	}

	@Entao("sistema realiza o cadastro de usuario")
	public void sistemaRealizaOCadastroDeUsuario() {
		metodos.validarTexto(el.msgSucessoCriarConta, "Confirme sua conta no seu e-mail",
				"validando a mensagem de sucesso");
		metodos.screenShot("CT01-cadastro_rapido_sucesso");
		metodos.esperar(3000);
		metodos.encerrarTeste();

	}

	@Quando("nao preencher os campos")
	public void naoPreencherOsCampos() {
		metodos.clicar(el.cRnomeCompleto, "clicando no campo");
		metodos.clicar(el.cRsenha, "clicando no campo");
		metodos.clicar(el.cRemail, "clicando no campo");

	}

	@Entao("o sistema retorna a mensagem de erro")
	public void oSistemaRetornaAMensagemDeErro() {
		metodos.esperar(2000);
		metodos.validarTexto(el.msgErroNomeBranco, "", "validando nome em branco");
		metodos.screenShot("CT02-Cadastro_Rapido_em_branco");
		metodos.encerrarTeste();

	}

	@Quando("preencher o campo email")
	public void preencherOCampoEmail() {
		metodos.escrever(el.cRnomeCompleto, "teste email invalido", "preenchendo campo nome");
		metodos.escrever(el.cRemail, "test.com", "preenchendo o campo email");

	}

	@Quando("os dados forem invalidos")
	public void osDadosForemInvalidos() {
		metodos.clicar(el.cRsenha, "clicando no campo");

	}

	@Entao("o sistema retorna uma mensagem")
	public void oSistemaRetornaUmaMensagem() {
		metodos.esperar(2000);
		metodos.validarTexto(el.msgErroEmail, "Por favor, forneça um formato de Email válido",
				"validando msg de erro no email");
		metodos.screenShot("CT03-email_dados_invalidos");
		metodos.encerrarTeste();
	}

	@Quando("Preencher o campo data de nascimento")
	public void preencherOCampoDataDeNascimento() {
		metodos.escrever(el.cRnomeCompleto, "teste nascimento invalido", "preenhcendo nome");
		metodos.escrever(el.cRemail, "ta65@mdn6de.com", "preenchendo o email");
		metodos.escrever(el.cRsenha, "Teste123", "preenchendo a senha");
		metodos.anexarCurriculo("anexando um curriculo");
		metodos.aceitarTermos("acetando termos e condicoes");
		metodos.escrever(el.cRnascimento, "01012015", "preenchendo data com dados invalidos");

	}

	@Quando("Contem dados invalidos no campo")
	public void contemDadosInvalidosNoCampo() {

	}

	@Entao("O sistema retorna um modal com uma mensagem")
	public void oSistemaRetornaUmModalComUmaMensagem() {
		metodos.esperar(3000);
		metodos.validarTexto(el.idadeNaoPermitida, "Idade não permitida", "validando msg idade n permitida");
		metodos.screenShot("CT04-idade_nao_permitida");
		metodos.encerrarTeste();

	}

	@Quando("preencher os campos com dados corretos")
	public void preencherOsCamposComDadosCorretos() {
		metodos.escrever(el.cRnomeCompleto, "Usuario com menos de quatorze anos", "preenchendo nome");
		metodos.escrever(el.cRemail, "tak8d@dmo4de.com", "preenchendo o email");
		metodos.escrever(el.cRsenha, "Teste123", "preenchendo a senha");

	}

	@Quando("preencher idade inferior a quatorze anos")
	public void preencherIdadeInferiorAQuatorzeAnos() {
		metodos.escrever(el.cRnascimento, "16122017", "preenchendo data de nascimento");
		metodos.esperar(2000);

	}

	@Entao("o sistema retorna uma modal")
	public void oSistemaRetornaUmaModal() {
		metodos.validarTexto(el.idadeNaoPermitida, "Idade não permitida", "validando o modal de retorno");
		metodos.screenShot("CT05-usuario_menor_de_quatorze");
		metodos.encerrarTeste();

	}

	@Quando("preencher os dados do formulario corretamente")
	public void preencherOsDadosDoFormularioCorretamente() {
		metodos.escrever(el.cRnomeCompleto, "usuario menor de idade", "escrendo nome");
		metodos.escrever(el.cRnascimento, "01012008", "preenchendo idade");
		metodos.escrever(el.cRemail, "ta6@mdk4.com", "preenchendo o email");
		metodos.escrever(el.cRsenha, "Teste123", "preenchendo a senha");
		metodos.anexarCurriculo("anexando curriculo");
		metodos.aceitarTermos("aceitando os termos");
		metodos.clicar(el.cRSalvarCadastro, "enviando cadastro");

	}

	@Quando("preencher modal de validacao de usuaario")
	public void preencherModalDeValidacaoDeUsuaario() {
		metodos.esperar(3000);
		metodos.escrever(el.nomeResponsavel, "teste responsavel", "nome do responsdavel");
		metodos.escrever(el.emailResponsavel, "dfidkw@g4ail.com", "email do responsavel");
		metodos.esperar(3000);
		metodos.clicar(el.btnProsseguir, "prosseguindo");
		metodos.esperar(5000);

	}

	@Entao("usuario de menor cadastrado com sucesso")
	public void usuarioDeMenorCadastradoComSucesso() {
		metodos.validarTexto(el.msgSucessoCriarConta, "Confirme sua conta no seu e-mail", "validando msg de sucesso");
		metodos.screenShot("CT06-sucesso_usuario_menor_quatorze");
		metodos.encerrarTeste();

	}

	@Quando("preencher a idade do usuario menor que quatorze anos")
	public void preencherAIdadeDoUsuarioMenorQueQuatorzeAnos() {
		metodos.escrever(el.cRnomeCompleto, "usuario menoir de idade", "escrendo nome");
		metodos.escrever(el.cRnascimento, "01012008", "preenchendo idade");
		metodos.escrever(el.cRemail, "tal4i@eodke.com", "preenchendo o email");
		metodos.escrever(el.cRsenha, "Teste123", "preenchendo a senha");
		metodos.anexarCurriculo("anexando curriculo");
		metodos.aceitarTermos("aceitandos os termos");
		metodos.clicar(el.cRSalvarCadastro, "enviando cadastro");
		metodos.esperar(5000);

	}

	@Quando("deixar os campos do modal em branco")
	public void deixarOsCamposDoModalEmBranco() {
		metodos.clicar(el.nomeResponsavel, "clicando para mostrar o erro");
		metodos.clicar(el.emailResponsavel, "clicando para mostrar o erro");
		metodos.clicar(el.nomeResponsavel, "clicando para mostrar o erro");
		metodos.esperar(2000);

	}

	@Entao("validamos o retorno do sistema nos campos com erro")
	public void validamosORetornoDoSistemaNosCamposComErro() {
		metodos.screenShot("CT07-modal_campo_em_branco");
		metodos.encerrarTeste();

	}

	@Quando("acessar o modal")
	public void acessarOModal() {
		metodos.escrever(el.cRnomeCompleto, "menor de idade nome validacao nome em branco", "escrendo nome");
		metodos.escrever(el.cRnascimento, "01012008", "preenchendo idade");
		metodos.escrever(el.cRemail, "t4l42@mkdeoe.com", "preenchendo o email");
		metodos.escrever(el.cRsenha, "Teste123", "preenchendo a senha");
		metodos.anexarCurriculo("anexando curriculo");
		metodos.aceitarTermos("aceitando os termos");
		metodos.clicar(el.cRSalvarCadastro, "enviando cadastro");
		metodos.esperar(5000);

	}

	@Quando("preencher campo nome com dados invalidos")
	public void preencherCampoNomeComDadosInvalidos() {
		metodos.escrever(el.emailResponsavel, "test@tetse.com", "email responsavel");
		metodos.escrever(el.nomeResponsavel, "12e", "escrevendo nome invalido");
		metodos.clicar(el.btnProsseguir, "clicando no botao prosseguir");
		metodos.escrever(el.nomeResponsavel, " ", "");
		metodos.esperar(2000);

	}

	@Entao("sistema informa erro nos campos")
	public void sistemaInformaErroNosCampos() {
		
		metodos.screenShot("CT08-modal_nome_invalido");
		metodos.encerrarTeste();

	}

	@Quando("acessar o modal de validacao")
	public void acessarOModalDeValidacao() {
		metodos.escrever(el.cRnomeCompleto, "menor de idade email invalido", "escrendo nome");
		metodos.escrever(el.cRnascimento, "01012008", "preenchendo idade");
		metodos.escrever(el.cRemail, "tk4ldi@moe.com", "preenchendo o email");
		metodos.escrever(el.cRsenha, "Teste123", "preenchendo a senha");
		metodos.anexarCurriculo("anexando curriculo");
		metodos.clicar(el.cRtermos, "aceitando termos");
		metodos.esperar(1000);
		metodos.clicar(el.cRLiEConcordo, "clicando em entendi");
		metodos.esperar(1000);
		metodos.clicar(el.cRaviso, "aceitando aviso de privacidade");
		metodos.clicar(el.cRSalvarCadastro, "enviando cadastro");
		metodos.esperar(2000);

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
		metodos.validarTexto(el.msgErroEmail, "Por favor, forneça um formato de Email válido",
				"validando msg de erro no email");
		metodos.screenShot("CT09-modal_email_invalido");
		metodos.encerrarTeste();

	}

	@Quando("preencher os campos")
	public void preencherOsCampos() {
		metodos.escrever(el.cRnomeCompleto, "teste senha sem numeral", "escrevendo nome");
		metodos.escrever(el.cRnascimento, "16121986", "escrevendo data de nascimento");
		metodos.escrever(el.cRemail, "taa6d4496@minode.com", "preenchendo o email");

	}

	@Quando("no campo senha faltarem os numerais")
	public void noCampoSenhaFaltaremOsNumerais() {
		metodos.escrever(el.cRsenha, "TesteTeste", "preenchendo a senha sem numeral");
		metodos.esperar(1000);

	}

	@Entao("o sistema retorna uma mensagem de aviso")
	public void oSistemaRetornaUmaMensagemDeAviso() {
		metodos.validarTexto(el.msgSenhaNumeral, "Pelo menos um Número ou Símbolo", "validando senha sem numeral");
		metodos.screenShot("CT10-senha_sem_numeral");
		metodos.encerrarTeste();

	}

	@Quando("colocar nos dados nos campos")
	public void colocarNosDadosNosCampos() {
		metodos.escrever(el.cRnomeCompleto, "teste senha sem numeral", "escrevendo nome");
		metodos.escrever(el.cRnascimento, "16121986", "escrevendo data de nascimento");
		metodos.escrever(el.cRemail, "tlk8@minoe.com", "preenchendo o email");

	}

	@Quando("no campo senha faltare a letra aminuscula")
	public void noCampoSenhaFaltareALetraAminuscula() {
		metodos.escrever(el.cRsenha, "TESTE1234", "preenchendo a senha minuscula");
		metodos.esperar(2000);

	}

	@Entao("validamos a mesagem de retorno do sistema")
	public void validamosAMesagemDeRetornoDoSistema() {
		metodos.validarTexto(el.msgSenhaMinuscula, "Pelo menos uma Letra Minúscula", "validando senha sem minuscula");
		metodos.screenShot("CT11-senha_sem_minuscula");
		metodos.encerrarTeste();

	}

	@Quando("preencher os campos com dados")
	public void preencherOsCamposComDados() {
		metodos.escrever(el.cRnomeCompleto, "teste senha sem numeral", "escrevendo nome");
		metodos.escrever(el.cRnascimento, "16121986", "escrevendo data de nascimento");
		metodos.escrever(el.cRemail, "4k0ljd6@mrnoe.com", "preenchendo o email");

	}

	@Quando("no campo senha faltar a letra maiuscula")
	public void noCampoSenhaFaltarALetraMaiuscula() {
		metodos.escrever(el.cRsenha, "teste1234", "preenchendo a senha maiuscula");
		metodos.esperar(1000);

	}

	@Entao("o sistema avisa o erro no campo senha")
	public void oSistemaAvisaOErroNoCampoSenha() {
		metodos.validarTexto(el.msgSenhaMaiuscula, "Pelo menos uma Letra Maiúscula", "validando senha sem maiuscula");
		metodos.screenShot("CT12-senha_sem_maiuscula");
		metodos.encerrarTeste();

	}

	@Quando("preencher todos os campos")
	public void preencherTodosOsCampos() {
		metodos.escrever(el.cRnomeCompleto, "teste senha sem numeral", "escrevendo nome");
		metodos.escrever(el.cRnascimento, "16121986", "escrevendo data de nascimento");
		metodos.escrever(el.cRemail, "tadk96@m4rpod.com", "preenchendo o email");

	}

	@Quando("no campo senha nao inserir os oito caracteres")
	public void noCampoSenhaNaoInserirOsOitoCaracteres() {
		metodos.escrever(el.cRsenha, "Teste12", "senha sem os oito caracteres");
		metodos.esperar(2000);

	}

	@Entao("sistema retorna uma mensagem com um aviso no campo")
	public void sistemaRetornaUmaMensagemComUmAvisoNoCampo() {
		metodos.validarTexto(el.msgSenhaOito, "Pelo menos Oito Caracteres", "validando senha sem oito caracteres");
		metodos.screenShot("CT13-senha_sem_oito_caracteres");
		metodos.encerrarTeste();

	}

	@Quando("preencher os campos com dados validos")
	public void preencherOsCamposComDadosValidos() {
		metodos.escrever(el.cRnomeCompleto, "cadastro sem aceitar termos", "escrendo nome");
		metodos.escrever(el.cRnascimento, "01012008", "preenchendo idade");
		metodos.escrever(el.cRemail, "tk4ld485i@meo.com", "preenchendo o email");
		metodos.escrever(el.cRsenha, "Teste123", "preenchendo a senha");

	}

	@Quando("nao aceitar os termos de uso e condicoes")
	public void naoAceitarOsTermosDeUsoECondicoes() {
		metodos.anexarCurriculo("anexando curriculo");
		metodos.clicar(el.cRSalvarCadastro, "enviando cadastro");
		metodos.esperar(2000);

	}

	@Entao("sistema nao permite avancar no cadastro")
	public void sistemaNaoPermiteAvancarNoCadastro() {
		metodos.esperar(1000);
		metodos.screenShot("CT14-nao_aceitar_termos");
		metodos.encerrarTeste();

	}

}
