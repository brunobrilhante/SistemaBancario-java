package application;

import view_GUI.TelaPrincipal;
import controller_db.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Program {
   
    public static void main(String[] args) {
       
        //Execução do programa deixando visível a janela, centralizada e sem expandir
        /*TelaPrincipal tp = new TelaPrincipal();
        tp.setVisible(true);
        tp.setLocationRelativeTo(null);
        tp.setResizable(false);*/
        
        Connection conn = null;
        
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();
            
            st = conn.prepareStatement("INSERT INTO Conta (Nome, CPF, Numero, Saldo) "
                                                + "VALUES (?, ?, ?, ?)");
            
            st.setString(1, "Bruno Brilhante");
            st.setString(2, "123.456.789.01");
            st.setInt(3, 10011001);
            st.setDouble(4, 5000.0);
            
            int linhasAfetadas = st.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Feito! Linhas afetadas: " + linhasAfetadas, "Concluído", JOptionPane.INFORMATION_MESSAGE);
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            DB.closeStatement(st);
            DB.closeConnection();
        }
                
    }
    
}
