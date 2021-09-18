
package mytaxi.ClienteGUI;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mytaxi.ClienteBL.LocalidadBL;
import mytaxi.ClienteDAL.Conexion;

/**
 *
 * @author Charlie22
 */

public class LocalidadGUI extends javax.swing.JFrame {
    
    DefaultTableModel modeloLoc;
    
    public LocalidadGUI() {
        initComponents();
        
        String[] titulosLoc = {"Id de localidad", "Nombre", "Número de taxis"};
        modeloLoc = new DefaultTableModel(null, titulosLoc);
        tablocalidad.setModel(modeloLoc);
        
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
        id_localidad = new javax.swing.JTextField();
        nombre_localidad = new javax.swing.JTextField();
        numero_taxis = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablocalidad = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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
        jLabel17.setText("Id de localidad");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(290, 120, 160, 29);

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Nombre");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(290, 160, 160, 29);

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Número de taxis");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(290, 200, 160, 29);

        id_localidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        id_localidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_localidadActionPerformed(evt);
            }
        });
        jPanel1.add(id_localidad);
        id_localidad.setBounds(460, 120, 183, 29);

        nombre_localidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        nombre_localidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_localidadActionPerformed(evt);
            }
        });
        jPanel1.add(nombre_localidad);
        nombre_localidad.setBounds(460, 160, 183, 29);

        numero_taxis.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        numero_taxis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_taxisActionPerformed(evt);
            }
        });
        jPanel1.add(numero_taxis);
        numero_taxis.setBounds(460, 200, 183, 29);

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(280, 320, 103, 31);

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(400, 320, 103, 31);

        jButton3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(520, 320, 103, 31);

        jButton4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(640, 320, 93, 31);

        jButton5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(890, 30, 90, 30);

        tablocalidad.setModel(new javax.swing.table.DefaultTableModel(
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
        tablocalidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablocalidadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablocalidad);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(140, 390, 452, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytaxi/recursos/fondopl.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 640);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_localidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_localidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_localidadActionPerformed

    private void nombre_localidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_localidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_localidadActionPerformed

    private void numero_taxisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_taxisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_taxisActionPerformed
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Conexion objConexion = new Conexion();

        LocalidadBL objLocalidadBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("INSERT INTO LOCALIDAD(ID_LOCALIDAD, NOMBRE, NUMERO_TAXIS) "
            + "VALUES('%s', '%s', '%s')", objLocalidadBL.getId_localidad(), objLocalidadBL.getNombre(), objLocalidadBL.getNumero_taxis());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato insertado en la BBDD");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        Conexion objConexion = new Conexion();

        LocalidadBL objLocalidadBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("UPDATE LOCALIDAD SET NOMBRE = '%s', NUMERO_TAXIS = '%s' WHERE ID_LOCALIDAD = '%s'",
            objLocalidadBL.getNombre(), objLocalidadBL.getNumero_taxis(), objLocalidadBL.getId_localidad());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato modificado en la BBDD");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Conexion objConexion = new Conexion();

        LocalidadBL objLocalidadBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("DELETE FROM LOCALIDAD WHERE ID_LOCALIDAD = '%s'", objLocalidadBL.getId_localidad());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato eliminado en la BBDD");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tablocalidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablocalidadMouseClicked
        
        if(evt.getClickCount()==1){

            JTable receptor =(JTable)evt.getSource();

            id_localidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            nombre_localidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            numero_taxis.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
       
        }

        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);

    }//GEN-LAST:event_tablocalidadMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        dispose();
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(LocalidadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocalidadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocalidadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocalidadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocalidadGUI().setVisible(true);
            }
        });
    }

    public LocalidadBL recuperarDatosGUI(){
        
        LocalidadBL objLocalidadBL = new LocalidadBL();
       
        objLocalidadBL.setId_localidad(id_localidad.getText());
        objLocalidadBL.setNombre(nombre_localidad.getText());
         objLocalidadBL.setNumero_taxis(numero_taxis.getText());
        
        return objLocalidadBL;
   
    }
    
    public void mostrarDatos(){
        
        while(modeloLoc.getRowCount() > 0){
        
            modeloLoc.removeRow(0);
        
        }
        
        Conexion objConexion = new Conexion();
        
        try{
            
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM LOCALIDAD");
            
            while(resultado.next()){
                
                System.out.println(resultado.getString("ID_LOCALIDAD"));
                System.out.println(resultado.getString("NOMBRE"));
                System.out.println(resultado.getString("NUMERO_TAXIS"));
                
                Object[] oLocalidad = {resultado.getString("ID_LOCALIDAD"), resultado.getString("NOMBRE"), resultado.getString("NUMERO_TAXIS")};
            
                modeloLoc.addRow(oLocalidad);
                
            }
        
        }catch(Exception e){
        
            System.out.println(e);
        
        }
         
    }
    
     public void limpiar(){
        
        id_localidad.setText("");
        nombre_localidad.setText("");
        numero_taxis.setText("");
        
        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_localidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre_localidad;
    private javax.swing.JTextField numero_taxis;
    private javax.swing.JTable tablocalidad;
    // End of variables declaration//GEN-END:variables
}
