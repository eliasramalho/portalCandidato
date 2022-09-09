
@recContaEmailValido
Feature: recuperar senha
  Eu como usuario quero recuperar a senha para ter acesso ao portal

  
  Scenario: Recuperar senha com email valido
    Given Que eu esteja no menu de recuperar conta
    When Preencher com um email valido
    Then Sistema retorna uma mensagem de aviso

 
