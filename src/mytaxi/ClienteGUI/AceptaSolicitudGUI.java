
package mytaxi.ClienteGUI;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mytaxi.ClienteDAL.Conexion;
import mytaxi.ClienteBL.AceptaSolicitudBL;

/**
 *
 * @author Charlie22
 */

public class AceptaSolicitudGUI extends javax.swing.JFrame {
    
     DefaultTableModel modeloAcpSol;

    public AceptaSolicitudGUI() {
        initComponents();
        
        tabacepta_solicitud.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabacepta_solicitud.getColumnModel().getColumn(0).setResizable(false);
        
        String[] titulosAcpSol = {"Id de solicitud", "Cédula del Personal"};
        modeloAcpSol = new DefaultTableModel(null, titulosAcpSol);
        tabacepta_solicitud.setModel(modeloAcpSol);
        
        
        this.mostrarDatos();
        this.limpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        id_solicitud = new javax.swing.JTextField();
        cedula_personal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabacepta_solicitud = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 640));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 640));
        jPanel1.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Id de solicitud");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(320, 160, 160, 29);

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Cédula del personal");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(320, 200, 160, 29);

        id_solicitud.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        id_solicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_solicitudActionPerformed(evt);
            }
        });
        jPanel1.add(id_solicitud);
        id_solicitud.setBounds(490, 160, 183, 29);

        cedula_personal.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        cedula_personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_personalActionPerformed(evt);
            }
        });
        jPanel1.add(cedula_personal);
        cedula_personal.setBounds(490, 200, 183, 29);

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
        jButton2.setBounds(390, 330, 103, 31);

        jButton3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(520, 330, 103, 31);

        jButton4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(650, 330, 93, 31);

        jButton5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(890, 30, 90, 30);

        tabacepta_solicitud.setModel(new javax.swing.table.DefaultTableModel(
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
        tabacepta_solicitud.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabacepta_solicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabacepta_solicitudMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabacepta_solicitud);
        if (tabacepta_solicitud.getColumnModel().getColumnCount() > 0) {
            tabacepta_solicitud.getColumnModel().getColumn(0).setResizable(false);
            tabacepta_solicitud.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabacepta_solicitud.getColumnModel().getColumn(1).setResizable(false);
            tabacepta_solicitud.getColumnModel().getColumn(1).setPreferredWidth(10);
            tabacepta_solicitud.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            tabacepta_solicitud.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(110, 420, 510, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytaxi/recursos/fondopas.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 640);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_solicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_solicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_solicitudActionPerformed

    private void cedula_personalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_personalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedula_personalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        Conexion objConexion = new Conexion();

        AceptaSolicitudBL objAceptaSolicitudBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("INSERT INTO ACEPTA_SOLICITUD(ID_SOLICITUD, CEDULA_PERSONAL) "
        + "VALUES('%s', '%s')", objAceptaSolicitudBL.getId_solicitud(), objAceptaSolicitudBL.getCedula_personal());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato insertado en la BBDD");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
        Conexion objConexion = new Conexion();

        AceptaSolicitudBL objAceptaSolicitudBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("DELETE FROM ACEPTA_SOLICITUD WHERE ID_SOLICITUD = '%s'", objAceptaSolicitudBL.getId_solicitud());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato eliminado en la BBDD");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        this.limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabacepta_solicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabacepta_solicitudMouseClicked

        if(evt.getClickCount()==1){

            JTable receptor =(JTable)evt.getSource();

            id_solicitud.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            cedula_personal.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());

        }

        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_tabacepta_solicitudMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    public void mostrarDatos(){
        
        while(modeloAcpSol.getRowCount() > 0){
        
            modeloAcpSol.removeRow(0);
        
        }
        
        Conexion objConexion = new Conexion();
        
        try{
            
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM ACEPTA_SOLICITUD");
            
            while(resultado.next()){
                
                System.out.println(resultado.getString("ID_SOLICITUD"));
                System.out.println(resultado.getString("CEDULA_PERSONAL"));

                Object[] oAceptaSolicitud = {resultado.getString("ID_SOLICITUD"), resultado.getString("CEDULA_PERSONAL")};
            
                modeloAcpSol.addRow(oAceptaSolicitud);
                
            }
        
        }catch(Exception e){
        
            System.out.println(e);
        
        }
         
    }
    
    public AceptaSolicitudBL recuperarDatosGUI(){
        
        AceptaSolicitudBL objAceptaSolicitudBL = new AceptaSolicitudBL();

        objAceptaSolicitudBL.setId_solicitud(id_solicitud.getText());
        objAceptaSolicitudBL.setCedula_personal(cedula_personal.getText());

        return objAceptaSolicitudBL;
   
    }
    
    public void limpiar(){
        
        id_solicitud.setText("");
        cedula_personal.setText("");

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
            java.util.logging.Logger.getLogger(AceptaSolicitudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AceptaSolicitudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AceptaSolicitudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AceptaSolicitudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AceptaSolicitudGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula_personal;
    private javax.swing.JTextField id_solicitud;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabacepta_solicitud;
    // End of variables declaration//GEN-END:variables
}
