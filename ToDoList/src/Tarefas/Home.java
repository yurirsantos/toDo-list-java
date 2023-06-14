/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tarefas;

/**
 *
 * @author yuri
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        menuCadastroTarefa = new javax.swing.JButton();
        menuTarefas = new javax.swing.JButton();
        menuCadastroUsuario = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        barraTotalConcluidas = new javax.swing.JProgressBar();
        labelTarefas = new javax.swing.JLabel();
        labelConcluidas = new javax.swing.JLabel();
        totalConcluidasNumero = new javax.swing.JLabel();
        totalPendentesNumero = new javax.swing.JLabel();
        barraTotalPendentes = new javax.swing.JProgressBar();
        labelPendentes = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        totalUsuariosNumero = new javax.swing.JLabel();
        labelUsuarios = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        totalTaredasNumero = new javax.swing.JLabel();
        barraTotalTarefas = new javax.swing.JProgressBar();
        labelTotal = new javax.swing.JLabel();
        barraTotalUsuarios = new javax.swing.JProgressBar();
        menuListaUsuarios = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("aakar", 1, 18)); // NOI18N

        menuCadastroTarefa.setText("Cadastro Tarefa");
        menuCadastroTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroTarefaActionPerformed(evt);
            }
        });

        menuTarefas.setText("Tarefas");
        menuTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTarefasActionPerformed(evt);
            }
        });

        menuCadastroUsuario.setText("Cadastro Usuário");
        menuCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroUsuarioActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        barraTotalConcluidas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                barraTotalConcluidasAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        labelTarefas.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        labelTarefas.setText("Tarefas");

        labelConcluidas.setText("Concluídas");

        totalConcluidasNumero.setText("1");

        totalPendentesNumero.setText("2");

        barraTotalPendentes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                barraTotalPendentesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        labelPendentes.setText("Pendentes");

        separador2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        totalUsuariosNumero.setText("Total Usuários");

        labelUsuarios.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        labelUsuarios.setText("Usuários");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel6.setText("Minhas Tarefas");

        totalTaredasNumero.setText("2");

        barraTotalTarefas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                barraTotalTarefasAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        labelTotal.setText("Total");

        barraTotalUsuarios.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                barraTotalUsuariosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        menuListaUsuarios.setText("Usuários");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelConcluidas)
                    .addComponent(labelTarefas)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barraTotalConcluidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalConcluidasNumero))
                    .addComponent(labelPendentes)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barraTotalPendentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalPendentesNumero))
                    .addComponent(labelTotal)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barraTotalTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalTaredasNumero)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsuarios)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barraTotalUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalUsuariosNumero)))
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuCadastroTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuCadastroUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuTarefas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuListaUsuarios)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(separador1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel6)
                        .addGap(221, 221, 221)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(btSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuCadastroTarefa)
                    .addComponent(menuCadastroUsuario)
                    .addComponent(menuTarefas)
                    .addComponent(menuListaUsuarios))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTarefas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelConcluidas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(barraTotalConcluidas, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalConcluidasNumero))
                        .addGap(18, 18, 18)
                        .addComponent(labelPendentes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(barraTotalPendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalPendentesNumero))
                        .addGap(18, 18, 18)
                        .addComponent(labelTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(barraTotalTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalTaredasNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separador2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(totalUsuariosNumero)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelUsuarios)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(barraTotalUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void getUsuarioLogin (){
        if(Usuario.getTipoUsuario().equals("Normal")){
            menuCadastroTarefa.setVisible(false);
            menuCadastroUsuario.setVisible(false);
            menuTarefas.setVisible(false);
            barraTotalConcluidas.setVisible(false);
            totalConcluidasNumero.setVisible(false);
            barraTotalPendentes.setVisible(false);
            totalPendentesNumero.setVisible(false);
            barraTotalTarefas.setVisible(false);
            totalTaredasNumero.setVisible(false);
            barraTotalUsuarios.setVisible(false);
            totalUsuariosNumero.setVisible(false);
            labelConcluidas.setVisible(false);
            labelPendentes.setVisible(false);
            labelTotal.setVisible(false);
            labelUsuarios.setVisible(false);
            labelTarefas.setVisible(false);
            separador1.setVisible(false);
            separador2.setVisible(false);
        }
        
        barraTotalConcluidas.setValue(Tarefa.getTotalTarefas()[0]);    
        totalConcluidasNumero.setText(Integer.toString(Tarefa.getTotalTarefas()[0]));
        
        barraTotalPendentes.setValue(Tarefa.getTotalTarefas()[1]);
        totalPendentesNumero.setText(Integer.toString(Tarefa.getTotalTarefas()[1]));
        
        barraTotalTarefas.setValue(Tarefa.getTotalTarefas()[2]);
        totalTaredasNumero.setText(Integer.toString(Tarefa.getTotalTarefas()[2]));
        
        barraTotalUsuarios.setValue(Usuario.getListaUsuarios().size());
        totalUsuariosNumero.setText(Integer.toString(Usuario.getListaUsuarios().size()));
    }
    
    private void menuCadastroTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroTarefaActionPerformed
        new CadastroTarefa().setVisible(true);
        CadastroTarefa.setListaUsuarios();
        setVisible(false);
    }//GEN-LAST:event_menuCadastroTarefaActionPerformed

    private void menuTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTarefasActionPerformed
        new ListaTarefas().setVisible(true);
        ListaTarefas.getUsuarioLogin();
        
        setVisible(false);
    }//GEN-LAST:event_menuTarefasActionPerformed

    private void menuCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroUsuarioActionPerformed
        new CadastroUsuario().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_menuCadastroUsuarioActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btSairActionPerformed

    private void barraTotalConcluidasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_barraTotalConcluidasAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_barraTotalConcluidasAncestorAdded

    private void barraTotalPendentesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_barraTotalPendentesAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_barraTotalPendentesAncestorAdded

    private void barraTotalTarefasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_barraTotalTarefasAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_barraTotalTarefasAncestorAdded

    private void barraTotalUsuariosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_barraTotalUsuariosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_barraTotalUsuariosAncestorAdded

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
                
            }
        });
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JProgressBar barraTotalConcluidas;
    private static javax.swing.JProgressBar barraTotalPendentes;
    private static javax.swing.JProgressBar barraTotalTarefas;
    private static javax.swing.JProgressBar barraTotalUsuarios;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private static javax.swing.JLabel labelConcluidas;
    private static javax.swing.JLabel labelPendentes;
    private static javax.swing.JLabel labelTarefas;
    private static javax.swing.JLabel labelTotal;
    private static javax.swing.JLabel labelUsuarios;
    private static javax.swing.JButton menuCadastroTarefa;
    private static javax.swing.JButton menuCadastroUsuario;
    private javax.swing.JButton menuListaUsuarios;
    private static javax.swing.JButton menuTarefas;
    private static javax.swing.JSeparator separador1;
    private static javax.swing.JSeparator separador2;
    private static javax.swing.JLabel totalConcluidasNumero;
    private static javax.swing.JLabel totalPendentesNumero;
    private static javax.swing.JLabel totalTaredasNumero;
    private static javax.swing.JLabel totalUsuariosNumero;
    // End of variables declaration//GEN-END:variables
}
