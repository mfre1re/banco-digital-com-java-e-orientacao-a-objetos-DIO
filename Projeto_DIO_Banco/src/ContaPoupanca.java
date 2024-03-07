public class ContaPoupanca extends Conta{

    public ContaPoupanca(String nomeBanco) {
        super(nomeBanco);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança");
        super.imprimirInfosComuns();
    }
}
