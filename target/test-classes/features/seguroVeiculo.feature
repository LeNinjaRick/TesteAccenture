#language: pt
@pedidoSeguro
Funcionalidade: Pedido de seguro de veiculo


 Esquema do Cenario: envio de e-mail bem sucedido 
  	Dado que estou na pagina de preenchimento de pedido de seguro
  	Quando preencho corretamente todos os campos solicitados
  	E preencho os dados de cadastro "<email>","<phone>","<username>","<password>","<confirmPass>"
  	Entao recebo uma mensagem de email enviado com sucesso
    

Exemplos:
|email			|phone		|username	|password	|confirmPass|
|r@r.com		|199999999|user1		|Rr12345	|Rr12345		|
|a@a.com		|199999999|user2		|Rr12345	|Rr12345		|
|rrrr@r.com	|199999999|user3		|Rr12345	|Rr12345		|
