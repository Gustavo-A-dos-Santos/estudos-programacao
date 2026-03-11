public class ContaBancaria {
    private double saldo_total;
    private char banco;

    public double getSaldo() {
        return saldo_total;
    }

    public void setSaldo(double valor) {
        this.saldo_total = valor;
    }

    public char getBanco() {
        return banco;
    }

    public void setBanco(char nome) {
        this.banco = nome;
    }

}
