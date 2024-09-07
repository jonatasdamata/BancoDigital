public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        Conta cs = new ContaSalario();  // Nova Conta Salário

        cc.depositar(100);
        cc.transferir(20, cp);

        cc.imprimirExtrato();
        System.out.println(" ");
        cp.imprimirExtrato();
        System.out.println(" ");
        cs.depositar(50);
        cs.sacar(10);

        cs.imprimirExtrato();
        System.out.println(" ");

        // Atualizando cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Jonatas");

        Endereco endereco = new Endereco();
        endereco.setRua("Rua 123");
        endereco.setCidade("Barra");
        endereco.setEstado("BA");
        endereco.setCep("xxxxxxx");

        cliente.atualizarDadosCliente("Jonatas da Mata", endereco);
        System.out.println("Nome do Cliente: " + cliente.getNome());
        System.out.println("Endereço do Cliente: " + cliente.getEndereco().getRua());
    }
}
