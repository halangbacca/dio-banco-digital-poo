public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco DIO");

        Conta cc = new ContaCorrente(new Cliente("Halan"));
        Conta cp = new ContaPoupanca(new Cliente("Daniel"));

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        banco.listarClientes();

        System.out.println();

        cc.depositar(100);
        cc.transferir(cp, 50);
        cc.imprimirExtrato();

        System.out.println();

        cp.imprimirExtrato();
    }
}