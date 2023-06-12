package Tarefas;

import static Tarefas.Agradecimento.fraseTela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author yuri
 */
public class EdicaoTarefa extends javax.swing.JFrame {

    /**
     * Creates new form EdiçãoTarefa
     */
    public EdicaoTarefa() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        menuCadastro = new javax.swing.JButton();
        menuTarefas = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        checkAlta = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDescricao = new javax.swing.JTextArea();
        inputDataEntrega = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        checkBaixa = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        inputTitulo = new javax.swing.JTextField();
        checkMedia = new javax.swing.JRadioButton();
        textStatusTarefa = new javax.swing.JLabel();
        btFinalizarTarefa = new javax.swing.JButton();
        btAbrirTarefa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCadastro.setText("Cadastro");
        menuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroActionPerformed(evt);
            }
        });

        menuTarefas.setText("Tarefas");
        menuTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTarefasActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jLabel1.setText("Título");

        buttonGroup1.add(checkAlta);
        checkAlta.setText("Alta");
        checkAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAltaActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição");

        inputDescricao.setColumns(20);
        inputDescricao.setRows(5);
        inputDescricao.setToolTipText("inputDescrição");
        inputDescricao.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                inputDescricaoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(inputDescricao);

        inputDataEntrega.setToolTipText("inputDataEntrega");
        inputDataEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDataEntregaActionPerformed(evt);
            }
        });

        jLabel3.setText("Data de Entrega");

        buttonGroup1.add(checkBaixa);
        checkBaixa.setText("Baixa");
        checkBaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBaixaActionPerformed(evt);
            }
        });

        jLabel4.setText("Prioridade");

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

        buttonGroup1.add(checkMedia);
        checkMedia.setText("Média");
        checkMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMediaActionPerformed(evt);
            }
        });

        textStatusTarefa.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        textStatusTarefa.setText("Status");
        textStatusTarefa.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                textStatusTarefaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btFinalizarTarefa.setText("Finalizar Tarefa");
        btFinalizarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarTarefaActionPerformed(evt);
            }
        });

        btAbrirTarefa.setText("Abrir Tarefa");
        btAbrirTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirTarefaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuTarefas)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textStatusTarefa)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btCancelar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btSalvar))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(383, 383, 383))
                                .addComponent(inputDataEntrega, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkBaixa)
                                .addGap(18, 18, 18)
                                .addComponent(checkMedia)
                                .addGap(18, 18, 18)
                                .addComponent(checkAlta))
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAbrirTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btFinalizarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(125, 125, 125))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuCadastro)
                    .addComponent(menuTarefas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textStatusTarefa))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAbrirTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btFinalizarTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btSalvar))
                .addContainerGap())
        );

        inputTitulo.getAccessibleContext().setAccessibleParent(inputTitulo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroActionPerformed
        new CadastroTarefa().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_menuCadastroActionPerformed
    
    public static void setInfoTarefa() {
        if (inputTitulo != null || inputDescricao != null || inputDataEntrega != null) {
            inputTitulo.setText(Tarefa.getTitleTarefa(Tarefa.IDTarefaEdicao));            
            inputDescricao.setText(Tarefa.getDescricaoTarefa(Tarefa.IDTarefaEdicao));            
            inputDataEntrega.setText(Tarefa.getDataEntregaTarefa(Tarefa.IDTarefaEdicao));
            
            textStatusTarefa.setText(Tarefa.getStatusTarefa(Tarefa.IDTarefaEdicao));
            
            if("Finalizado".equals(Tarefa.getStatusTarefa(Tarefa.IDTarefaEdicao))){
                btFinalizarTarefa.setVisible(false);                
                btAbrirTarefa.setVisible(true);
            }else {                
                btFinalizarTarefa.setVisible(true);                
                btAbrirTarefa.setVisible(false);
            }
                   
            switch (Tarefa.getPrioridadeTarefa(Tarefa.IDTarefaEdicao)) {
                
            case "Alta":
                checkAlta.setSelected(true);
                break;
            case "Média":
                checkMedia.setSelected(true);
                break;
            case "Baixa":
                checkBaixa.setSelected(true);
                break;
            default:
                break;
            }  
 
        }
    }
    
    private void menuTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTarefasActionPerformed
        new ListaTarefas().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_menuTarefasActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        new ListaTarefas().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
       String newPrioridade = "";
        
       Tarefa.setNewTitleTarefa(inputTitulo.getText());       
       Tarefa.setNewDescricaoTarefa(inputDescricao.getText());
       Tarefa.setNewDataEntregaTarefa(inputDataEntrega.getText());
       
       if(checkAlta.isSelected()){
           newPrioridade = "Alta";
       } else if(checkMedia.isSelected()){
           newPrioridade = "Média";
       } else if(checkBaixa.isSelected()){
           newPrioridade = "Baixa";
       }
       
       Tarefa.setNewPrioridade(newPrioridade);
       
       Agradecimento.setFrase("Tarefa atualizada com sucesso!");
       new Agradecimento().setVisible(true);
       setVisible(false);

    }//GEN-LAST:event_btSalvarActionPerformed

    private void checkAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAltaActionPerformed

    private void inputDataEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDataEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDataEntregaActionPerformed

    private void checkBaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBaixaActionPerformed

    private void checkMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMediaActionPerformed
                                 
    private void inputTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTituloActionPerformed

    }//GEN-LAST:event_inputTituloActionPerformed

    private void inputTituloInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_inputTituloInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTituloInputMethodTextChanged

    private void inputTituloComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_inputTituloComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTituloComponentAdded

    private void inputDescricaoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_inputDescricaoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDescricaoAncestorAdded

    private void textStatusTarefaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textStatusTarefaAncestorAdded

    }//GEN-LAST:event_textStatusTarefaAncestorAdded

    private void btFinalizarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarTarefaActionPerformed
        Tarefa.setNewStatus(true);
               
        Agradecimento.setFrase("Tarefa finalizada com sucesso!");
        new Agradecimento().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btFinalizarTarefaActionPerformed

    private void btAbrirTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirTarefaActionPerformed
        Tarefa.setNewStatus(false);
               
        Agradecimento.setFrase("Tarefa aberta com sucesso!");
        new Agradecimento().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btAbrirTarefaActionPerformed

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
            java.util.logging.Logger.getLogger(EdicaoTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdicaoTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdicaoTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdicaoTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EdicaoTarefa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btAbrirTarefa;
    private javax.swing.JButton btCancelar;
    public static javax.swing.JButton btFinalizarTarefa;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JRadioButton checkAlta;
    public static javax.swing.JRadioButton checkBaixa;
    public static javax.swing.JRadioButton checkMedia;
    public static javax.swing.JTextField inputDataEntrega;
    public static javax.swing.JTextArea inputDescricao;
    public static javax.swing.JTextField inputTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menuCadastro;
    private javax.swing.JButton menuTarefas;
    public static javax.swing.JLabel textStatusTarefa;
    // End of variables declaration//GEN-END:variables


}
