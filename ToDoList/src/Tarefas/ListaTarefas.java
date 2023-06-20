/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tarefas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yuri
 */
public class ListaTarefas extends javax.swing.JFrame {

    /**
     * Creates new form ListaTarefas
     */
    public ListaTarefas() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaTarefas = new javax.swing.JTable();
        menuCadastroTarefa = new javax.swing.JButton();
        btAcessarTarefa = new javax.swing.JButton();
        inputIDTarefa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuHome = new javax.swing.JButton();
        menuCadastroUsuário = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 300));

        tableListaTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Descrição", "Data de Entrega", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableListaTarefas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableListaTarefasAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tableListaTarefas);

        menuCadastroTarefa.setText("Cadastro Tarefa");
        menuCadastroTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroTarefaActionPerformed(evt);
            }
        });

        btAcessarTarefa.setText("Acessar");
        btAcessarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcessarTarefaActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Tarefa");

        jLabel2.setText("Informe o ID da tarefa para edição");

        menuHome.setText("Home");
        menuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHomeActionPerformed(evt);
            }
        });

        menuCadastroUsuário.setText("Cadastro Usuário");
        menuCadastroUsuário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroUsuárioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menuHome)
                        .addGap(12, 12, 12)
                        .addComponent(menuCadastroTarefa)
                        .addGap(12, 12, 12)
                        .addComponent(menuCadastroUsuário))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputIDTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btAcessarTarefa))
                    .addComponent(jLabel2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuHome)
                    .addComponent(menuCadastroTarefa)
                    .addComponent(menuCadastroUsuário))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputIDTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAcessarTarefa))
                .addGap(6, 6, 6)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    List<Tarefa> listaTarefas;
    DefaultTableModel modeloTabela = new DefaultTableModel();
    
    private void menuCadastroTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroTarefaActionPerformed
        new CadastroTarefa().setVisible(true);  
        CadastroTarefa.setListaUsuarios();
        setVisible(false);   
    }//GEN-LAST:event_menuCadastroTarefaActionPerformed

    private void tableListaTarefasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableListaTarefasAncestorAdded
        if(Usuario.getTipoUsuario().equals("Normal")){
            listaTarefas = Tarefa.getTarefaUsuarioEspecifico(Usuario.getLoginUsuarioId());
        } else {
            listaTarefas = Tarefa.getListaTarefas();

        }
        
        modeloTabela.addColumn("ID");
        modeloTabela.addColumn("Título");
        modeloTabela.addColumn("Descrição");    
        modeloTabela.addColumn("Data de Entrega");
        modeloTabela.addColumn("Prioridade");      
        modeloTabela.addColumn("Responsável");    
        modeloTabela.addColumn("Status");

        int i = 0;

        for (Tarefa tarefa : listaTarefas) {
            modeloTabela.addRow(new Object[]{
                Tarefa.getIdTarefa(i), 
                Tarefa.getTitleTarefa(i, listaTarefas), 
                Tarefa.getDescricaoTarefa(i, listaTarefas), 
                Tarefa.getDataEntregaTarefa(i, listaTarefas), 
                Tarefa.getPrioridadeTarefa(i, listaTarefas), 
                Tarefa.getUsuarioResponsavel(Tarefa.getIdUsuarioResponsavel(i, listaTarefas)),
                Tarefa.getStatusTarefa(i, listaTarefas),
            });      

            i = i + 1;
        }

        tableListaTarefas.setModel(modeloTabela);
   
    }//GEN-LAST:event_tableListaTarefasAncestorAdded

    private void btAcessarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcessarTarefaActionPerformed
        int IDSelect = Integer.parseInt(inputIDTarefa.getText());
        
        if(IDSelect >= 0){
            Boolean testeIdTarefa = Tarefa.selectIdTarefaEdicao(IDSelect);
            
            if(testeIdTarefa){
                new EdicaoTarefa().setVisible(true);
                setVisible(false);
                
                EdicaoTarefa.setInfoTarefa();
            }else {
                JOptionPane.showMessageDialog(null, "Informe um ID existente!");
        
                if(JOptionPane.YES_OPTION == 0){
                    new ListaTarefas().setVisible(true);
                    setVisible(false);
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Informe um ID para consulta!");
        
            if(JOptionPane.YES_OPTION == 0){
                new ListaTarefas().setVisible(true);
                setVisible(false);
            }
        }
    }//GEN-LAST:event_btAcessarTarefaActionPerformed

    private void menuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHomeActionPerformed
        new Home().setVisible(true);
        setVisible(false);
        Home.getUsuarioLogin();
    }//GEN-LAST:event_menuHomeActionPerformed

    private void menuCadastroUsuárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroUsuárioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadastroUsuárioActionPerformed

    public static void getUsuarioLogin(){
        if(Usuario.getTipoUsuario().equals("Normal")){
            menuCadastroTarefa.setVisible(false);
            menuCadastroUsuário.setVisible(false);
        }  
    }
    
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
            java.util.logging.Logger.getLogger(ListaTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaTarefas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcessarTarefa;
    private javax.swing.JTextField inputIDTarefa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JButton menuCadastroTarefa;
    private static javax.swing.JButton menuCadastroUsuário;
    private javax.swing.JButton menuHome;
    private javax.swing.JTable tableListaTarefas;
    // End of variables declaration//GEN-END:variables
}
