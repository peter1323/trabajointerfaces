/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Vista;

import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import com.mycompany.Controlador.sqlhelperlogin;
import com.mycompany.Modelo.Usuarios;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro Garcia vicente
 */
public class iniciosesion extends javax.swing.JFrame {

  private Registro regis;
  private sqlhelperlogin sql = new sqlhelperlogin();
  private Dashboard dash;
  private recuemail recu;

  /**
   * Creates new form iniciosesion
   */
  public iniciosesion() {
    initComponents();
    labelsig.putClientProperty("FlatLaf.style", "font: $h0.font");
    tfusername.putClientProperty("FlatLaf.style", "arc:" + 12);
    // UIManager.put( "TextComponent.arc", 999 );
    tfusername.putClientProperty("JTextField.placeholderText", "Introduzca usuario");

    tfpassword.putClientProperty("FlatLaf.style", "arc:" + 12);
    tfpassword.putClientProperty("JTextField.placeholderText", "Introduzca contraseña");
    btnini.putClientProperty("JButton.buttonType", "roundRect");
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labeltitulo = new javax.swing.JLabel();
        labelsig = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelregistro = new javax.swing.JLabel();
        labelusuario = new javax.swing.JLabel();
        tfpassword = new javax.swing.JTextField();
        labelcontraseña = new javax.swing.JLabel();
        tfusername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnini = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labeltitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labeltitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NGALAXYSTARf.png"))); // NOI18N

        labelsig.setText("Iniciar Sesión");

        jLabel1.setText("No tienes cuenta ");

        labelregistro.setForeground(new java.awt.Color(80, 5, 72));
        labelregistro.setText("Registrate");
        labelregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelregistroMouseClicked(evt);
            }
        });

        labelusuario.setText("Username");

        labelcontraseña.setText("Contraseña");

        jLabel2.setForeground(new java.awt.Color(52, 4, 69));
        jLabel2.setText("Olvidastes la Contraseña");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        btnini.setBackground(new java.awt.Color(75, 6, 99));
        btnini.setForeground(new java.awt.Color(255, 255, 255));
        btnini.setText("Iniciar Sesión");
        btnini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labeltitulo)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfusername, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelregistro))
                            .addComponent(labelsig, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(labelcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(labelusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnini, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labeltitulo)
                .addGap(18, 18, 18)
                .addComponent(labelsig, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelregistro))
                .addGap(33, 33, 33)
                .addComponent(labelusuario)
                .addGap(18, 18, 18)
                .addComponent(tfusername, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelcontraseña)
                .addGap(18, 18, 18)
                .addComponent(tfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnini, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(345, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  private void labelregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelregistroMouseClicked
    // TODO add your handling code here:
    regis = new Registro();
    regis.setVisible(true);
    dispose();
  }//GEN-LAST:event_labelregistroMouseClicked

    private void btniniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniActionPerformed
    // TODO add your handling code here:
    String usu = tfusername.getText();
    String cont = tfpassword.getText();
    try {
      // Obtener la contraseña almacenada del usuario
      String contrasenaAlmacenada = sql.obtenerContrasenaDeUsuario(usu);

      // Verificar si la contraseña almacenada coincide con la ingresada por el usuario
      boolean comprueba = sql.verificarContrasena(cont, contrasenaAlmacenada);

      if (!comprueba) {
        JOptionPane.showMessageDialog(rootPane, "Credenciales no válidas", "Error en el inicio de sesión", JOptionPane.ERROR_MESSAGE);
      } else {
        //// Si el inicio de sesión es exitoso, guarda el usuario
        /*Usuarios user = new Usuarios();
        user.setUsuario(usu);*/
        File f = new File("src/main/resources/nombreusuario.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
          // Escribir en el archivo
          writer.write(usu);
          writer.newLine();
          System.out.println("Información guardada en el archivo: " + f);
        } catch (IOException e) {
          e.printStackTrace();
        }
        // Acceder al usuario guardado esto en otro frame
        //String usuario = MiClase.getUsuarioActual();
        // Usa el valor del usuario como sea necesario en este otro frame
        dispose();
        // para ir a la otra ventana
        Dashboard dash = new Dashboard();
        // cerrar o esconder antes de abrir principal
        dash.setVisible(true);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    }//GEN-LAST:event_btniniActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    // TODO add your handling code here:
    recu = new recuemail();
    recu.setVisible(true);
    dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
      java.util.logging.Logger.getLogger(iniciosesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(iniciosesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(iniciosesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(iniciosesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    FlatLightFlatIJTheme.setup();

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new iniciosesion().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnini;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelcontraseña;
    private javax.swing.JLabel labelregistro;
    private javax.swing.JLabel labelsig;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JLabel labelusuario;
    private javax.swing.JTextField tfpassword;
    private javax.swing.JTextField tfusername;
    // End of variables declaration//GEN-END:variables
}
