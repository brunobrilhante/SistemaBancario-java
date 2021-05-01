package application;

import view_GUI.TelaPrincipal;

public class Program {
   
    public static void main(String[] args) {
       
        //Execução do programa deixando visível a janela, centralizada e sem expandir
        TelaPrincipal tp = new TelaPrincipal();
        tp.setVisible(true);
        tp.setLocationRelativeTo(null);
        tp.setResizable(false);
        
        
                
    }
    
}
