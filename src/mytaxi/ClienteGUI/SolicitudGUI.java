
package mytaxi.ClienteGUI;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mytaxi.ClienteDAL.Conexion;
import mytaxi.ClienteBL.SolicitudBL;

/**
 *
 * @author Charlie22
 */

public class SolicitudGUI extends javax.swing.JFrame {

    DefaultTableModel modeloSol;
    
    public SolicitudGUI() {
        initComponents();
        
        String[] titulosSol = {"Id de solicitud", "Punto de destino", "Tarifa", "Id de localidad", "Id de ruta"};
        modeloSol = new DefaultTableModel(null, titulosSol);
        tabsolicitud.setModel(modeloSol);
        
        this.mostrarDatos();
        this.limpiar();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        id_solicitud = new javax.swing.JTextField();
        punto_destino = new javax.swing.JTextField();
        tarifa = new javax.swing.JTextField();
        id_localidad = new javax.swing.JTextField();
        id_ruta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabsolicitud = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 640));
        setMinimumSize(new java.awt.Dimension(1024, 640));
        setPreferredSize(new java.awt.Dimension(1024, 640));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 640));
        jPanel1.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Id de solicitud");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(290, 120, 160, 29);

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Punto de destino");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(290, 160, 160, 29);

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Tarifa");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(290, 200, 160, 29);

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Id de localidad");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(290, 240, 160, 29);

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Id de ruta");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(290, 280, 160, 29);

        id_solicitud.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        id_solicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_solicitudActionPerformed(evt);
            }
        });
        jPanel1.add(id_solicitud);
        id_solicitud.setBounds(460, 120, 183, 29);

        punto_destino.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        punto_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punto_destinoActionPerformed(evt);
            }
        });
        jPanel1.add(punto_destino);
        punto_destino.setBounds(460, 160, 183, 29);

        tarifa.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        tarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarifaActionPerformed(evt);
            }
        });
        jPanel1.add(tarifa);
        tarifa.setBounds(460, 200, 183, 29);

        id_localidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        id_localidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_localidadActionPerformed(evt);
            }
        });
        jPanel1.add(id_localidad);
        id_localidad.setBounds(460, 240, 183, 29);

        id_ruta.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        id_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_rutaActionPerformed(evt);
            }
        });
        jPanel1.add(id_ruta);
        id_ruta.setBounds(460, 280, 183, 29);

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(260, 330, 103, 31);

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(380, 330, 103, 31);

        jButton3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(500, 330, 103, 31);

        jButton4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(620, 330, 93, 31);

        jButton5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(890, 30, 90, 30);

        tabsolicitud.setModel(new javax.swing.table.DefaultTableModel(
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
        tabsolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabsolicitudMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabsolicitud);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(100, 410, 540, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytaxi/recursos/fondops.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 640);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_solicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_solicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_solicitudActionPerformed

    private void punto_destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punto_destinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_punto_destinoActionPerformed

    private void tarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarifaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarifaActionPerformed

    private void id_localidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_localidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_localidadActionPerformed

    private void id_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_rutaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        Conexion objConexion = new Conexion();

        SolicitudBL objSolicitudBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("INSERT INTO SOLICITUD(ID_SOLICITUD, PUNTO_DESTINO, TARIFA, ID_LOCALIDAD, ID_RUTA) "
        + "VALUES('%s', '%s', '%f', '%s', '%s')", objSolicitudBL.getId_solicitud(), objSolicitudBL.getPunto_destino(), objSolicitudBL.getTarifa(), 
        objSolicitudBL.getId_localidad(), objSolicitudBL.getId_ruta());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato insertado en la BBDD");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        Conexion objConexion = new Conexion();

        SolicitudBL objSolicitudBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("UPDATE SOLICITUD SET PUNTO_DESTINO = '%s', TARIFA = '%f', ID_LOCALIDAD = '%s',"
            + "ID_RUTA = '%s' WHERE ID_SOLICITUD = '%s'",
            objSolicitudBL.getPunto_destino(), objSolicitudBL.getTarifa(), objSolicitudBL.getId_localidad(), objSolicitudBL.getId_ruta(), objSolicitudBL.getId_solicitud());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato modificado en la BBDD");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Conexion objConexion = new Conexion();

        SolicitudBL objSolicitudBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("DELETE FROM SOLICITUD WHERE ID_SOLICITUD = '%s'", objSolicitudBL.getId_solicitud());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato eliminado en la BBDD");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        this.limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabsolicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabsolicitudMouseClicked

        if(evt.getClickCount()==1){

            JTable receptor =(JTable)evt.getSource();

            id_solicitud.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            punto_destino.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            tarifa.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            id_localidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            id_ruta.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());

        }

        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_tabsolicitudMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed


     public void mostrarDatos(){
        
        while(modeloSol.getRowCount() > 0){
        
            modeloSol.removeRow(0);
        
        }
        
        Conexion objConexion = new Conexion();
        
        try{
            
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM SOLICITUD");
            
            while(resultado.next()){
                
                System.out.println(resultado.getString("ID_SOLICITUD"));
                System.out.println(resultado.getString("PUNTO_DESTINO"));
                System.out.println(resultado.getString("TARIFA"));
                System.out.println(resultado.getString("ID_LOCALIDAD"));
                System.out.println(resultado.getString("ID_RUTA"));
                
                Object[] oSolicitud = {resultado.getString("ID_SOLICITUD"), resultado.getString("PUNTO_DESTINO"), resultado.getString("TARIFA"), 
                                     resultado.getString("ID_LOCALIDAD"), resultado.getString("ID_RUTA")};
            
                modeloSol.addRow(oSolicitud);
                
            }
        
        }catch(Exception e){
        
            System.out.println(e);
        
        }
         
    }
    
    public SolicitudBL recuperarDatosGUI(){
        
        SolicitudBL objSolicitudBL = new SolicitudBL();
        
        objSolicitudBL.setId_solicitud(id_solicitud.getText());
        objSolicitudBL.setPunto_destino(punto_destino.getText());
        
        Float TARIFA = (tarifa.getText().isEmpty())?0: Float.parseFloat(tarifa.getText());
        objSolicitudBL.setTarifa(TARIFA);
    
        objSolicitudBL.setId_localidad(id_localidad.getText());
        objSolicitudBL.setId_ruta(id_ruta.getText());
        return objSolicitudBL;
   
    }
    
    public void limpiar(){
        
        id_solicitud.setText("");
        punto_destino.setText("");
        tarifa.setText("");
        id_localidad.setText("");
        id_ruta.setText("");
       
        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
    
    }
    
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
            java.util.logging.Logger.getLogger(SolicitudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolicitudGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_localidad;
    private javax.swing.JTextField id_ruta;
    private javax.swing.JTextField id_solicitud;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField punto_destino;
    private javax.swing.JTable tabsolicitud;
    private javax.swing.JTextField tarifa;
    // End of variables declaration//GEN-END:variables
}
