
package mytaxi.ClienteGUI;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mytaxi.ClienteDAL.Conexion;
import mytaxi.ClienteBL.ViajeBL;

/**
 *
 * @author Charlie22
 */

public class ViajeGUI extends javax.swing.JFrame {

    DefaultTableModel modeloVia;
    
    public ViajeGUI() {
        initComponents();
        
        String[] titulosVia = {"Id de viaje", "Número de pasajeros", "Id de ruta", "Placa de taxi"};
        modeloVia = new DefaultTableModel(null, titulosVia);
        tabviaje.setModel(modeloVia);
        
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
        id_viaje = new javax.swing.JTextField();
        numero_pasajeros = new javax.swing.JTextField();
        id_ruta = new javax.swing.JTextField();
        placa_taxi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabviaje = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 640));
        setMinimumSize(new java.awt.Dimension(1024, 640));
        setPreferredSize(new java.awt.Dimension(1024, 640));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Id del viaje");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(290, 120, 160, 29);

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Número de pasajeros");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(270, 160, 180, 29);

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Id de ruta");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(290, 200, 160, 29);

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Placa del taxi");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(280, 240, 160, 29);

        id_viaje.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        id_viaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_viajeActionPerformed(evt);
            }
        });
        jPanel1.add(id_viaje);
        id_viaje.setBounds(460, 120, 183, 29);

        numero_pasajeros.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        numero_pasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_pasajerosActionPerformed(evt);
            }
        });
        jPanel1.add(numero_pasajeros);
        numero_pasajeros.setBounds(460, 160, 183, 29);

        id_ruta.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        id_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_rutaActionPerformed(evt);
            }
        });
        jPanel1.add(id_ruta);
        id_ruta.setBounds(460, 200, 183, 29);

        placa_taxi.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        placa_taxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placa_taxiActionPerformed(evt);
            }
        });
        jPanel1.add(placa_taxi);
        placa_taxi.setBounds(460, 240, 183, 29);

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(290, 300, 103, 31);

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(410, 300, 103, 31);

        jButton3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(530, 300, 103, 31);

        jButton4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(650, 300, 93, 31);

        jButton5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(890, 30, 90, 30);

        tabviaje.setModel(new javax.swing.table.DefaultTableModel(
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
        tabviaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabviajeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabviaje);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(110, 380, 540, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytaxi/recursos/fondopv.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1020, 640);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_viajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_viajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_viajeActionPerformed

    private void numero_pasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_pasajerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_pasajerosActionPerformed

    private void id_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_rutaActionPerformed

    private void placa_taxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placa_taxiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placa_taxiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Conexion objConexion = new Conexion();

        ViajeBL objViajeBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("INSERT INTO VIAJE(ID_VIAJE, NUMERO_PASAJEROS, ID_RUTA, PLACA_TAXI) "
        + "VALUES('%s', '%s', '%s', '%s')", objViajeBL.getId_viaje(), objViajeBL.getNumero_pasajeros(), objViajeBL.getId_ruta(), objViajeBL.getPlaca_taxi());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato insertado en la BBDD");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        Conexion objConexion = new Conexion();

        ViajeBL objViajeBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("UPDATE VIAJE SET NUMERO_PASAJEROS = '%s', ID_RUTA = '%s', PLACA_TAXI = '%s' WHERE ID_VIAJE = '%s'",
        objViajeBL.getNumero_pasajeros(), objViajeBL.getId_ruta(), objViajeBL.getPlaca_taxi(), objViajeBL.getId_viaje());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato modificado en la BBDD");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
        Conexion objConexion = new Conexion();

        ViajeBL objViajeBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("DELETE FROM VIAJE WHERE ID_VIAJE = '%s'", objViajeBL.getId_viaje());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato eliminado en la BBDD");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 
        this.limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabviajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabviajeMouseClicked
        
        if(evt.getClickCount()==1){

            JTable receptor =(JTable)evt.getSource();

            id_viaje.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            numero_pasajeros.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            id_ruta.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            placa_taxi.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());

        }

        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        
    }//GEN-LAST:event_tabviajeMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    public void mostrarDatos(){
        
        while(modeloVia.getRowCount() > 0){
        
            modeloVia.removeRow(0);
        
        }
        
        Conexion objConexion = new Conexion();
        
        try{
            
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM VIAJE");
            
            while(resultado.next()){
                
                System.out.println(resultado.getString("ID_VIAJE"));
                System.out.println(resultado.getString("NUMERO_PASAJEROS"));
                System.out.println(resultado.getString("ID_RUTA"));
                System.out.println(resultado.getString("PLACA_TAXI"));
                
                Object[] oViaje = {resultado.getString("ID_VIAJE"), resultado.getString("NUMERO_PASAJEROS"), resultado.getString("ID_RUTA"), resultado.getString("PLACA_TAXI")};
            
                modeloVia.addRow(oViaje);
                
            }
        
        }catch(Exception e){
        
            System.out.println(e);
        
        }
         
    }
    
    public ViajeBL recuperarDatosGUI(){
        
        ViajeBL objViajeBL = new ViajeBL();
        
        objViajeBL.setId_viaje(id_viaje.getText());
        objViajeBL.setNumero_pasajeros(numero_pasajeros.getText());
        objViajeBL.setId_ruta(id_ruta.getText());
        objViajeBL.setPlaca_taxi(placa_taxi.getText());
        
        return objViajeBL;
   
    }
    
    public void limpiar(){
        
        id_viaje.setText("");
        numero_pasajeros.setText("");
        id_ruta.setText("");
        placa_taxi.setText("");
  
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
            java.util.logging.Logger.getLogger(ViajeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViajeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViajeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViajeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViajeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_ruta;
    private javax.swing.JTextField id_viaje;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numero_pasajeros;
    private javax.swing.JTextField placa_taxi;
    private javax.swing.JTable tabviaje;
    // End of variables declaration//GEN-END:variables
}
