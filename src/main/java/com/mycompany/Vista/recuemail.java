/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Vista;

import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import com.mycompany.Controlador.ControladorEmail;
import com.mycompany.Controlador.EmailUtil;
import java.security.Principal;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro Garcia vicente
 */
public class recuemail extends javax.swing.JFrame {

  /**
   * Creates new form recuemail
   */
  private iniciosesion loginn;
  private ControladorEmail cemail = new ControladorEmail();

  public recuemail() {
    initComponents();
    labelrpassw.putClientProperty("FlatLaf.style", "font: $h0.font");

    btnrecu.putClientProperty("JButton.buttonType", "roundRect");

    tfemail.putClientProperty("FlatLaf.style", "arc:" + 12);
    tfemail.putClientProperty("JTextField.placeholderText", "Introduzca Email");
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelemail = new javax.swing.JLabel();
        labeltitulo = new javax.swing.JLabel();
        labelrpassw = new javax.swing.JLabel();
        tfemail = new javax.swing.JTextField();
        btnrecu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(461, 814));

        labelemail.setText("Email");

        labeltitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labeltitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NGALAXYSTARf.png"))); // NOI18N

        labelrpassw.setText("Recuperar Contraseña");

        tfemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfemailActionPerformed(evt);
            }
        });

        btnrecu.setBackground(new java.awt.Color(75, 6, 99));
        btnrecu.setForeground(new java.awt.Color(255, 255, 255));
        btnrecu.setText("Recuperar");
        btnrecu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnrecu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(labelemail, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnrecu, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labeltitulo)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelrpassw, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(labeltitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelrpassw, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(labelemail)
                .addGap(18, 18, 18)
                .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnrecu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnrecuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecuActionPerformed
    // TODO add your handling code here:
    String mail = tfemail.getText();
    boolean existe = cemail.verificarEmail(mail);

    if (existe) {
      String nuevac = cemail.generarContrasena(8, 20);
      final String fromemail = "pedro.garvic@educa.jcyl.es";
      final String password = "Pedro2327";
      final String toemail = mail;
      System.out.println("SSLEmail Start");
      Properties props = new Properties();
      props.put("mail.smtp.host", "smtp-mail.outlook.com");
      props.put("mail.smtp.port", "587");
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");

      Authenticator auth = new Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
          return new PasswordAuthentication(fromemail, password);
        }
      };

      Session session = Session.getDefaultInstance(props, auth);
      System.out.println("Session created");
      try {
        EmailUtil.sendEmail(session, toemail, "SSLEmail Testing Subject", nuevac);
      } catch (MessagingException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
      }
      JOptionPane.showMessageDialog(rootPane, "Se le ha enviado el correo de recuperar contraseña");
      cemail.actualizarContrasena(mail, nuevac);
      if (loginn == null) {
        loginn = new iniciosesion();
        loginn.setVisible(true);
      }
      dispose();
    } else {
      JOptionPane.showMessageDialog(rootPane, "No existe el correo en la base de datos");
    }

    }//GEN-LAST:event_btnrecuActionPerformed

    private void tfemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfemailActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_tfemailActionPerformed

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
      java.util.logging.Logger.getLogger(recuemail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(recuemail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(recuemail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(recuemail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    FlatLightFlatIJTheme.setup();

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new recuemail().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnrecu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelemail;
    private javax.swing.JLabel labelrpassw;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JTextField tfemail;
    // End of variables declaration//GEN-END:variables
}
