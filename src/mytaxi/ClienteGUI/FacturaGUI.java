
package mytaxi.ClienteGUI;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mytaxi.ClienteDAL.Conexion;
import mytaxi.ClienteBL.FacturaBL;

/**
 *
 * @author Charlie22
 */

public class FacturaGUI extends javax.swing.JFrame {

    DefaultTableModel modeloFac;
    
    public FacturaGUI() {
        initComponents();
        
        String[] titulosFac = {"Id de factura", "Costo del viaje", "Fecha de emisión", "Detalles", "Id del viaje", "Cédula del cliente"};
        modeloFac = new DefaultTableModel(null, titulosFac);
        tabfactura.setModel(modeloFac);
        
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
        jLabel6 = new javax.swing.JLabel();
        id_factura = new javax.swing.JTextField();
        costo_viaje = new javax.swing.JTextField();
        fecha_emision = new javax.swing.JTextField();
        detalles = new javax.swing.JTextField();
        id_viaje = new javax.swing.JTextField();
        cedula_cliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabfactura = new javax.swing.JTable();
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
        jLabel17.setText("Id de factura");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(290, 120, 160, 29);

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Costo del viaje");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(290, 160, 160, 29);

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Fecha de emisión");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(290, 200, 160, 29);

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Detalles");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(290, 240, 160, 29);

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Id del viaje");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(290, 280, 160, 29);

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Cédula del cliente");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 320, 160, 29);

        id_factura.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        id_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_facturaActionPerformed(evt);
            }
        });
        jPanel1.add(id_factura);
        id_factura.setBounds(460, 120, 183, 29);

        costo_viaje.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        costo_viaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costo_viajeActionPerformed(evt);
            }
        });
        jPanel1.add(costo_viaje);
        costo_viaje.setBounds(460, 160, 183, 29);

        fecha_emision.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        fecha_emision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_emisionActionPerformed(evt);
            }
        });
        jPanel1.add(fecha_emision);
        fecha_emision.setBounds(460, 200, 183, 29);

        detalles.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesActionPerformed(evt);
            }
        });
        jPanel1.add(detalles);
        detalles.setBounds(460, 240, 183, 29);

        id_viaje.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        id_viaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_viajeActionPerformed(evt);
            }
        });
        jPanel1.add(id_viaje);
        id_viaje.setBounds(460, 280, 183, 29);

        cedula_cliente.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        cedula_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_clienteActionPerformed(evt);
            }
        });
        jPanel1.add(cedula_cliente);
        cedula_cliente.setBounds(460, 320, 183, 29);

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(250, 360, 103, 31);

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(380, 360, 103, 31);

        jButton3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(510, 360, 103, 31);

        jButton4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(640, 360, 93, 31);

        jButton5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(890, 30, 90, 30);

        tabfactura.setModel(new javax.swing.table.DefaultTableModel(
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
        tabfactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabfacturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabfactura);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(100, 420, 540, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytaxi/recursos/fondopf.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 640);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_facturaActionPerformed

    private void costo_viajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costo_viajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costo_viajeActionPerformed

    private void fecha_emisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_emisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_emisionActionPerformed

    private void detallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detallesActionPerformed

    private void id_viajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_viajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_viajeActionPerformed

    private void cedula_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedula_clienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Conexion objConexion = new Conexion();

        FacturaBL objFacturaBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("INSERT INTO FACTURA(ID_FACTURA, COSTO_VIAJE, FECHA_EMISION, DETALLES, ID_VIAJE, CEDULA_CLIENTE) "
        + "VALUES('%s', '%f', '%s', '%s', '%s', '%s')", objFacturaBL.getId_viaje(), objFacturaBL.getCosto_viaje(), objFacturaBL.getFecha_emision(), 
        objFacturaBL.getDetalles(), objFacturaBL.getId_viaje(), objFacturaBL.getCedula_cliente());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato insertado en la BBDD");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        Conexion objConexion = new Conexion();

        FacturaBL objFacturaBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("UPDATE FACTURA SET COSTO_VIAJE = '%f', FECHA_EMISION = '%s', DETALLES = '%s',"
        + "ID_VIAJE = '%s', CEDULA_CLIENTE = '%s' WHERE ID_FACTURA = '%s'",
        objFacturaBL.getCosto_viaje(), objFacturaBL.getFecha_emision(), objFacturaBL.getDetalles(),
        objFacturaBL.getId_viaje(), objFacturaBL.getCedula_cliente(), objFacturaBL.getId_factura());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato modificado en la BBDD");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
        Conexion objConexion = new Conexion();

        FacturaBL objFacturaBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("DELETE FROM FACTURA WHERE ID_FACTURA = '%s'", objFacturaBL.getId_factura());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato eliminado en la BBDD");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        this.limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabfacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabfacturaMouseClicked
     
        if(evt.getClickCount()==1){

            JTable receptor =(JTable)evt.getSource();

            id_factura.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            costo_viaje.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            fecha_emision.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            detalles.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            id_viaje.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
            cedula_cliente.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5).toString());

        }

        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_tabfacturaMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    public void mostrarDatos(){
        
        while(modeloFac.getRowCount() > 0){
        
            modeloFac.removeRow(0);
        
        }
        
        Conexion objConexion = new Conexion();
        
        try{
            
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM FACTURA");
            
            while(resultado.next()){
                
                System.out.println(resultado.getString("ID_FACTURA"));
                System.out.println(resultado.getString("COSTO_VIAJE"));
                System.out.println(resultado.getString("FECHA_EMISION"));
                System.out.println(resultado.getString("DETALLES"));
                System.out.println(resultado.getString("ID_VIAJE"));
                System.out.println(resultado.getString("CEDULA_CLIENTE"));
                
                Object[] oFactura = {resultado.getString("ID_FACTURA"), resultado.getString("COSTO_VIAJE"), resultado.getString("FECHA_EMISION"), 
                                     resultado.getString("DETALLES"), resultado.getString("ID_VIAJE"), resultado.getString("CEDULA_CLIENTE")};
            
                modeloFac.addRow(oFactura);
                
            }
        
        }catch(Exception e){
        
            System.out.println(e);
        
        }
         
    }
    
    public FacturaBL recuperarDatosGUI(){
        
        FacturaBL objFacturaBL = new FacturaBL();
        
        objFacturaBL.setId_factura(id_factura.getText());
        
        Float COSTO_VIAJE = (costo_viaje.getText().isEmpty())?0: Float.parseFloat(costo_viaje.getText());
        objFacturaBL.setCosto_viaje(COSTO_VIAJE);
        
        objFacturaBL.setFecha_emision(fecha_emision.getText());
        objFacturaBL.setDetalles(detalles.getText());
        objFacturaBL.setId_viaje(id_viaje.getText());
        objFacturaBL.setCedula_cliente(cedula_cliente.getText());
        
        return objFacturaBL;
   
    }
    
    public void limpiar(){
        
        id_factura.setText("");
        costo_viaje.setText("");
        fecha_emision.setText("");
        detalles.setText("");
        id_viaje.setText("");
        cedula_cliente.setText("");
        
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
            java.util.logging.Logger.getLogger(FacturaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacturaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula_cliente;
    private javax.swing.JTextField costo_viaje;
    private javax.swing.JTextField detalles;
    private javax.swing.JTextField fecha_emision;
    private javax.swing.JTextField id_factura;
    private javax.swing.JTextField id_viaje;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabfactura;
    // End of variables declaration//GEN-END:variables
}
