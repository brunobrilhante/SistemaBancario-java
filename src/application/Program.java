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
        TelaPrincipal tp = new TelaPrincipal();
        tp.setVisible(true);
        tp.setLocationRelativeTo(null);
        tp.setResizable(false);
        
        
                
    }
    
}
