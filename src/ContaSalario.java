public class ContaSalario extends Conta{

    private final int limiteSaquesGratuitos = 3;
    private int saquesRealizados;

    public void sacar(double valor) {
        if(saquesRealizados < limiteSaquesGratuitos) {
            super.sacar(valor);
            saquesRealizados++;
        } else {
            System.out.println("Você excedeu o limite de saques gratuitos!! @@@@@");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Salário ====");
        super.imprimirInfosComuns();
    }
}
