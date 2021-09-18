
package mytaxi.ClienteGUI;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mytaxi.ClienteDAL.Conexion;
import mytaxi.ClienteBL.EnviaSolicitudBL;

/**
 *
 * @author Charlie22
 */

public class EnviaSolicitudGUI extends javax.swing.JFrame {

    DefaultTableModel modeloEnvSol;
    
    public EnviaSolicitudGUI() {
        initComponents();
        
        String[] titulosEnvSol = {"Cédula del cliente", "Id de solicitud"};
        modeloEnvSol = new DefaultTableModel(null, titulosEnvSol);
        tabenvia_solicitud.setModel(modeloEnvSol);
        
        this.mostrarDatos();
        this.limpiar();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cedula_cliente = new javax.swing.JTextField();
        id_solicitud = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabenvia_solicitud = new javax.swing.JTable();
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
        jLabel17.setText("Cédula del cliente");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(290, 160, 160, 29);

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Id de solicitud");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(290, 200, 160, 29);

        cedula_cliente.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        cedula_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_clienteActionPerformed(evt);
            }
        });
        jPanel1.add(cedula_cliente);
        cedula_cliente.setBounds(460, 160, 183, 29);

        id_solicitud.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        id_solicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_solicitudActionPerformed(evt);
            }
        });
        jPanel1.add(id_solicitud);
        id_solicitud.setBounds(460, 200, 183, 29);

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(250, 290, 103, 31);

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(380, 290, 103, 31);

        jButton3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(510, 290, 103, 31);

        jButton4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(640, 290, 93, 31);

        jButton5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(890, 30, 90, 30);

        tabenvia_solicitud.setModel(new javax.swing.table.DefaultTableModel(
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
        tabenvia_solicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabenvia_solicitudMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabenvia_solicitud);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(110, 400, 540, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytaxi/recursos/fondopes.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 640);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabenvia_solicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabenvia_solicitudMouseClicked
   
        if(evt.getClickCount()==1){

            JTable receptor =(JTable)evt.getSource();

            cedula_cliente.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            id_solicitud.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            
        }

        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_tabenvia_solicitudMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  
        this.limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Conexion objConexion = new Conexion();

        EnviaSolicitudBL objEnviaSolicitudBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("DELETE FROM ENVIA_SOLICITUD WHERE CEDULA_CLIENTE = '%s'", objEnviaSolicitudBL.getCedula_cliente());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato eliminado en la BBDD");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Conexion objConexion = new Conexion();

        EnviaSolicitudBL objEnviaSolicitudBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("INSERT INTO ENVIA_SOLICITUD(CEDULA_CLIENTE, ID_SOLICITUD) "
            + "VALUES('%s', '%s')", objEnviaSolicitudBL.getCedula_cliente(), objEnviaSolicitudBL.getId_solicitud());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato insertado en la BBDD");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void id_solicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_solicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_solicitudActionPerformed

    private void cedula_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedula_clienteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    public void mostrarDatos(){
        
        while(modeloEnvSol.getRowCount() > 0){
        
            modeloEnvSol.removeRow(0);
        
        }
        
        Conexion objConexion = new Conexion();
        
        try{
            
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM ENVIA_SOLICITUD");
            
            while(resultado.next()){
                
                System.out.println(resultado.getString("CEDULA_CLIENTE"));
                System.out.println(resultado.getString("ID_SOLICITUD"));
 
                
                Object[] oEnviaSolicitud = {resultado.getString("CEDULA_CLIENTE"), resultado.getString("ID_SOLICITUD")};
            
                modeloEnvSol.addRow(oEnviaSolicitud);
                
            }
        
        }catch(Exception e){
        
            System.out.println(e);
        
        }
         
    }
    
    public EnviaSolicitudBL recuperarDatosGUI(){
        
        EnviaSolicitudBL objEnviaSolicitudBL = new EnviaSolicitudBL();
        
        objEnviaSolicitudBL.setCedula_cliente(cedula_cliente.getText());
        objEnviaSolicitudBL.setId_solicitud(id_solicitud.getText());
        
        return objEnviaSolicitudBL;
   
    }
    
    public void limpiar(){
        
        cedula_cliente.setText("");
        id_solicitud.setText("");

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
            java.util.logging.Logger.getLogger(EnviaSolicitudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnviaSolicitudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnviaSolicitudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnviaSolicitudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnviaSolicitudGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula_cliente;
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
    private javax.swing.JTable tabenvia_solicitud;
    // End of variables declaration//GEN-END:variables
}
