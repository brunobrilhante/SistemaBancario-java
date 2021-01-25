package entities;

import javax.swing.JOptionPane;

public class Conta {

    //Variáveis utilizadas para os dados do cliente
    protected String nome;
    protected String cpf;
    protected Integer numero;
    protected Double saldo;

    //Construtor usando os parâmetros
    public Conta(int numero,Double saldo,String cpf,String nome) {
           this.nome = nome;
           this.cpf = cpf;
           this.numero = numero;
           this.saldo = saldo;        
    }
    
    //Construtor vazio
    public Conta(){        
    }

    //Método para pegar o CPF do cliente
    public String getCpf() {
        return cpf;
    }
    
    //Método para definir o CPF do cliente
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //Método para pegar o número da conta
    public int getNumero() {
        return numero;
    }

    //Método para definir o número da conta
    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Método para pegar o saldo do cliente
    public double getSaldo() {
        return saldo;
    }

    //Método para definir o saldo do cliente
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
     
    //Método para creditar um valor na conta
    public void creditar(double valor){
       this.saldo += valor; 
    }
    
    //Método para debitar um valor na conta
    public void debitar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        }
        else{
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Sobrescrita do método toString para mostrar os dados da conta
    @Override
    public String toString(){
        return  "Nome: " + nome +
                " \r\nNúmero: " + numero + 
                " \r\nSaldo: R$: " + saldo;
    }
}
