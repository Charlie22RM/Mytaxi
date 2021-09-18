
package mytaxi.ClienteGUI;

import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mytaxi.ClienteDAL.Conexion;
import mytaxi.ClienteBL.RutaBL;

/**
 *
 * @author Charlie22
 */

public class RutaGUI extends javax.swing.JFrame {

    DefaultTableModel modeloRuta;
    
    public RutaGUI() {
        initComponents();
        
        String[] titulosRuta = {"Id de ruta", "Nombre", "Número de paradas intermedias", "Id de localidad"};
        modeloRuta = new DefaultTableModel(null, titulosRuta);
        tabruta.setModel(modeloRuta);
        
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
        id_ruta = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        numero_paradas_intermedias = new javax.swing.JTextField();
        id_localidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabruta = new javax.swing.JTable();
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
        jLabel17.setText("Id de ruta");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(290, 120, 160, 29);

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Nombre");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(290, 160, 160, 29);

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Número de paradas intermedias");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(190, 200, 260, 29);

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Id de localidad");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(290, 240, 160, 29);

        id_ruta.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        id_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_rutaActionPerformed(evt);
            }
        });
        jPanel1.add(id_ruta);
        id_ruta.setBounds(460, 120, 183, 29);

        nombre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre);
        nombre.setBounds(460, 160, 183, 29);

        numero_paradas_intermedias.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        numero_paradas_intermedias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_paradas_intermediasActionPerformed(evt);
            }
        });
        jPanel1.add(numero_paradas_intermedias);
        numero_paradas_intermedias.setBounds(460, 200, 183, 29);

        id_localidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        id_localidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_localidadActionPerformed(evt);
            }
        });
        jPanel1.add(id_localidad);
        id_localidad.setBounds(460, 240, 183, 29);

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(270, 320, 103, 31);

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(390, 320, 103, 31);

        jButton3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(510, 320, 103, 31);

        jButton4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(630, 320, 93, 31);

        jButton5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(890, 30, 90, 30);

        tabruta.setModel(new javax.swing.table.DefaultTableModel(
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
        tabruta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabrutaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabruta);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(100, 400, 540, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytaxi/recursos/fondopr.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 640);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_rutaActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void numero_paradas_intermediasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_paradas_intermediasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_paradas_intermediasActionPerformed

    private void id_localidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_localidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_localidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        Conexion objConexion = new Conexion();

        RutaBL objRutaBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("INSERT INTO RUTA(ID_RUTA, NOMBRE, NUMERO_PARADAS_INTERMEDIAS, ID_LOCALIDAD) "
        + "VALUES('%s', '%s', '%s', '%s')", objRutaBL.getId_ruta(), objRutaBL.getNombre(), objRutaBL.getNumero_paradas_intermedias(), objRutaBL.getId_localidad());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato insertado en la BBDD");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Conexion objConexion = new Conexion();

        RutaBL objRutaBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("UPDATE RUTA SET NOMBRE = '%s', NUMERO_PARADAS_INTERMEDIAS = '%s', ID_LOCALIDAD = '%s' WHERE ID_RUTA = '%s'",
        objRutaBL.getNombre(), objRutaBL.getNumero_paradas_intermedias(), objRutaBL.getId_localidad(), objRutaBL.getId_ruta());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato modificado en la BBDD");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
        Conexion objConexion = new Conexion();

        RutaBL objRutaBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("DELETE FROM RUTA WHERE ID_RUTA = '%s'", objRutaBL.getId_ruta());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato eliminado en la BBDD");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        this.limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabrutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabrutaMouseClicked

        if(evt.getClickCount()==1){

            JTable receptor =(JTable)evt.getSource();

            id_ruta.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            nombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            numero_paradas_intermedias.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            id_localidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());

        }

        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_tabrutaMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

 public void mostrarDatos(){
        
        while(modeloRuta.getRowCount() > 0){
        
            modeloRuta.removeRow(0);
        
        }
        
        Conexion objConexion = new Conexion();
        
        try{
            
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM RUTA");
            
            while(resultado.next()){
                
                System.out.println(resultado.getString("ID_RUTA"));
                System.out.println(resultado.getString("NOMBRE"));
                System.out.println(resultado.getString("NUMERO_PARADAS_INTERMEDIAS"));
                System.out.println(resultado.getString("ID_LOCALIDAD"));

                Object[] oRuta = {resultado.getString("ID_RUTA"), resultado.getString("NOMBRE"), resultado.getString("NUMERO_PARADAS_INTERMEDIAS"), 
                                     resultado.getString("ID_LOCALIDAD")};
            
                modeloRuta.addRow(oRuta);
                
            }
        
        }catch(Exception e){
        
            System.out.println(e);
        
        }
         
    }
    
    public RutaBL recuperarDatosGUI(){
        
        RutaBL objClienteBL = new RutaBL();
        
        objClienteBL.setId_ruta(id_ruta.getText());
        objClienteBL.setNombre(nombre.getText());
        objClienteBL.setNumero_paradas_intermedias(numero_paradas_intermedias.getText());
        objClienteBL.setId_localidad(id_localidad.getText());
 
        return objClienteBL;
   
    }
    
    public void limpiar(){
        
        id_ruta.setText("");
        nombre.setText("");
        numero_paradas_intermedias.setText("");
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
            java.util.logging.Logger.getLogger(RutaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RutaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RutaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RutaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RutaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_localidad;
    private javax.swing.JTextField id_ruta;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numero_paradas_intermedias;
    private javax.swing.JTable tabruta;
    // End of variables declaration//GEN-END:variables
}
