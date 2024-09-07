# Projeto Bancário com Lombok

## Descrição

Este projeto é uma aplicação Java que simula um sistema bancário básico. O projeto utiliza Lombok para simplificar o código e reduzir a verbosidade, facilitando a manutenção e a legibilidade. A aplicação inclui funcionalidades básicas de contas bancárias e uma classe `Cliente` para gerenciar informações de clientes.

## Funcionalidades

- **Lombok:** Utilizado para gerar getters, setters e outros métodos automaticamente.
- **Contas Bancárias:** Implementa diferentes tipos de contas bancárias, como `ContaCorrente`, `ContaPoupanca`, e `ContaSalario`.
- **Cliente:** Gerencia informações de clientes, incluindo nome e endereço.
- **Endereço:** Representa o endereço do cliente.

## Estrutura do Projeto

- **`src/main/java`**
  - **`model`**
    - `Endereco.java` - Classe que representa o endereço do cliente.
    - `Cliente.java` - Classe que representa o cliente e gerencia suas informações.
    - `Banco.java` - Classe que representa o banco.
    - `Conta.java` - Classe abstrata que define as operações básicas de uma conta bancária.
    - `ContaCorrente.java` - Implementação de conta corrente.
    - `ContaPoupanca.java` - Implementação de conta poupança.
    - `ContaSalario.java` - Implementação de conta salário com limite de saques gratuitos.
  - **`Main.java`** - Classe principal que testa as funcionalidades do sistema bancário.

## Dependências

- **Lombok:** Biblioteca para reduzir a verbosidade do código.
  
### Adicionando Lombok ao Projeto

1. **Baixar o JAR do Lombok:** [Lombok JAR](https://projectlombok.org/download)
2. **Adicionar o JAR ao Classpath:**
   - No IntelliJ IDEA: Vá para `File > Project Structure > Modules > Dependencies` e adicione o `lombok.jar` ao classpath.
3. **Instalar o Plugin Lombok:**
   - No IntelliJ IDEA: Vá para `File > Settings > Plugins` e procure por `Lombok`. Instale e ative o plugin.

## Como Rodar o Projeto

1. **Compile o Projeto:**
   ```bash
   javac -cp path/to/lombok.jar src/main/java/*.java
