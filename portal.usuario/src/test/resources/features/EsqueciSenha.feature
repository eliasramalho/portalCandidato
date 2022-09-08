@esqueciSenha
Feature: Esqueci senha
Como usuario quero recuperar minha senha 

  @testeRapido
  Scenario: Esqueci senha
    Given que esteja no menu de login
    When clicar no botao esqueci senha
    Then valido se o sistema abre guia para recuperacao de conta
