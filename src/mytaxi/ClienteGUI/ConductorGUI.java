
package mytaxi.ClienteGUI;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mytaxi.ClienteDAL.Conexion;
import mytaxi.ClienteBL.ConductorBL;

/**
 *
 * @author Charlie22
 */

public class ConductorGUI extends javax.swing.JFrame {

    DefaultTableModel modeloCon;
    
    public ConductorGUI() {
        initComponents();
        
        String[] titulosCon = {"Cédula", "Nombre", "Apellido", "Correo electronico", "Número telefónico", "Dirección"};
        modeloCon = new DefaultTableModel(null, titulosCon);
        tabconductor.setModel(modeloCon);
        
        this.mostrarDatos();
        this.limpiar();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabconductor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1020, 640));
        setMinimumSize(new java.awt.Dimension(1020, 640));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(1020, 640));
        jPanel2.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Cédula");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(290, 120, 160, 29);

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Nombre");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(290, 160, 160, 29);

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Apellido");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(290, 200, 160, 29);

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Correo electrónico");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(290, 240, 160, 29);

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Número telefónico");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(290, 280, 160, 29);

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Dirección");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(290, 320, 160, 29);

        cedula.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        jPanel2.add(cedula);
        cedula.setBounds(460, 120, 183, 29);

        nombre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel2.add(nombre);
        nombre.setBounds(460, 160, 183, 29);

        apellido.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        jPanel2.add(apellido);
        apellido.setBounds(460, 200, 183, 29);

        correo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        jPanel2.add(correo);
        correo.setBounds(460, 240, 183, 29);

        numero.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });
        jPanel2.add(numero);
        numero.setBounds(460, 280, 183, 29);

        direccion.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        jPanel2.add(direccion);
        direccion.setBounds(460, 320, 183, 29);

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(270, 360, 103, 31);

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(400, 360, 103, 31);

        jButton3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(530, 360, 103, 31);

        jButton4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(660, 360, 93, 31);

        jButton5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(890, 30, 90, 30);

        tabconductor.setModel(new javax.swing.table.DefaultTableModel(
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
        tabconductor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabconductorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabconductor);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(100, 430, 540, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytaxi/recursos/fondopco.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 640);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Conexion objConexion = new Conexion();

        ConductorBL objConductorBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("INSERT INTO CONDUCTOR(CEDULA_CONDUCTOR, NOMBRE, APELLIDO, CORREO_ELECTRONICO, NUMERO_TELEFONICO, DIRECCION) "
        + "VALUES('%s', '%s', '%s', '%s', '%s', '%s')", objConductorBL.getCedula(), objConductorBL.getNombre(), objConductorBL.getApellido(), 
        objConductorBL.getCorreo_electronico(), objConductorBL.getNumero_telefonico(), objConductorBL.getDireccion());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato insertado en la BBDD");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Conexion objConexion = new Conexion();

        ConductorBL objConductorBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("UPDATE CONDUCTOR SET NOMBRE = '%s', APELLIDO = '%s', CORREO_ELECTRONICO = '%s',"
        + "NUMERO_TELEFONICO = '%s', DIRECCION = '%s' WHERE CEDULA_CONDUCTOR = '%s'",
        objConductorBL.getNombre(), objConductorBL.getApellido(), objConductorBL.getCorreo_electronico(),
        objConductorBL.getNumero_telefonico(), objConductorBL.getDireccion(), objConductorBL.getCedula());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato modificado en la BBDD");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Conexion objConexion = new Conexion();

        ConductorBL objConductorBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("DELETE FROM CONDUCTOR WHERE CEDULA_CONDUCTOR = '%s'", objConductorBL.getCedula());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato eliminado en la BBDD");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        this.limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabconductorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabconductorMouseClicked
  
        if(evt.getClickCount()==1){

            JTable receptor =(JTable)evt.getSource();

            cedula.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            nombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            apellido.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            correo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            numero.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
            direccion.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5).toString());

        }

        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_tabconductorMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed


    public void mostrarDatos(){
        
        while(modeloCon.getRowCount() > 0){
        
            modeloCon.removeRow(0);
        
        }
        
        Conexion objConexion = new Conexion();
        
        try{
            
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM CONDUCTOR");
            
            while(resultado.next()){
                
                System.out.println(resultado.getString("CEDULA_CONDUCTOR"));
                System.out.println(resultado.getString("NOMBRE"));
                System.out.println(resultado.getString("APELLIDO"));
                System.out.println(resultado.getString("CORREO_ELECTRONICO"));
                System.out.println(resultado.getString("NUMERO_TELEFONICO"));
                System.out.println(resultado.getString("DIRECCION"));
                
                Object[] oConductor = {resultado.getString("CEDULA_CONDUCTOR"), resultado.getString("NOMBRE"), resultado.getString("APELLIDO"), 
                                     resultado.getString("CORREO_ELECTRONICO"), resultado.getString("NUMERO_TELEFONICO"), resultado.getString("DIRECCION")};
            
                modeloCon.addRow(oConductor);
                
            }
        
        }catch(Exception e){
        
            System.out.println(e);
        
        }
         
    }
    
    public ConductorBL recuperarDatosGUI(){
        
        ConductorBL objConductorBL = new ConductorBL();
        
        objConductorBL.setCedula(cedula.getText());
        objConductorBL.setNombre(nombre.getText());
        objConductorBL.setApellido(apellido.getText());
        objConductorBL.setCorreo_electronico(correo.getText());
        objConductorBL.setNumero_telefonico(numero.getText());
        objConductorBL.setDireccion(direccion.getText());
        
        return objConductorBL;
   
    }
    
    public void limpiar(){
        
        cedula.setText("");
        nombre.setText("");
        apellido.setText("");
        correo.setText("");
        numero.setText("");
        direccion.setText("");
        
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
            java.util.logging.Logger.getLogger(ConductorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConductorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConductorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConductorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConductorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField direccion;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numero;
    private javax.swing.JTable tabconductor;
    // End of variables declaration//GEN-END:variables
}
