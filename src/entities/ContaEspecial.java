package entities;

import javax.swing.JOptionPane;

public class ContaEspecial extends Conta {

    //Variáveis utilizadas para os dados do cliente
    private Double limite;

    //Construtor usando os parâmetros
    public ContaEspecial(Double limite, int numero, double saldo,String cpf,String nome) {
        super(numero, saldo,cpf,nome);
        this.limite = limite;
    }

    //Construtor vazio
    public ContaEspecial() {
    }

    //Método para pegar o limite da conta
    public Double getLimite() {
        return limite;
    }

    //Método para definir o limite da conta
    public void setLimite(Double limite) {
        this.limite = limite;
    }

    //Sobrescrita do método de debitar da conta usando o limite
    @Override
    public void debitar(double valor) {
        if (valor <= saldo + limite) {
            this.saldo -= valor;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Sobrescrita do método toString para mostrar os dados da conta
    @Override
    public String toString(){
        return super.toString() + " \r\nLimite R$: " + limite;
    }
    

}
