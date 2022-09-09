@emailInvalido
Feature: Menu login
  Como usuario quero preencher campo email com dados invalidos

  @testRapido
  Scenario: Email invalido
    Given Que eu esteja no menu login
    When Preencher o campo email
    And Os dados forem invalidos
    Then Validamos a mensagem de retorno