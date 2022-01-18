public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente(new Cliente("Ndion"));
        Conta pp = new ContaPoupanca(new Cliente("Sicorar"));
        cc.depositar(199);
        cc.transferir(99, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();

    }
}
