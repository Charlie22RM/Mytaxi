
package mytaxi.ClienteGUI;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mytaxi.ClienteDAL.Conexion;
import mytaxi.ClienteBL.TaxiBL;

/**
 *
 * @author Charlie22
 */

public class TaxiGUI extends javax.swing.JFrame {

    DefaultTableModel modeloTaxi;
    
    public TaxiGUI() {
        initComponents();
        
        String[] titulosTaxi = {"Placa del taxi", "Año", "Marca", "Modelo", "Cédula del conductor", "Id de localidad"};
        modeloTaxi = new DefaultTableModel(null, titulosTaxi);
        tabtaxi.setModel(modeloTaxi);
        
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
        placa_taxi = new javax.swing.JTextField();
        año = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        cedula_conductor = new javax.swing.JTextField();
        id_localidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabtaxi = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 640));
        setMinimumSize(new java.awt.Dimension(1024, 640));
        setPreferredSize(new java.awt.Dimension(1024, 640));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 640));
        jPanel1.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Placa del taxi");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(290, 120, 160, 29);

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Año");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(290, 160, 160, 29);

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Marca");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(290, 200, 160, 29);

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Modelo");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(290, 240, 160, 29);

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Cédula del conductor");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(260, 280, 190, 29);

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Id de localidad");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 320, 160, 29);

        placa_taxi.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        placa_taxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placa_taxiActionPerformed(evt);
            }
        });
        jPanel1.add(placa_taxi);
        placa_taxi.setBounds(460, 120, 183, 29);

        año.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoActionPerformed(evt);
            }
        });
        jPanel1.add(año);
        año.setBounds(460, 160, 183, 29);

        marca.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });
        jPanel1.add(marca);
        marca.setBounds(460, 200, 183, 29);

        modelo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloActionPerformed(evt);
            }
        });
        jPanel1.add(modelo);
        modelo.setBounds(460, 240, 183, 29);

        cedula_conductor.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        cedula_conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_conductorActionPerformed(evt);
            }
        });
        jPanel1.add(cedula_conductor);
        cedula_conductor.setBounds(460, 280, 183, 29);

        id_localidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        id_localidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_localidadActionPerformed(evt);
            }
        });
        jPanel1.add(id_localidad);
        id_localidad.setBounds(460, 320, 183, 29);

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(270, 370, 103, 31);

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(390, 370, 103, 31);

        jButton3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(510, 370, 103, 31);

        jButton4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(630, 370, 93, 31);

        jButton5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(890, 30, 90, 30);

        tabtaxi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabtaxi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabtaxiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabtaxi);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(100, 430, 540, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytaxi/recursos/fondopt.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1024, 640);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void placa_taxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placa_taxiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placa_taxiActionPerformed

    private void añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añoActionPerformed

    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaActionPerformed

    private void modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloActionPerformed

    private void cedula_conductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_conductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedula_conductorActionPerformed

    private void id_localidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_localidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_localidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        Conexion objConexion = new Conexion();

        TaxiBL objTaxiBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("INSERT INTO TAXI(PLACA_TAXI, AÑO, MARCA, MODELO, CEDULA_CONDUCTOR, ID_LOCALIDAD) "
        + "VALUES('%s', '%s', '%s', '%s', '%s', '%s')", objTaxiBL.getPlaca_taxi(), objTaxiBL.getAño(), objTaxiBL.getMarca(), objTaxiBL.getModelo(), 
        objTaxiBL.getCedula_conductor(), objTaxiBL.getId_localidad());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato insertado en la BBDD");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        Conexion objConexion = new Conexion();

        TaxiBL objTaxiBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("UPDATE TAXI SET AÑO = '%s', MARCA = '%s', MODELO = '%s',"
        + "CEDULA_CONDUCTOR = '%s', ID_LOCALIDAD = '%s' WHERE PLACA_TAXI = '%s'",
        objTaxiBL.getAño(), objTaxiBL.getMarca(), objTaxiBL.getModelo(),
        objTaxiBL.getCedula_conductor(), objTaxiBL.getId_localidad(), objTaxiBL.getPlaca_taxi());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato modificado en la BBDD");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Conexion objConexion = new Conexion();

        TaxiBL objTaxiBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("DELETE FROM TAXI WHERE PLACA_TAXI = '%s'", objTaxiBL.getPlaca_taxi());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato eliminado en la BBDD");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
        this.limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabtaxiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabtaxiMouseClicked
  
        if(evt.getClickCount()==1){

            JTable receptor =(JTable)evt.getSource();

            placa_taxi.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            año.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            marca.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            modelo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            cedula_conductor.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
            id_localidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5).toString());

        }

        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_tabtaxiMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    public void mostrarDatos(){
        
        while(modeloTaxi.getRowCount() > 0){
        
            modeloTaxi.removeRow(0);
        
        }
        
        Conexion objConexion = new Conexion();
        
        try{
            
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM TAXI");
            
            while(resultado.next()){
                
                System.out.println(resultado.getString("PLACA_TAXI"));
                System.out.println(resultado.getString("AÑO"));
                System.out.println(resultado.getString("MARCA"));
                System.out.println(resultado.getString("MODELO"));
                System.out.println(resultado.getString("CEDULA_CONDUCTOR"));
                System.out.println(resultado.getString("ID_LOCALIDAD"));
                
                Object[] oTaxi = {resultado.getString("PLACA_TAXI"), resultado.getString("AÑO"), resultado.getString("MARCA"), 
                                  resultado.getString("MODELO"), resultado.getString("CEDULA_CONDUCTOR"), resultado.getString("ID_LOCALIDAD")};
            
                modeloTaxi.addRow(oTaxi);
                
            }
        
        }catch(Exception e){
        
            System.out.println(e);
        
        }
         
    }
    
    public TaxiBL recuperarDatosGUI(){
        
        TaxiBL objTaxiBL = new TaxiBL();
        
        objTaxiBL.setPlaca_taxi(placa_taxi.getText());
        objTaxiBL.setAño(año.getText());
        objTaxiBL.setMarca(marca.getText());
        objTaxiBL.setModelo(modelo.getText());
        objTaxiBL.setCedula_conductor(cedula_conductor.getText());
        objTaxiBL.setId_localidad(id_localidad.getText());
        
        return objTaxiBL;
   
    }
    
    public void limpiar(){
        
        placa_taxi.setText("");
        año.setText("");
        marca.setText("");
        modelo.setText("");
        cedula_conductor.setText("");
        id_localidad.setText("");
        
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
            java.util.logging.Logger.getLogger(TaxiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaxiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaxiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaxiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaxiGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField año;
    private javax.swing.JTextField cedula_conductor;
    private javax.swing.JTextField id_localidad;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField placa_taxi;
    private javax.swing.JTable tabtaxi;
    // End of variables declaration//GEN-END:variables
}
