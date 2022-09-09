
@realizarBusca
Feature: Perfil Usuario
Eu como usuario quero fazer o login para realizar uma busca de vaga
  
  Scenario: Realizar busca
    Given Que eu esteja no perfil do usuario
    When Preencher o campo de pesquisa
    And E clicar em buscar
    Then Valido a resposta do sistema