package view_GUI;

import controller_db.MySQL;
import model_entities.RepositorioContas;
import java.util.ConcurrentModificationException;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    RepositorioContas array = new RepositorioContas();

    public TelaPrincipal() {
        super("Banco Nassau");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemSalvar = new javax.swing.JMenuItem();
        menuCadastrar = new javax.swing.JMenu();
        itemConta = new javax.swing.JMenuItem();
        itemContaEspecial = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenu();
        itemListar = new javax.swing.JMenuItem();
        itemListarContas = new javax.swing.JMenuItem();
        menuAcoes = new javax.swing.JMenu();
        itemCreditar = new javax.swing.JMenuItem();
        itemDebitar = new javax.swing.JMenuItem();
        itemTransferir = new javax.swing.JMenuItem();
        itemRemover = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        itemAjuda = new javax.swing.JMenuItem();
        itemSobre = new javax.swing.JMenuItem();
        itemSair = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FundoBanco.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco NASSAU");

        lblTitulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FundoBanco.jpg"))); // NOI18N

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        menuArquivo.setText("Arquivo");
        menuArquivo.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        itemSalvar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        itemSalvar.setText("Salvar");
        itemSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalvarActionPerformed(evt);
            }
        });
        menuArquivo.add(itemSalvar);

        jMenuBar1.add(menuArquivo);

        menuCadastrar.setText("Cadastrar");
        menuCadastrar.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        itemConta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        itemConta.setText("Cliente");
        itemConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemContaActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemConta);

        itemContaEspecial.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        itemContaEspecial.setText("Cliente Especial");
        itemContaEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemContaEspecialActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemContaEspecial);

        jMenuBar1.add(menuCadastrar);

        menuConsultar.setText("Consultar");
        menuConsultar.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        itemListar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        itemListar.setText("Consultar Conta");
        itemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListarActionPerformed(evt);
            }
        });
        menuConsultar.add(itemListar);

        itemListarContas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        itemListarContas.setText("Listar Contas");
        itemListarContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListarContasActionPerformed(evt);
            }
        });
        menuConsultar.add(itemListarContas);

        jMenuBar1.add(menuConsultar);

        menuAcoes.setText("Ações");
        menuAcoes.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        itemCreditar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        itemCreditar.setText("Creditar");
        itemCreditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCreditarActionPerformed(evt);
            }
        });
        menuAcoes.add(itemCreditar);

        itemDebitar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        itemDebitar.setText("Debitar");
        itemDebitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDebitarActionPerformed(evt);
            }
        });
        menuAcoes.add(itemDebitar);

        itemTransferir.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        itemTransferir.setText("Transferir");
        itemTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTransferirActionPerformed(evt);
            }
        });
        menuAcoes.add(itemTransferir);

        itemRemover.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        itemRemover.setText("Remover Conta");
        itemRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRemoverActionPerformed(evt);
            }
        });
        menuAcoes.add(itemRemover);

        jMenuBar1.add(menuAcoes);

        menuSobre.setText("Sobre");
        menuSobre.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        itemAjuda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        itemAjuda.setText("Ajuda");
        itemAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAjudaActionPerformed(evt);
            }
        });
        menuSobre.add(itemAjuda);

        itemSobre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        itemSobre.setText("Sobre nós");
        itemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSobreActionPerformed(evt);
            }
        });
        menuSobre.add(itemSobre);

        itemSair.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        itemSair.setText("Sair");
        itemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        menuSobre.add(itemSair);

        jMenuBar1.add(menuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemContaActionPerformed
        TelaConta tc = new TelaConta();
        tc.setVisible(true);
        tc.setLocationRelativeTo(null);
        tc.setResizable(false);
    }//GEN-LAST:event_itemContaActionPerformed

    private void itemContaEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemContaEspecialActionPerformed
        TelaContaEspecial tce = new TelaContaEspecial();
        tce.setVisible(true);
        tce.setLocationRelativeTo(null);
        tce.setResizable(false);
    }//GEN-LAST:event_itemContaEspecialActionPerformed

    private void itemListarContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListarContasActionPerformed
        JOptionPane.showMessageDialog(null, MySQL.searchContas(), "Listagem", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_itemListarContasActionPerformed

    private void itemRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRemoverActionPerformed
        try {
            array.removerConta();
        } 
        catch (NullPointerException | ConcurrentModificationException e) {            
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Confirmação não finalizada: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        } 
        catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemRemoverActionPerformed

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemSairActionPerformed

    private void itemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSobreActionPerformed
        TelaSobreNos ts = new TelaSobreNos();
        ts.setVisible(true);
        ts.setLocationRelativeTo(null);
        ts.setResizable(false);
    }//GEN-LAST:event_itemSobreActionPerformed

    private void itemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListarActionPerformed
        try {
            /*if (MySQL.searchContas().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não há contas cadastradas", "Erro", JOptionPane.ERROR_MESSAGE);
            } 
            else {
                String Snumero = JOptionPane.showInputDialog("Digite o número da conta: ");
                int numero = Integer.parseInt(Snumero);

                if (MySQL.searchConta(numero) == null) {
                    JOptionPane.showMessageDialog(null, "O número não está cadastrado ! ", "ERRO", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, MySQL.searchConta(numero), "Listagem", JOptionPane.INFORMATION_MESSAGE);
                }            
            }*/
            String Snumero = JOptionPane.showInputDialog("Digite o número da conta: ");
            int numero = Integer.parseInt(Snumero);
            JOptionPane.showMessageDialog(null, MySQL.searchConta(numero), "Listagem", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "CONFIRMAÇÃO NÃO FINALIZADA !", "ALERTA", JOptionPane.ERROR_MESSAGE);
        }
        catch (NullPointerException e) {
        } 
        catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_itemListarActionPerformed

    private void itemCreditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCreditarActionPerformed
        try{
            array.depositar();        
        }
        catch(NullPointerException e){            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Erro na entrada de dados: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        catch(RuntimeException e){
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemCreditarActionPerformed

    private void itemDebitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDebitarActionPerformed
        try{
            array.sacar();        
        }
        catch(NullPointerException e){            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Erro na entrada de dados: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        catch(RuntimeException e){
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemDebitarActionPerformed

    private void itemTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTransferirActionPerformed
        if (RepositorioContas.contagem_cc < 2) {
            JOptionPane.showMessageDialog(null, "Não é possível transferir, há menos que duas contas cadastradas", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            TelaTransferencia tt = new TelaTransferencia();
            tt.setVisible(true);
            tt.setLocationRelativeTo(null);
            tt.setResizable(false);
        }
    }//GEN-LAST:event_itemTransferirActionPerformed

    private void itemAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAjudaActionPerformed
        TelaAjuda ta = new TelaAjuda();
        ta.setVisible(true);
        ta.setLocationRelativeTo(null);
        ta.setResizable(false);
    }//GEN-LAST:event_itemAjudaActionPerformed

    private void itemSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalvarActionPerformed
        array.salvarDados();        
    }//GEN-LAST:event_itemSalvarActionPerformed

/**
 * @param args the command line arguments
 */
public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                





}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        





} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        





} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        





} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAjuda;
    private javax.swing.JMenuItem itemConta;
    private javax.swing.JMenuItem itemContaEspecial;
    private javax.swing.JMenuItem itemCreditar;
    private javax.swing.JMenuItem itemDebitar;
    private javax.swing.JMenuItem itemListar;
    private javax.swing.JMenuItem itemListarContas;
    private javax.swing.JMenuItem itemRemover;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JMenuItem itemSalvar;
    private javax.swing.JMenuItem itemSobre;
    private javax.swing.JMenuItem itemTransferir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenu menuAcoes;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuConsultar;
    private javax.swing.JMenu menuSobre;
    // End of variables declaration//GEN-END:variables
}
