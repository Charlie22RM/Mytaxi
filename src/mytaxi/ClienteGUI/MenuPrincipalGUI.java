
package mytaxi.ClienteGUI;

/**
 *
 * @author Charlie22
 */

public class MenuPrincipalGUI extends javax.swing.JFrame {

    public MenuPrincipalGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnruta = new javax.swing.JButton();
        btnlocalidad = new javax.swing.JButton();
        btncliente = new javax.swing.JButton();
        btnsolicitud = new javax.swing.JButton();
        btnpersonal = new javax.swing.JButton();
        btnconductor = new javax.swing.JButton();
        btntaxi = new javax.swing.JButton();
        btnenvia_solicitud = new javax.swing.JButton();
        btnacepta_solicitud = new javax.swing.JButton();
        btndesigna_conductor = new javax.swing.JButton();
        btnviajecliente = new javax.swing.JButton();
        btninforme_mensual = new javax.swing.JButton();
        btnfactura = new javax.swing.JButton();
        btnrecibe_informe = new javax.swing.JButton();
        btnviajeconductor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 640));
        setMinimumSize(new java.awt.Dimension(1024, 640));
        setPreferredSize(new java.awt.Dimension(1024, 640));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(null);

        btnruta.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnruta.setText("Rutas");
        btnruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrutaActionPerformed(evt);
            }
        });
        jPanel1.add(btnruta);
        btnruta.setBounds(380, 360, 120, 30);

        btnlocalidad.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnlocalidad.setText("Localidades");
        btnlocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlocalidadActionPerformed(evt);
            }
        });
        jPanel1.add(btnlocalidad);
        btnlocalidad.setBounds(240, 360, 120, 30);

        btncliente.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btncliente.setText("Clientes");
        btncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclienteActionPerformed(evt);
            }
        });
        jPanel1.add(btncliente);
        btncliente.setBounds(150, 190, 120, 30);

        btnsolicitud.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnsolicitud.setText("Solicitudes");
        btnsolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsolicitudActionPerformed(evt);
            }
        });
        jPanel1.add(btnsolicitud);
        btnsolicitud.setBounds(290, 190, 120, 30);

        btnpersonal.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnpersonal.setText("Personal");
        btnpersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpersonalActionPerformed(evt);
            }
        });
        jPanel1.add(btnpersonal);
        btnpersonal.setBounds(100, 360, 120, 30);

        btnconductor.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnconductor.setText("Conductores");
        btnconductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconductorActionPerformed(evt);
            }
        });
        jPanel1.add(btnconductor);
        btnconductor.setBounds(210, 520, 120, 30);

        btntaxi.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btntaxi.setText("Taxis");
        btntaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntaxiActionPerformed(evt);
            }
        });
        jPanel1.add(btntaxi);
        btntaxi.setBounds(520, 360, 120, 30);

        btnenvia_solicitud.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnenvia_solicitud.setText("Envio de solicitudes");
        btnenvia_solicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenvia_solicitudActionPerformed(evt);
            }
        });
        jPanel1.add(btnenvia_solicitud);
        btnenvia_solicitud.setBounds(420, 190, 180, 30);

        btnacepta_solicitud.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnacepta_solicitud.setText("Recepción");
        btnacepta_solicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacepta_solicitudActionPerformed(evt);
            }
        });
        jPanel1.add(btnacepta_solicitud);
        btnacepta_solicitud.setBounds(670, 360, 120, 30);

        btndesigna_conductor.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btndesigna_conductor.setText("Designación");
        btndesigna_conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndesigna_conductorActionPerformed(evt);
            }
        });
        jPanel1.add(btndesigna_conductor);
        btndesigna_conductor.setBounds(810, 360, 120, 30);

        btnviajecliente.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnviajecliente.setText("Viajes");
        btnviajecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviajeclienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnviajecliente);
        btnviajecliente.setBounds(610, 190, 120, 30);

        btninforme_mensual.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btninforme_mensual.setText("Informes");
        btninforme_mensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninforme_mensualActionPerformed(evt);
            }
        });
        jPanel1.add(btninforme_mensual);
        btninforme_mensual.setBounds(530, 520, 120, 30);

        btnfactura.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnfactura.setText("Facturas");
        btnfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfacturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnfactura);
        btnfactura.setBounds(750, 190, 120, 30);

        btnrecibe_informe.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnrecibe_informe.setText("Envio de informes");
        btnrecibe_informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecibe_informeActionPerformed(evt);
            }
        });
        jPanel1.add(btnrecibe_informe);
        btnrecibe_informe.setBounds(670, 520, 180, 30);

        btnviajeconductor.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnviajeconductor.setText("Viajes");
        btnviajeconductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviajeconductorActionPerformed(evt);
            }
        });
        jPanel1.add(btnviajeconductor);
        btnviajeconductor.setBounds(380, 520, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytaxi/recursos/fondopmp.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 640);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclienteActionPerformed
        // TODO add your handling code here:
        
        ClienteGUI pc  = new ClienteGUI();
        pc.setLocationRelativeTo(null);
        pc.setSize(1024,640);
        pc.show();
    }//GEN-LAST:event_btnclienteActionPerformed

    private void btnlocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlocalidadActionPerformed
        // TODO add your handling code here:
        LocalidadGUI pl  = new LocalidadGUI();
        pl.setLocationRelativeTo(null);
        pl.setSize(800,700);
        pl.show();
    }//GEN-LAST:event_btnlocalidadActionPerformed

    private void btnrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrutaActionPerformed
        // TODO add your handling code here:
        RutaGUI pr  = new RutaGUI();
        pr.setLocationRelativeTo(null);
        pr.setSize(800,700);
        pr.show();
    }//GEN-LAST:event_btnrutaActionPerformed

    private void btnsolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsolicitudActionPerformed
        // TODO add your handling code here:
        SolicitudGUI ps  = new SolicitudGUI();
        ps.setLocationRelativeTo(null);
        ps.setSize(800,700);
        ps.show();
        
    }//GEN-LAST:event_btnsolicitudActionPerformed

    private void btnpersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpersonalActionPerformed
        // TODO add your handling code here:
        PersonalGUI pp  = new PersonalGUI();
        pp.setLocationRelativeTo(null);
        pp.setSize(800,700);
        pp.show();
    }//GEN-LAST:event_btnpersonalActionPerformed

    private void btnconductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconductorActionPerformed
        // TODO add your handling code here:
        ConductorGUI pc  = new ConductorGUI();
        pc.setLocationRelativeTo(null);
        pc.setSize(800,700);
        pc.show();
    }//GEN-LAST:event_btnconductorActionPerformed

    private void btntaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntaxiActionPerformed
        // TODO add your handling code here:
        TaxiGUI pt  = new TaxiGUI();
        pt.setLocationRelativeTo(null);
        pt.setSize(800,700);
        pt.show();
    }//GEN-LAST:event_btntaxiActionPerformed

    private void btnenvia_solicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenvia_solicitudActionPerformed
        // TODO add your handling code here:
        EnviaSolicitudGUI pes  = new EnviaSolicitudGUI();
        pes.setLocationRelativeTo(null);
        pes.setSize(800,700);
        pes.show();
        
    }//GEN-LAST:event_btnenvia_solicitudActionPerformed

    private void btnacepta_solicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacepta_solicitudActionPerformed
        // TODO add your handling code here:
        AceptaSolicitudGUI pas  = new AceptaSolicitudGUI();
        pas.setLocationRelativeTo(null);
        pas.setSize(800,700);
        pas.show();
        
    }//GEN-LAST:event_btnacepta_solicitudActionPerformed

    private void btndesigna_conductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesigna_conductorActionPerformed
        // TODO add your handling code here:
        DesignaConductorGUI pdc  = new DesignaConductorGUI();
        pdc.setLocationRelativeTo(null);
        pdc.setSize(800,700);
        pdc.show();
    }//GEN-LAST:event_btndesigna_conductorActionPerformed

    private void btnviajeclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviajeclienteActionPerformed
        // TODO add your handling code here:
        ViajeGUI pv  = new ViajeGUI();
        pv.setLocationRelativeTo(null);
        pv.setSize(800,700);
        pv.show();
    }//GEN-LAST:event_btnviajeclienteActionPerformed

    private void btninforme_mensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninforme_mensualActionPerformed
        // TODO add your handling code here:
        InformeMensualGUI pim  = new InformeMensualGUI();
        pim.setLocationRelativeTo(null);
        pim.setSize(800,700);
        pim.show();
    }//GEN-LAST:event_btninforme_mensualActionPerformed

    private void btnfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfacturaActionPerformed
        // TODO add your handling code here:
        FacturaGUI pf  = new FacturaGUI();
        pf.setLocationRelativeTo(null);
        pf.setSize(800,700);
        pf.show();
    }//GEN-LAST:event_btnfacturaActionPerformed

    private void btnviajeconductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviajeconductorActionPerformed
        // TODO add your handling code here:
        ViajeGUI pv  = new ViajeGUI();
        pv.setLocationRelativeTo(null);
        pv.setSize(800,700);
        pv.show();
        
    }//GEN-LAST:event_btnviajeconductorActionPerformed

    private void btnrecibe_informeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecibe_informeActionPerformed
        // TODO add your handling code here:
        EnviaInformeGUI pri  = new EnviaInformeGUI();
        pri.setLocationRelativeTo(null);
        pri.setSize(800,700);
        pri.show();
    }//GEN-LAST:event_btnrecibe_informeActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacepta_solicitud;
    private javax.swing.JButton btncliente;
    private javax.swing.JButton btnconductor;
    private javax.swing.JButton btndesigna_conductor;
    private javax.swing.JButton btnenvia_solicitud;
    private javax.swing.JButton btnfactura;
    private javax.swing.JButton btninforme_mensual;
    private javax.swing.JButton btnlocalidad;
    private javax.swing.JButton btnpersonal;
    private javax.swing.JButton btnrecibe_informe;
    private javax.swing.JButton btnruta;
    private javax.swing.JButton btnsolicitud;
    private javax.swing.JButton btntaxi;
    private javax.swing.JButton btnviajecliente;
    private javax.swing.JButton btnviajeconductor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
