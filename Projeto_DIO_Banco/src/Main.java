public class Main {
    public static void main(String[] args) {
        Conta contac = new ContaCorrente(("Banco do Brasil"));
        Conta contap = new ContaPoupanca(("Banco do Brasil"));
        contac.depositar(100);
        contac.transferir(100, contap);

        contac.imprimirExtrato();
        contap.imprimirExtrato();
    }
}
