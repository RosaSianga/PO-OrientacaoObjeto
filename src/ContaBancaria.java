public class ContaBancaria {

    private String titular;
    private double saldo;


    public void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Deposito Realizado com sucesso");
    }

    public void sacar(double valor){
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque Realizado com sucesso");
        } else {
            System.out.println("Saque recusado - Saldo é insuficiente");
        }
    }

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
