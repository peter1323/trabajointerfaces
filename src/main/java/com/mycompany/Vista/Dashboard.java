/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Vista;

import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import com.mycompany.Modelo.Usuarios;
import java.awt.Color;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 * @author pedro Garcia vicente
 */
public class Dashboard extends javax.swing.JFrame {

  private SessionFactory sessionFactory;
 

  /**
   * Creates new form Dashboard
   */
  //Fondopanel fondo = new Fondopanel();
  public Dashboard() {
    // this.setContentPane(fondo);
    initComponents();
    mostrarpanel(new inicio());
    //btnmenu.putClientProperty("JButton.buttonType", "arc:5");
    UIManager.put("Button.arc", 5);

    /* //---- buttonGroup1 ----
    ButtonGroup buttonGroup1 = new ButtonGroup();
    buttonGroup1.add(jToggleButton2);
    buttonGroup1.add(jToggleButton3);
    buttonGroup1.add(jToggleButton4);
    buttonGroup1.add(jToggleButton5);
     */
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        btninscriequipo = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btninscrientrenador = new javax.swing.JButton();
        btnborrarentre = new javax.swing.JButton();
        btninscrijugadores = new javax.swing.JButton();
        btnactualizarjuga = new javax.swing.JButton();
        frame = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(291, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame-modified.png"))); // NOI18N
        jLabel1.setText("NGALAXYSTAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 47, -1, -1));

        btnactualizar.setBackground(new java.awt.Color(51, 51, 51));
        btnactualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Car.png"))); // NOI18N
        btnactualizar.setText("Actualizar Equipo");
        btnactualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnactualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnactualizar.setIconTextGap(10);
        btnactualizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnactualizarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnactualizarFocusLost(evt);
            }
        });
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 220, 40));

        btnmenu.setBackground(new java.awt.Color(51, 51, 51));
        btnmenu.setForeground(new java.awt.Color(255, 255, 255));
        btnmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Dashboard.png"))); // NOI18N
        btnmenu.setText("Dashboard");
        btnmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnmenu.setIconTextGap(13);
        btnmenu.setMargin(new java.awt.Insets(2, 12, 3, 14));
        btnmenu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnmenuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnmenuFocusLost(evt);
            }
        });
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 40));

        btninscriequipo.setBackground(new java.awt.Color(51, 51, 51));
        btninscriequipo.setForeground(new java.awt.Color(255, 255, 255));
        btninscriequipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fa-solid_user-edit.png"))); // NOI18N
        btninscriequipo.setText("Inscribir Equipo");
        btninscriequipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninscriequipo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btninscriequipo.setIconTextGap(10);
        btninscriequipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btninscriequipoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btninscriequipoFocusLost(evt);
            }
        });
        btninscriequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninscriequipoActionPerformed(evt);
            }
        });
        jPanel1.add(btninscriequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 220, 40));

        btnlogout.setBackground(new java.awt.Color(51, 51, 51));
        btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame 39997.png"))); // NOI18N
        btnlogout.setText("Cerrar Sesion");
        btnlogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogout.setIconTextGap(10);
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 790, 220, 50));

        btninscrientrenador.setBackground(new java.awt.Color(51, 51, 51));
        btninscrientrenador.setForeground(new java.awt.Color(255, 255, 255));
        btninscrientrenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fa-solid_user-tie.png"))); // NOI18N
        btninscrientrenador.setText("Inscribir entrenador");
        btninscrientrenador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninscrientrenador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btninscrientrenador.setIconTextGap(17);
        btninscrientrenador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btninscrientrenadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btninscrientrenadorFocusLost(evt);
            }
        });
        btninscrientrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninscrientrenadorActionPerformed(evt);
            }
        });
        jPanel1.add(btninscrientrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 220, 40));

        btnborrarentre.setBackground(new java.awt.Color(51, 51, 51));
        btnborrarentre.setForeground(new java.awt.Color(255, 255, 255));
        btnborrarentre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fa-solid_user-times.png"))); // NOI18N
        btnborrarentre.setText("Borrar entrenador");
        btnborrarentre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnborrarentre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnborrarentre.setIconTextGap(9);
        btnborrarentre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnborrarentreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnborrarentreFocusLost(evt);
            }
        });
        btnborrarentre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarentreActionPerformed(evt);
            }
        });
        jPanel1.add(btnborrarentre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 220, 40));

        btninscrijugadores.setBackground(new java.awt.Color(51, 51, 51));
        btninscrijugadores.setForeground(new java.awt.Color(255, 255, 255));
        btninscrijugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fa-solid_user-edit.png"))); // NOI18N
        btninscrijugadores.setText("Inscribir Jugadores");
        btninscrijugadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninscrijugadores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btninscrijugadores.setIconTextGap(10);
        btninscrijugadores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btninscrijugadoresFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btninscrijugadoresFocusLost(evt);
            }
        });
        btninscrijugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninscrijugadoresActionPerformed(evt);
            }
        });
        jPanel1.add(btninscrijugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 220, 40));

        btnactualizarjuga.setBackground(new java.awt.Color(51, 51, 51));
        btnactualizarjuga.setForeground(new java.awt.Color(255, 255, 255));
        btnactualizarjuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Car.png"))); // NOI18N
        btnactualizarjuga.setText("Actualizar jugadores");
        btnactualizarjuga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnactualizarjuga.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnactualizarjuga.setIconTextGap(10);
        btnactualizarjuga.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnactualizarjugaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnactualizarjugaFocusLost(evt);
            }
        });
        btnactualizarjuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarjugaActionPerformed(evt);
            }
        });
        jPanel1.add(btnactualizarjuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 220, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        javax.swing.GroupLayout frameLayout = new javax.swing.GroupLayout(frame);
        frame.setLayout(frameLayout);
        frameLayout.setHorizontalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        frameLayout.setVerticalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 0, 1160, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
   * boton para ir a un panel
   *
   * @param evt
   */
  private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
    // TODO add your handling code here:
    mostrarpanel(new actuequipo());
  }//GEN-LAST:event_btnactualizarActionPerformed

  /**
   * boton para ir a un panel
   *
   * @param evt
   */
  private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
    // TODO add your handling code here:
    mostrarpanel(new inicio());
  }//GEN-LAST:event_btnmenuActionPerformed

  /**
   * boton para ir a un panel
   *
   * @param evt
   */
  private void btninscriequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninscriequipoActionPerformed
    // TODO add your handling code here:
    mostrarpanel(new inscriequipo());
  }//GEN-LAST:event_btninscriequipoActionPerformed

  /**
   * boton para cerrar la sesion
   *
   * @param evt
   */
  private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
    // TODO add your handling code here:
    System.exit(0);
  }//GEN-LAST:event_btnlogoutActionPerformed

  /**
   * boton para ir a un panel
   *
   * @param evt
   */
  private void btninscrientrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninscrientrenadorActionPerformed
    // TODO add your handling code here:
    mostrarpanel(new inscrientrenador());
  }//GEN-LAST:event_btninscrientrenadorActionPerformed

  /**
   * boton para ir a un panel
   *
   * @param evt
   */
  private void btnborrarentreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarentreActionPerformed
    // TODO add your handling code here:
    mostrarpanel(new borrarentrenador());
  }//GEN-LAST:event_btnborrarentreActionPerformed

  /**
   * boton para ir a un panel
   *
   * @param evt
   */
  private void btninscrijugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninscrijugadoresActionPerformed
    // TODO add your handling code here:
    mostrarpanel(new inscrijugador());
  }//GEN-LAST:event_btninscrijugadoresActionPerformed

  /**
   * boton para ir a un panel
   *
   * @param evt
   */
  private void btnactualizarjugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarjugaActionPerformed
    // TODO add your handling code here:
    mostrarpanel(new actujugador());
  }//GEN-LAST:event_btnactualizarjugaActionPerformed
    
  /**
     * evento del boton dashboard para que cambie de color a azul
     * @param evt 
     */
    private void btnmenuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnmenuFocusGained
        // TODO add your handling code here:
        
        int red = 0;    
        int green = 106;   
        int blue = 255; 
        
        Color color = new Color(red, green, blue);
        evt.getComponent().setBackground(color);
    }//GEN-LAST:event_btnmenuFocusGained
    /**
     * Metodo para que cambie el boton dashboard cuando ya no este focus al color por defecto
     * @param evt 
     */
    private void btnmenuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnmenuFocusLost
        // TODO add your handling code here:
        int red = 51;    
        int green = 51;    
        int blue = 51;     
        Color color = new Color(red, green, blue);
        
        evt.getComponent().setBackground(color);
    }//GEN-LAST:event_btnmenuFocusLost

    /**
     * evento del boton inscribir equipo para que cambie de color a azul
     * @param evt 
     */
        
    private void btninscriequipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btninscriequipoFocusGained
        // TODO add your handling code here:
        int red = 0;    
        int green = 106;   
        int blue = 255; 
        
        Color color = new Color(red, green, blue);
        evt.getComponent().setBackground(color);
    }//GEN-LAST:event_btninscriequipoFocusGained
/**
 *  Metodo para que cambie el boton inserte equipo cuando ya no este focus al color por defecto
 * @param evt 
 */
    private void btninscriequipoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btninscriequipoFocusLost
        // TODO add your handling code here:
        int red = 51;    
        int green = 51;   
        int blue = 51;    
        Color color = new Color(red, green, blue);
        
        evt.getComponent().setBackground(color);
    }//GEN-LAST:event_btninscriequipoFocusLost

    /**
     * evento del boton actualizar equipo  para que cambie de color a azul
     * @param evt 
     */
    private void btnactualizarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnactualizarFocusGained
        // TODO add your handling code here:
        int red = 0;    
        int green = 106;   
        int blue = 255; 
        
        Color color = new Color(red, green, blue);
        evt.getComponent().setBackground(color);
    }//GEN-LAST:event_btnactualizarFocusGained

    /**
     * Metodo para que cambie el boton actualizar equipo cuando ya no este focus al color por defecto
     * @param evt 
     */
    private void btnactualizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnactualizarFocusLost
        // TODO add your handling code here:
        int red = 51;    
        int green = 51;    
        int blue = 51;     
        Color color = new Color(red, green, blue);
        
        evt.getComponent().setBackground(color);
    }//GEN-LAST:event_btnactualizarFocusLost

    /**
     * evento del boton inscribir entrenador para que cambie de color a azul
     * @param evt 
     */
    private void btninscrientrenadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btninscrientrenadorFocusGained
        // TODO add your handling code here:
        int red = 0;    
        int green = 106;   
        int blue = 255; 
        
        Color color = new Color(red, green, blue);
        evt.getComponent().setBackground(color);
    }//GEN-LAST:event_btninscrientrenadorFocusGained

    /**
     * Metodo para que cambie el boton inscribir entrenador  cuando ya no este focus al color por defecto
     * @param evt 
     */
    private void btninscrientrenadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btninscrientrenadorFocusLost
        // TODO add your handling code here:
        int red = 51;   
        int green = 51;    
        int blue = 51;     
        Color color = new Color(red, green, blue);
        
        evt.getComponent().setBackground(color);
    }//GEN-LAST:event_btninscrientrenadorFocusLost

    /**
     * evento del boton borrar entrenador para que cambie de color a azul
     * @param evt 
     */
    private void btnborrarentreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnborrarentreFocusGained
        // TODO add your handling code here:
        int red = 0;    
        int green = 106;   
        int blue = 255; 
        
        Color color = new Color(red, green, blue);
        evt.getComponent().setBackground(color);
    }//GEN-LAST:event_btnborrarentreFocusGained

    /**
     * Metodo para que cambie el boton borrar entrenador  cuando ya no este focus al color por defecto
     * @param evt 
     */
    private void btnborrarentreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnborrarentreFocusLost
        // TODO add your handling code here:
        int red = 51;   
        int green = 51;    
        int blue = 51;     
        Color color = new Color(red, green, blue);
        
        evt.getComponent().setBackground(color);
    }//GEN-LAST:event_btnborrarentreFocusLost

    /**
     * evento del boton inscribir jugador para que cambie de color a azul
     * @param evt 
     */
    private void btninscrijugadoresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btninscrijugadoresFocusGained
        // TODO add your handling code here:
        int red = 0;    
        int green = 106;   
        int blue = 255; 
        
        Color color = new Color(red, green, blue);
        evt.getComponent().setBackground(color);
    }//GEN-LAST:event_btninscrijugadoresFocusGained

    /**
     * Metodo para que cambie el boton inscribir jugador  cuando ya no este focus al color por defecto
     * @param evt 
     */
    private void btninscrijugadoresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btninscrijugadoresFocusLost
        // TODO add your handling code here:
        int red = 51;   
        int green = 51;    
        int blue = 51;     
        Color color = new Color(red, green, blue);
        
        evt.getComponent().setBackground(color);
    }//GEN-LAST:event_btninscrijugadoresFocusLost

    /**
     * evento del boton actualizar jugador para que cambie de color a azul
     * @param evt 
     */
    private void btnactualizarjugaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnactualizarjugaFocusGained
        // TODO add your handling code here:
        int red = 0;    
        int green = 106;   
        int blue = 255; 
        
        Color color = new Color(red, green, blue);
        evt.getComponent().setBackground(color);
    }//GEN-LAST:event_btnactualizarjugaFocusGained

    /**
     * Metodo para que cambie el boton actualizar jugador  cuando ya no este focus al color por defecto
     * @param evt 
     */
    private void btnactualizarjugaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnactualizarjugaFocusLost
        // TODO add your handling code here:
        int red = 51;   
        int green = 51;    
        int blue = 51;     
        Color color = new Color(red, green, blue);
        
        evt.getComponent().setBackground(color);
    }//GEN-LAST:event_btnactualizarjugaFocusLost

    
    
    
    
    
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
      java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    FlatLightFlatIJTheme.setup();

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Dashboard().setVisible(true);
      }
    });
  }

  /**
   * Este metodo se llama para que muestre en el panel a los paneles que llamo
   *
   * @param p
   */
  private void mostrarpanel(JPanel p) {
    p.setSize(1160, 900);
    p.setLocation(0, 0);

    frame.removeAll();
    frame.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    frame.revalidate();
    frame.repaint();
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnactualizarjuga;
    private javax.swing.JButton btnborrarentre;
    private javax.swing.JButton btninscrientrenador;
    private javax.swing.JButton btninscriequipo;
    private javax.swing.JButton btninscrijugadores;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnmenu;
    private javax.swing.JPanel frame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
