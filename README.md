
Trabalho para a disciplina de JAVA

Repositorio com o enunciado disponível em: https://github.com/leoinfnet/TP3_JAVA_2023/

5-) (Segunda parte, questão 2) As ilhas Faroe te contrataram para implementar o sistema de caixas bancários(ATM) da ilha.
A moeda local se chama BIT e eles possuem as seguintes cédulas: B$50,B$10,B$5 e B$1.  

    Exitem dois tipos de clientes no Banco: Clientes Standart e Clientes VIP.
    Cada cliente deverá ter os seguintes atributos: nome(String),email(List<String>), segurosocial(String), Logradouro, Numero, Bairro, Cidade, zip-code e saldo(BigDecimal).

    Utilizando composição E/OU herança (como achar melhor) mapeie esse cenário.
    Implemente o método para depositar Bits. Esse método deve validar valores negativos e zero.

    Há duas implementações para o método sacar, ambas devem validar se o saque é de um valor válido(não negativo e existente na conta). 
    A primeira implementação, dos clientes Standarts, deve descontar o valor sacado do saldo do cliente e imprimir a mensagem: 
    Notas entregues: X de B$50, Y de B$10, Z de B$5 e K de B$1. Obs, a quantidade de notas deve ser a menor possível. 

    A segunda implementação, de clientes VIPS deve seguir a regra anterior para valores maiores de 50 reais. Se o valor solicitado for menor que 50 o sistema deve perguntar se o cliente quer utilizar o método de menor notas ou entregar o dinheiro só com notas de B$5 e B$1.

    Crie uma classe com método Main para testar essa lógica. Crie um cliente de cada e saque alguns valores. 
