public class Main {
    public static void main(String[] args) {
        Banco contaJose = new Banco();
        // conta do josé tem saldo == 0 e status fechada
        contaJose.abrirConta("cp"); // 150 de saldo
        contaJose.setNome("Jose");
        contaJose.setNumero(123456789);
        contaJose.depositar(300);
        contaJose.pagarMensalidade();

        Banco contaMaria = new Banco();
        contaMaria.abrirConta("cc");
        contaMaria.setNome("Maria");
        contaMaria.setNumero(987654321);
        contaMaria.depositar(500);
        contaMaria.sacar(100);
        contaMaria.pagarMensalidade();
        System.out.println(contaMaria.getSaldo());
        contaMaria.fecharConta();
        contaMaria.estadoAtual();
    }
}