Simulação de Terminal de Autoatendimento Bancário

💻 Sobre o Projeto

Este projeto é uma aplicação de console que simula as operações básicas de um caixa eletrônico (ATM). O foco principal foi aplicar os princípios da Programação Orientada a Objetos (POO) para modelar um cenário do mundo real.

A interação com o usuário é feita via terminal, onde ele pode criar uma conta e realizar operações como consulta de saldo, depósito e saque.

🛠️ Tecnologias Utilizadas

    Java 17

✨ Funcionalidades

    Criação de Conta: Permite que um novo usuário crie uma conta bancária com nome, agência, número da conta e um saldo inicial.
    Consulta de Saldo: Exibe o saldo atual da conta do usuário.
    Realizar Depósito: Permite ao usuário adicionar um valor ao seu saldo.
    Realizar Saque: Permite ao usuário retirar um valor do seu saldo, com validação para não permitir saldo negativo.

⚙️ Como Executar

    Clone o repositório:
    git clone https://github.com/johnbadtrip/TerminaldeAutoatendimentoBancario.git

    Navegue até o diretório do projeto:
    cd TerminaldeAutoatendimentoBancario/src

    Compile o arquivo Java:
    javac ContaTerminal.java

    Execute a aplicação:
    java ContaTerminal

🎓 O que aprendi

    Abstração: Modelar a entidade Conta com seus atributos e comportamentos essenciais.
    Encapsulamento: Proteger os dados da conta (como o saldo) e expor apenas as operações seguras (depósito e saque).
    Herança e Polimorfismo (Próximos Passos): O projeto serve como base para futuras expansões, como a criação de diferentes tipos de contas (Conta Corrente, Conta Poupança) que herdem de uma Conta base.
    Interação com o Usuário: Utilização da classe Scanner para receber dados do usuário via console de forma interativa.
