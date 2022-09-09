@recuperarContaEmailInvalido
Feature: Recuperar Conta
 Como usuario quero preencher os dados do campo email

  @testerapido
  Scenario:  Menu Recuperar Conta com email invalido

  Given que eu esteja no menu de recuperar conta
  When preencher o campo email com dados invalidos
  And clicar em recuperar senha
  Then validamos a mensagem de retorno
  