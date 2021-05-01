package controller_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class MySQL {
    
    public static void insertConta(String nome, String cpf, int numero, double saldo){
        Connection conn = null;

            PreparedStatement st = null;

            try{
                conn = DB.getConnection();

                st = conn.prepareStatement("INSERT INTO Conta (Nome, CPF, Numero, Saldo) "
                                                    + "VALUES (?, ?, ?, ?)");
                
                st.setString(1, nome);
                st.setString(2, cpf);
                st.setInt(3, numero);
                st.setDouble(4, saldo);

                int linhasAfetadas = st.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Conta cadastrada! Linhas afetadas: " + linhasAfetadas, "Concluído", JOptionPane.INFORMATION_MESSAGE);

            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro inesperado: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            finally{
                DB.closeStatement(st);   
                DB.closeConnection();
            }
    }
    
    public static void insertContaEspecial(String nome, String cpf, int numero, double saldo, double limite){
        Connection conn = null;

            PreparedStatement st = null;

            try{
                conn = DB.getConnection();

                st = conn.prepareStatement("INSERT INTO ContaEspecial (Nome, CPF, Numero, Saldo, Limite) "
                                                    + "VALUES (?, ?, ?, ?, ?)");
                
                st.setString(1, nome);
                st.setString(2, cpf);
                st.setInt(3, numero);
                st.setDouble(4, saldo);
                st.setDouble(5, limite);

                int linhasAfetadas = st.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Conta cadastrada! Linhas afetadas: " + linhasAfetadas, "Concluído", JOptionPane.INFORMATION_MESSAGE);

            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro inesperado: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            finally{
                DB.closeStatement(st);   
                DB.closeConnection();
            }
    }
    
    public static String searchContas(){
        Connection conn = null;        
        Statement st = null;
        ResultSet rs = null;
        String dados = "";
        
        try{
            conn = DB.getConnection();
            st = conn.createStatement();       
            rs = st.executeQuery("SELECT * FROM Conta");                          
            
            while(rs.next()){
                dados += "Nome: " + rs.getString("Nome") + "\nNúmero: " + rs.getInt("Numero") + "\nSaldo: R$" + rs.getDouble("Saldo") + "\n\n";
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return dados;
    }
}
