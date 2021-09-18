
package mytaxi.ClienteGUI;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mytaxi.ClienteDAL.Conexion;
import mytaxi.ClienteBL.InformeMensualBL;

/**
 *
 * @author Charlie22
 */
public class InformeMensualGUI extends javax.swing.JFrame {

    DefaultTableModel modeloIFM;
     
    public InformeMensualGUI() {
        initComponents();
        
        String[] titulosIFM = {"Id de informe mensual", "Fecha de inicio", "Fecha de fin", "Monto facturado", "Número de viajes", "Detalles", "Cédula del conductor"};
        modeloIFM = new DefaultTableModel(null, titulosIFM);
        tabinforme_mensual.setModel(modeloIFM);
        
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
        id_informe_mensual = new javax.swing.JTextField();
        fecha_inicio = new javax.swing.JTextField();
        fecha_fin = new javax.swing.JTextField();
        monto_facturado = new javax.swing.JTextField();
        numero_viajes = new javax.swing.JTextField();
        cedula_conductor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        detalles = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabinforme_mensual = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 640));
        setMinimumSize(new java.awt.Dimension(1024, 640));
        setPreferredSize(new java.awt.Dimension(1024, 640));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Id del informe mensual");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(260, 120, 190, 29);

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Fecha de inicio");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(290, 160, 160, 29);

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Fecha de fin");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(290, 200, 160, 29);

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Monto facturado");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(290, 240, 160, 29);

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Número de viajes");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(290, 280, 160, 29);

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Cédula del conductor");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(270, 360, 180, 29);

        id_informe_mensual.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        id_informe_mensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_informe_mensualActionPerformed(evt);
            }
        });
        jPanel1.add(id_informe_mensual);
        id_informe_mensual.setBounds(460, 120, 183, 29);

        fecha_inicio.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        fecha_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_inicioActionPerformed(evt);
            }
        });
        jPanel1.add(fecha_inicio);
        fecha_inicio.setBounds(460, 160, 183, 29);

        fecha_fin.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        fecha_fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_finActionPerformed(evt);
            }
        });
        jPanel1.add(fecha_fin);
        fecha_fin.setBounds(460, 200, 183, 29);

        monto_facturado.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        monto_facturado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monto_facturadoActionPerformed(evt);
            }
        });
        jPanel1.add(monto_facturado);
        monto_facturado.setBounds(460, 240, 183, 29);

        numero_viajes.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        numero_viajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_viajesActionPerformed(evt);
            }
        });
        jPanel1.add(numero_viajes);
        numero_viajes.setBounds(460, 280, 183, 29);

        cedula_conductor.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        cedula_conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_conductorActionPerformed(evt);
            }
        });
        jPanel1.add(cedula_conductor);
        cedula_conductor.setBounds(460, 360, 183, 29);

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Detalles");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(290, 320, 160, 29);

        detalles.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesActionPerformed(evt);
            }
        });
        jPanel1.add(detalles);
        detalles.setBounds(460, 320, 183, 29);

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(290, 400, 103, 31);

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(410, 400, 103, 31);

        jButton3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(530, 400, 103, 31);

        jButton4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(650, 400, 93, 31);

        jButton5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(890, 30, 90, 30);

        tabinforme_mensual.setModel(new javax.swing.table.DefaultTableModel(
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
        tabinforme_mensual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabinforme_mensualMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabinforme_mensual);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(140, 440, 540, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytaxi/recursos/fondopim.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 640);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_informe_mensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_informe_mensualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_informe_mensualActionPerformed

    private void fecha_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_inicioActionPerformed

    private void fecha_finActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_finActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_finActionPerformed

    private void monto_facturadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monto_facturadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monto_facturadoActionPerformed

    private void numero_viajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_viajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_viajesActionPerformed

    private void cedula_conductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_conductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedula_conductorActionPerformed

    private void detallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detallesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Conexion objConexion = new Conexion();

        InformeMensualBL objInformeMensualBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("INSERT INTO INFORME_MENSUAL(ID_INFORME_MENSUAL, FECHA_INICIO, FECHA_FIN, MONTO_FACTURADO, NUMERO_VIAJES, DETALLES, CEDULA_CONDUCTOR) "
        + "VALUES('%s', '%s', '%s', '%f', '%s', '%s', '%s')", objInformeMensualBL.getId_informe_mensual(), objInformeMensualBL.getFecha_inicio(), objInformeMensualBL.getFecha_fin(), 
        objInformeMensualBL.getMonto_facturado(), objInformeMensualBL.getNumero_viajes(), objInformeMensualBL.getDetalles(), objInformeMensualBL.getCedula_conductor());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato insertado en la BBDD");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        Conexion objConexion = new Conexion();

        InformeMensualBL objInformeMensualBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("UPDATE INFORME_MENSUAL SET FECHA_INICIO = '%s', FECHA_FIN = '%s', MONTO_FACTURADO = '%f',"
        + "NUMERO_VIAJES = '%s', DETALLES = '%s', CEDULA_CONDUCTOR = '%s' WHERE ID_INFORME_MENSUAL = '%s'",
        objInformeMensualBL.getFecha_inicio(), objInformeMensualBL.getFecha_fin(), 
        objInformeMensualBL.getMonto_facturado(), objInformeMensualBL.getNumero_viajes(), objInformeMensualBL.getDetalles(), objInformeMensualBL.getCedula_conductor(),objInformeMensualBL.getId_informe_mensual());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato modificado en la BBDD");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Conexion objConexion = new Conexion();

        InformeMensualBL objInformeMensualBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("DELETE FROM INFORME_MENSUAL WHERE ID_INFORME_MENSUAL = '%s'", objInformeMensualBL.getId_informe_mensual());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato eliminado en la BBDD");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        this.limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabinforme_mensualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabinforme_mensualMouseClicked
    
        if(evt.getClickCount()==1){

            JTable receptor =(JTable)evt.getSource();

            id_informe_mensual.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            fecha_inicio.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            fecha_fin.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            monto_facturado.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            numero_viajes.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
            detalles.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
            cedula_conductor.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 6).toString());

        }

        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_tabinforme_mensualMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    
    public void mostrarDatos(){
        
        while(modeloIFM.getRowCount() > 0){
        
            modeloIFM.removeRow(0);
        
        }
        
        Conexion objConexion = new Conexion();
        
        try{
            
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM INFORME_MENSUAL");
            
            while(resultado.next()){
                
                System.out.println(resultado.getString("ID_INFORME_MENSUAL"));
                System.out.println(resultado.getString("FECHA_INICIO"));
                System.out.println(resultado.getString("FECHA_FIN"));
                System.out.println(resultado.getString("MONTO_FACTURADO"));
                System.out.println(resultado.getString("NUMERO_VIAJES"));
                System.out.println(resultado.getString("DETALLES"));
                System.out.println(resultado.getString("CEDULA_CONDUCTOR"));
                
                Object[] oInformeMensual = {resultado.getString("ID_INFORME_MENSUAL"), resultado.getString("FECHA_INICIO"), resultado.getString("FECHA_FIN"), 
                                     resultado.getString("MONTO_FACTURADO"), resultado.getString("NUMERO_VIAJES"), resultado.getString("DETALLES"), resultado.getString("CEDULA_CONDUCTOR")};
            
                modeloIFM.addRow(oInformeMensual);
                
            }
        
        }catch(Exception e){
        
            System.out.println(e);
        
        }
         
    }
    
    public InformeMensualBL recuperarDatosGUI(){
        
        InformeMensualBL objInformeMensualBL = new InformeMensualBL();
        
        objInformeMensualBL.setId_informe_mensual(id_informe_mensual.getText());
        objInformeMensualBL.setFecha_inicio(fecha_inicio.getText());
        objInformeMensualBL.setFecha_fin(fecha_fin.getText());
        
        Float MONTO_FACTURADO = (monto_facturado.getText().isEmpty())?0: Float.parseFloat(monto_facturado.getText());
        objInformeMensualBL.setMonto_facturado(MONTO_FACTURADO);
    
        objInformeMensualBL.setNumero_viajes(numero_viajes.getText());
        objInformeMensualBL.setDetalles(detalles.getText());
        objInformeMensualBL.setCedula_conductor(cedula_conductor.getText());
        
        return objInformeMensualBL;
   
    }
    
    public void limpiar(){
        
        id_informe_mensual.setText("");
        fecha_inicio.setText("");
        fecha_fin.setText("");
        monto_facturado.setText("");
        numero_viajes.setText("");
        detalles.setText("");
        cedula_conductor.setText("");
        
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
            java.util.logging.Logger.getLogger(InformeMensualGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformeMensualGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformeMensualGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformeMensualGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformeMensualGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula_conductor;
    private javax.swing.JTextField detalles;
    private javax.swing.JTextField fecha_fin;
    private javax.swing.JTextField fecha_inicio;
    private javax.swing.JTextField id_informe_mensual;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monto_facturado;
    private javax.swing.JTextField numero_viajes;
    private javax.swing.JTable tabinforme_mensual;
    // End of variables declaration//GEN-END:variables
}
