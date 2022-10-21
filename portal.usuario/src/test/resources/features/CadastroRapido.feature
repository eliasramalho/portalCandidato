#language: pt

 @CadastroRapido
Funcionalidade: Realizar cadastro rapido
Como usuario 
Quero acessar o site da randstand
Para realizar o cadastro rapido

Contexto: acessar a tela de cadastro rapido
Dado que eu esteja na tela de cadastro rapido

@positivo @smoke 
Cenario: Realizar o cadastro rapido
Quando eu preencher os dados corretamente
E incluir um curriculo
E aceitar os termos e condicoes
Entao sistema realiza o cadastro de usuario

@negativo @teste 
Cenario: Realizar cadastro com campos em branco
Quando nao preencher os campos 
Entao o sistema retorna a mensagem de erro
		
@negativo		
Cenario: Preencher campo email com dados invalidos
Quando preencher o campo email
E os dados forem invalidos
Entao o sistema retorna uma mensagem

@positivo
Cenario: Preencher campos data nascimento com dados invalidos
Quando Preencher o campo data de nascimento
Mas Contem dados invalidos no campo
Entao O sistema retorna um modal com uma mensagem

@positivo 
Cenario: Usuario menor de quatorze anos
Quando preencher os campos com dados corretos
E preencher idade inferior a quatorze anos
Entao o sistema retorna uma modal 

@positivo 
Cenario: Fluxo completo usuario menor de quatorze anos
Quando preencher os dados do formulario corretamente
E preencher modal de validacao de usuaario 
Entao usuario de menor cadastrado com sucesso

@negativo  
Cenario: Modal de validacao com campos em branco
Quando preencher a idade do usuario menor que quatorze anos
E deixar os campos do modal em branco
Entao validamos o retorno do sistema nos campos com erro

@negativo
Cenario: Modal de validacao nome invalido
Quando acessar o modal
E preencher campo nome com dados invalidos
Entao sistema informa erro nos campos

@negativo 
Cenario: Modal de validacao com email invalido
Quando acessar o modal de validacao
E preencher o email com dados incorretos
Entao validamos se o sistema informa erro nos campos


@negativo 
Cenario: Preencher a senha sem conter numeral
Quando preencher os campos
E no campo senha faltarem os numerais
Entao o sistema retorna uma mensagem de aviso

@negativo 
Cenario: Preencher a senha sem letra minuscula
Quando colocar nos dados nos campos
E no campo senha faltare a letra aminuscula
Entao validamos a mesagem de retorno do sistema

@negativo
Cenario: Preencher a senha sem conter letra maiuscula
Quando preencher os campos com dados
E no campo senha faltar a letra maiuscula
Entao o sistema avisa o erro no campo senha

@negativo 
Cenario: Preencher a senha sem os oito caracteres
Quando preencher todos os campos
E no campo senha nao inserir os oito caracteres
Entao sistema retorna uma mensagem com um aviso no campo

@negativo 
Cenario: Preencher formulario e nao aceitar os termos e condicoes de uso
Quando preencher os campos com dados validos
E nao aceitar os termos de uso e condicoes
Entao sistema nao permite avancar no cadastro












