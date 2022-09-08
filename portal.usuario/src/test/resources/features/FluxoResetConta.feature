@fluxoResetConta

Feature: Fluxo de reset de senha
Eu como usuario quero relaizar o reset de senha

Scenario: Reset de senha

Given dado que eu esteja no menu home
When clicar no botao esqueci senha
And preecher com dados validos
And clicar no botao recuperar senha
Then entao validamos a mensagem do sistema