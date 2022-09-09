
@termosDeUso
Feature: Criar Conta
  Eu como usuario quero preenhcer o formulario

 
  Scenario: Aceitar termos de uso
    Given que eu acesse o menu de criar conta
    When preencher todos os campos
    And clicar no checkbox
    Then sistema abre guia com termos e condicoes

 