package Tarefas;

import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author yuri
 */
public class CadastroTarefa extends javax.swing.JFrame {

    /**
     * Creates new form CadastroTarefa
     */
    public CadastroTarefa() {
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuBar7 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenuBar8 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenuBar9 = new javax.swing.JMenuBar();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btCancelarCadastroTarefa = new javax.swing.JButton();
        btCadastroTarefa = new javax.swing.JButton();
        inputTitulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDescricao = new javax.swing.JTextArea();
        inputDataEntrega = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        menuTarefas = new javax.swing.JButton();
        checkBaixa = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        checkMedia = new javax.swing.JRadioButton();
        checkAlta = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar4.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar4.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar5.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar5.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar6.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar6.add(jMenu10);

        jMenu11.setText("File");
        jMenuBar7.add(jMenu11);

        jMenu12.setText("Edit");
        jMenuBar7.add(jMenu12);

        jMenu13.setText("File");
        jMenuBar8.add(jMenu13);

        jMenu14.setText("Edit");
        jMenuBar8.add(jMenu14);

        jMenu15.setText("File");
        jMenuBar9.add(jMenu15);

        jMenu16.setText("Edit");
        jMenuBar9.add(jMenu16);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CadastroTarefa");

        btCancelarCadastroTarefa.setText("Cancelar");
        btCancelarCadastroTarefa.setToolTipText("btCancelar");
        btCancelarCadastroTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarCadastroTarefaActionPerformed(evt);
            }
        });

        btCadastroTarefa.setText("Cadastrar");
        btCadastroTarefa.setToolTipText("btCadastrar");
        btCadastroTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroTarefaActionPerformed(evt);
            }
        });

        inputTitulo.setToolTipText("inputTitulo");
        inputTitulo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                inputTituloComponentAdded(evt);
            }
        });
        inputTitulo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                inputTituloInputMethodTextChanged(evt);
            }
        });
        inputTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTituloActionPerformed(evt);
            }
        });

        jLabel1.setText("Título");

        jLabel2.setText("Descrição");

        inputDescricao.setColumns(20);
        inputDescricao.setRows(5);
        inputDescricao.setToolTipText("inputDescrição");
        jScrollPane1.setViewportView(inputDescricao);

        inputDataEntrega.setToolTipText("inputDataEntrega");
        inputDataEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDataEntregaActionPerformed(evt);
            }
        });

        jLabel3.setText("Data de Entrega");

        menuTarefas.setText("Tarefas");
        menuTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTarefasActionPerformed(evt);
            }
        });

        buttonGroup1.add(checkBaixa);
        checkBaixa.setText("Baixa");
        checkBaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBaixaActionPerformed(evt);
            }
        });

        jLabel4.setText("Prioridade");

        buttonGroup1.add(checkMedia);
        checkMedia.setText("Média");
        checkMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMediaActionPerformed(evt);
            }
        });

        buttonGroup1.add(checkAlta);
        checkAlta.setText("Alta");
        checkAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAltaActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGap(383, 383, 383))
                                .addComponent(inputDataEntrega)
                                .addComponent(jScrollPane1)
                                .addComponent(inputTitulo)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(checkBaixa)
                            .addGap(18, 18, 18)
                            .addComponent(checkMedia)
                            .addGap(18, 18, 18)
                            .addComponent(checkAlta))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addComponent(btCancelarCadastroTarefa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btCadastroTarefa)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menuTarefas)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuTarefas)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBaixa)
                    .addComponent(checkMedia)
                    .addComponent(checkAlta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastroTarefa)
                    .addComponent(btCancelarCadastroTarefa))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private static Tarefa tarefa;
    
    public static void setTarefas(Tarefa newTarefa){
        tarefa.setListaTarefas(newTarefa);
    }
   
    private void btCancelarCadastroTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarCadastroTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarCadastroTarefaActionPerformed

    private void inputTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTituloActionPerformed

    private void inputDataEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDataEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDataEntregaActionPerformed

    private void btCadastroTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroTarefaActionPerformed
        String Titulo = inputTitulo.getText();        
        String Descricao = inputDescricao.getText();
        String DataEntrega = inputDataEntrega.getText();
        String Prioridade = "";
        Boolean Status = false;
        
        if(checkAlta.isSelected()){
            Prioridade = "Alta";
        } else if(checkMedia.isSelected()){
            Prioridade = "Media";
        } else if(checkBaixa.isSelected()){
            Prioridade = "Baixa";
        }
        
        int ID = tarefa.Tarefas.size();
        
        Tarefa TarefaCriada = new Tarefa(ID, Titulo, Descricao, DataEntrega, Prioridade, Status);
        setTarefas(TarefaCriada);
        
    }//GEN-LAST:event_btCadastroTarefaActionPerformed

    private void menuTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTarefasActionPerformed
        new ListaTarefas().setVisible(true);  
        setVisible(false);   
    }//GEN-LAST:event_menuTarefasActionPerformed

    private void checkBaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBaixaActionPerformed

    private void checkMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMediaActionPerformed

    private void checkAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAltaActionPerformed

    private void inputTituloComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_inputTituloComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTituloComponentAdded

    private void inputTituloInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_inputTituloInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTituloInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(CadastroTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTarefa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btCadastroTarefa;
    private javax.swing.JButton btCancelarCadastroTarefa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton checkAlta;
    private javax.swing.JRadioButton checkBaixa;
    private javax.swing.JRadioButton checkMedia;
    private javax.swing.JTextField inputDataEntrega;
    private javax.swing.JTextArea inputDescricao;
    public javax.swing.JTextField inputTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuBar jMenuBar7;
    private javax.swing.JMenuBar jMenuBar8;
    private javax.swing.JMenuBar jMenuBar9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton menuTarefas;
    // End of variables declaration//GEN-END:variables
}
