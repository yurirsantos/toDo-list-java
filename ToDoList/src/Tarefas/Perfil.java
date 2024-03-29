/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tarefas;

import javax.swing.JOptionPane;

/**
 *
 * @author yuri
 */
public class Perfil extends javax.swing.JFrame {

    /**
     * Creates new form Perfil
     */
    public Perfil() {
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

        inputTitulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        menuHome = new javax.swing.JButton();
        inputNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        labelTipoUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelTipoUsuario1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btTrocarSenha = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        inputSenha = new javax.swing.JPasswordField();
        inputConfirmacaoSenha = new javax.swing.JPasswordField();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuHome.setText("Home");
        menuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHomeActionPerformed(evt);
            }
        });

        inputNome.setToolTipText("inputTitulo");
        inputNome.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                inputNomeComponentAdded(evt);
            }
        });
        inputNome.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                inputNomeInputMethodTextChanged(evt);
            }
        });
        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        inputEmail.setToolTipText("inputTitulo");
        inputEmail.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                inputEmailComponentAdded(evt);
            }
        });
        inputEmail.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                inputEmailInputMethodTextChanged(evt);
            }
        });
        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });

        jLabel3.setText("E-mail");

        labelTipoUsuario.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        labelTipoUsuario.setText("Tipo de Usuario");

        jLabel4.setText("Senha");

        labelTipoUsuario1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        labelTipoUsuario1.setText("Troca de Senha");

        jLabel5.setText("Tipo de Usuario:");

        jLabel6.setText("Confirmação de Senha");

        btTrocarSenha.setText("Trocar Senha");
        btTrocarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTrocarSenhaActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuHome)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputConfirmacaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(196, 196, 196)
                                    .addComponent(labelTipoUsuario1))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(labelTipoUsuario))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel4))
                                .addComponent(btTrocarSenha)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel6))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(btCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btSalvar))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoUsuario)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelTipoUsuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputConfirmacaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btTrocarSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHomeActionPerformed
        new Home().setVisible(true);
        setVisible(false);
        Home.getUsuarioLogin();
    }//GEN-LAST:event_menuHomeActionPerformed

    public static void setInfoUsuario(){
        int idUsuario = Usuario.getLoginUsuarioId();
        
        labelTipoUsuario.setText(Usuario.getTipoUsuario(idUsuario));
        inputNome.setText(Usuario.getNomeUsuario(idUsuario));        
        inputEmail.setText(Usuario.getEmailUsuario(idUsuario));
    }
    
    private void inputTituloComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_inputTituloComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTituloComponentAdded

    private void inputTituloInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_inputTituloInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTituloInputMethodTextChanged

    private void inputTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTituloActionPerformed

    }//GEN-LAST:event_inputTituloActionPerformed

    private void inputNomeComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_inputNomeComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeComponentAdded

    private void inputNomeInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_inputNomeInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeInputMethodTextChanged

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed

    }//GEN-LAST:event_inputNomeActionPerformed

    private void inputEmailComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_inputEmailComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailComponentAdded

    private void inputEmailInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_inputEmailInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailInputMethodTextChanged

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
       new Home().setVisible(true);
        setVisible(false);
        Home.getUsuarioLogin();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        String newNome = inputNome.getText();
        String newEmail = inputEmail.getText();
        
        Usuario.setNewNome(newNome, Usuario.getLoginUsuarioId());        
        Usuario.setNewEmail(newEmail, Usuario.getLoginUsuarioId());
        
        JOptionPane.showMessageDialog(null, "Usuário(a) atualizado(a)!");
         
        if(JOptionPane.YES_OPTION == 0){
            new Home().setVisible(true);
            setVisible(false);
            Home.getUsuarioLogin();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btTrocarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTrocarSenhaActionPerformed
        String senha = inputSenha.getText();
        String confirmacaoSenha = inputConfirmacaoSenha.getText();
        
        if(senha.equals(confirmacaoSenha)){
            Usuario.setNewSenha(senha, Usuario.getLoginUsuarioId());
            JOptionPane.showMessageDialog(null, "Senha alterada!");
            
            if (JOptionPane.YES_OPTION == 0) {
                new Login().setVisible(true);
                setVisible(false);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Senha são DEIFERENTES!");
        }
    }//GEN-LAST:event_btTrocarSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btTrocarSenha;
    private javax.swing.JPasswordField inputConfirmacaoSenha;
    public static javax.swing.JTextField inputEmail;
    public static javax.swing.JTextField inputNome;
    private javax.swing.JPasswordField inputSenha;
    public static javax.swing.JTextField inputTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private static javax.swing.JLabel labelTipoUsuario;
    private static javax.swing.JLabel labelTipoUsuario1;
    private javax.swing.JButton menuHome;
    // End of variables declaration//GEN-END:variables
}
