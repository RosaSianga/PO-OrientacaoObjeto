public class ContaBancaria {

    public String titular;
    public double saldo;


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
}
