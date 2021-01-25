package entities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RepositorioContas {

    public static int contagem_cc = 0;    
    
    //Criando a variável do arquivo de texto
    private File file = new File("Dados.txt");    
    //Criando a LinkedList estática para o programa armazenar os dados sem sobrescrever
    static LinkedList<Conta> contas = new LinkedList<>();

    //Método para adicionar a conta da lista
    public void addConta(Conta c) {
        contas.add(c);
        contagem_cc++;
    }

    //Método para remover uma conta da lista usando um número de pesquisa
    public void removerConta() {
        String Snumero = JOptionPane.showInputDialog("Digite o número da sua conta");
        int numero = Integer.parseInt(Snumero);

        boolean test = false;
        for (Conta c : contas) {
            if (numero == c.getNumero()) {
                contas.remove(c);
                test = true;
                JOptionPane.showMessageDialog(null, "Conta removida!", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (test == false) {
            JOptionPane.showMessageDialog(null, "Conta inexistente", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Método para listar uma determinada conta pelo seu número
    public String listar_num(int num) {
        for (Conta c : contas) {
            if (num == c.getNumero()) {
                return c.toString() + "\n\n";
            }
        }
        return null;
    }

    //Método para verificar se já existe alguma conta com um número passado
    public Boolean verificar(int num) {
        for (Conta c : contas) {
            if (c.getNumero() == num) {
                return true;
            }
        }
        return null;
    }

    //Método para verificar se já existe algum CPF na lista igual ao passado
    public Boolean verificarCPF(String cpf) {
        for (Conta c : contas) {
            if (c.getCpf().equals(cpf)) {
                return true;
            }
        }
        return null;
    }

    //Método para depositar da conta
    public void depositar() {
        String numeroContaCredito = JOptionPane.showInputDialog("Digite o número da sua conta: ");
        numeroContaCredito = numeroContaCredito.trim();
        int numConta;
        numConta = Integer.parseInt(numeroContaCredito);

        if (verificar(numConta) == null) {
            JOptionPane.showMessageDialog(null, "O número não está cadastrado ! ", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            for (Conta c : contas) {
                if (verificar(numConta) == true && c.getNumero() == numConta) {
                    String credito = JOptionPane.showInputDialog("Digite quanto quer CREDITAR: ");
                    double num_credito = Double.parseDouble(credito);
                    c.creditar(num_credito);
                    break;
                }
            }
        }
    }

    //Método para realizar o saque da conta
    public void sacar() {
        String num_account = JOptionPane.showInputDialog("Digite o número da sua conta: ");
        num_account = num_account.trim();
        int num = Integer.parseInt(num_account);

        if (verificar(num) == null) {
            JOptionPane.showMessageDialog(null, "O número não está cadastrado ! ", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            for (Conta c : contas) {
                if (verificar(num) == true && c.getNumero() == num) {
                    String credito = JOptionPane.showInputDialog("Digite quanto quer DEBITAR: ");
                    double num_credito = Double.parseDouble(credito);
                    c.debitar(num_credito);
                    break;
                }
            }
        }
    }

    //Método para verificar o saldo de uma determinada conta
    public Boolean verificarSaldo(int numero) {
        for (Conta c : contas) {
            if (c.getNumero() == numero && c.getSaldo() > 0) {
                return true;
            }
        }
        return false;
    }

    //Método para realizar a transferência de uma conta para outra
    public void transferir(int conta1, int conta2, double valor) {
        for (Conta c : contas) {
            if (c.getNumero() == conta1) {
                if (c.getSaldo() > 0) {
                    c.debitar(valor);
                    break;
                }
            }
        }
        for (Conta c : contas) {
            if (c.getNumero() == conta2) {
                if (c.getSaldo() > 0) {
                    c.creditar(valor);
                    break;
                }
            }
        }
    }

    //Método para listar todas as contas
    public String listar() {
        String result = "";
        for (Conta c : contas) {
            result += c.toString() + "\n\n";
        }
        return result;
    }

    //Método para verificar se a lista está vazia
    public boolean isEmpty() {
        return contas.isEmpty();
    }

    //Método para salvar os dados da lista em um arquivo de texto
    public void salvarDados() {
        String dados = "";
        FileWriter arquivo;
        for (Conta c : contas) {
            dados += c.toString() + "\r\n\r\n";
        }

        try {
            arquivo = new FileWriter(file);
            arquivo.write(dados);
            arquivo.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
