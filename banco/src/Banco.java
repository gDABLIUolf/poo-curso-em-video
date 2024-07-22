public class Banco {
    public int numero;
    protected String tipo;
    private String nome;
    private double saldo;
    private boolean status; //aberto ou fechado
    public void estadoAtual(){
        System.out.println("----------------------------------------");
        System.out.println("Conta: " + this.getNumero());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

    public Banco(){
        setSaldo(0);
        setStatus(false);
    }

    public void abrirConta(String tipo){
        if (tipo.equals("cc")){
            setTipo("cc");
            setSaldo(50);
        } else {
            setTipo("cp");
            setSaldo(150);
        }
        this.setStatus(true);
    }

    public void fecharConta(){
        if (getSaldo() < 0){
            System.out.println("Quite todos os débitos para fechar a conta.");
        } else if (getSaldo() > 0) {
            System.out.println("Retire todo o saldo para fechar a conta.");
        } else {
            setStatus(false);
        }
    }

    public void depositar(double valor){
        if (isStatus()){
            setSaldo(getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso na conta de " + getNome());
        } else {
            System.out.println("Impossível depositar");
        }
    }

    public void sacar(double valor){
        if (!isStatus()){
            System.out.println("Impossível sacar de uma conta fechada");
        } else {
            if (getSaldo() > valor) {
                setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado com sucesso na conta de " + getNome());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        }
    }

    public void pagarMensalidade(){
        if (getTipo().equals("cc")){
            setSaldo(getSaldo() - 12);
            System.out.println("Mensalidade paga com sucesso na conta de " + getNome());
        } else {
            setSaldo(getSaldo() - 20);
            System.out.println("Mensalidade paga com sucesso na conta de " + getNome());
        }
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
