public class ContaCorrente extends Conta{

    public ContaCorrente(String nomeBanco) {
        super(nomeBanco);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        super.imprimirInfosComuns();
    }
}
