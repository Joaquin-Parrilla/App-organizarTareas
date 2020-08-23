package gui;
//import java.awt.Color;
import java.util.Arrays;
//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.*;

/**
 *
 * @author joaquin
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        loginFramePropert();
    }
    
    private void loginFramePropert(){
        try{
            this.setLocationRelativeTo(null); //centrar JFrame.-
            
            jCheckBoxShowPsw.setSelected(false);  // por defecto no se debe mostrar la password
            jPasswordField.setEchoChar('*');
            
            //btnSalir.setOpaque(false);
            //btnSalir.setBackground(new Color(0,0,0,0));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Se produjo un error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void editMainFrameProperties() {
        AppMainJFrame.setSize(750, 550);
        AppMainJFrame.setTitle("Organiza Mis Tareas - App");
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AppMainJFrame = new javax.swing.JFrame();
        txtUsuario = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCrearCuenta = new javax.swing.JButton();
        jCheckBoxShowPsw = new javax.swing.JCheckBox();

        AppMainJFrame.setSize(new java.awt.Dimension(713, 444));

        javax.swing.GroupLayout AppMainJFrameLayout = new javax.swing.GroupLayout(AppMainJFrame.getContentPane());
        AppMainJFrame.getContentPane().setLayout(AppMainJFrameLayout);
        AppMainJFrameLayout.setHorizontalGroup(
            AppMainJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        AppMainJFrameLayout.setVerticalGroup(
            AppMainJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });

        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        btnClose.setText("x");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel3.setText("LOGIN - Organiza Mis Tareas");

        jLabel4.setText("BETA - v1.0");

        btnCrearCuenta.setText("Crear una cuenta");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        jCheckBoxShowPsw.setText("Mostrar contraseña");
        jCheckBoxShowPsw.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxShowPswStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBoxShowPsw)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsuario)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                    .addComponent(jPasswordField)
                                    .addComponent(btnCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnClose)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jCheckBoxShowPsw)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearCuenta)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        // evento foco perdido
        /**
         * 
         
        if(txtUsuario.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"Debe ingresar un nombre de usuario","Error", JOptionPane.ERROR_MESSAGE);
        }else if(! buscarUsr(txtUsuario.getText())){
            JOptionPane.showMessageDialog(null,"Usuario incorrecto","Error", JOptionPane.ERROR_MESSAGE);
        }
        */
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
        // evento foco perdido
        /**
        if(jPasswordField.getPassword().length == 0){
            JOptionPane.showMessageDialog(null,"Debe ingresar una contraseña","Error", JOptionPane.ERROR_MESSAGE);
        }else if(!validarPsw(txtUsuario.getText())){
            JOptionPane.showMessageDialog(null,"Contraseña no coincide con el usuario ingresado","Error", JOptionPane.ERROR_MESSAGE);
            jPasswordField.setText("");
        }
        */
    }//GEN-LAST:event_jPasswordFieldFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Button LOGIN:
        try{
            
            if (txtUsuario.getText().length() == 0 || jPasswordField.getText().length() == 0) {
                JOptionPane.showMessageDialog(null,"faltan datos");
            } else {
                
                ControladorLogica logica = ControladorLogica.getInstance();
                boolean loginExitoso = logica.login(txtUsuario.getText(), obtenerStringPsw(jPasswordField.getPassword()));
                
                if (loginExitoso) {
                    JOptionPane.showMessageDialog(null, "login exitoso");
                    
                    this.setVisible(false);
                    AppMainJFrame.setVisible(true);
                    editMainFrameProperties();
                    
                } else {
                    JOptionPane.showMessageDialog(null, "login fallido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se produjo un error al intentar iniciar sesión","Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
    
        if (JOptionPane.showConfirmDialog(null, "¿Desea salir del login?", "Confirme salida", JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE) == 0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        
        JOptionPane.showMessageDialog(null,"Por ahora esta funcionalidad esta fuera de servicio.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void jCheckBoxShowPswStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxShowPswStateChanged
        if (jCheckBoxShowPsw.isSelected())
            jPasswordField.setEchoChar((char)0);
        else
            jPasswordField.setEchoChar('*');
    }//GEN-LAST:event_jCheckBoxShowPswStateChanged

    private String obtenerStringPsw(char[] psw){
        String password = "";
        for (char p : psw) {
            password += p;
        }
        return password;        
    }

    /**
     * @param argumentos...
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame AppMainJFrame;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBoxShowPsw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}