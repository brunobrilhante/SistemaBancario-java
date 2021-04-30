package controller_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            }
    }
    
     public static void insertContaEspecial(String cpf, double limite){
        Connection conn = null;

            PreparedStatement st = null;

            try{
                conn = DB.getConnection();

                st = conn.prepareStatement("INSERT INTO ContaEspecial (Limite, CPF) "
                                                    + "VALUES (?, ?");
                
                st.setDouble(1, limite);
                st.setString(2, cpf);

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
}
