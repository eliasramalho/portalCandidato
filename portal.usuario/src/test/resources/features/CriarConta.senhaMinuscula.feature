
@criarContaSenhaMinuscula
Feature: Criar Conta
  Eu como usuario quero preencher o formulario
  
  Scenario: Senha sem letra minuscula
    Given que eu acesse o menu criar conta
    When clicar no campo senha
    And preencher dados sem uma letra minuscula
    Then o sistema retorna uma mensagem de aviso

 