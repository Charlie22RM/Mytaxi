
package mytaxi.ClienteGUI;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mytaxi.ClienteDAL.Conexion;
import mytaxi.ClienteBL.DesignaConductorBL;

/**
 *
 * @author Charlie22
 */

public class DesignaConductorGUI extends javax.swing.JFrame {

    DefaultTableModel modeloDesCon;
    
    public DesignaConductorGUI() {
        initComponents();
        
        String[] titulosDesCon = {"Cédula del Personal", "Cédula del conductor"};
        modeloDesCon = new DefaultTableModel(null, titulosDesCon);
        tabdesigna_conductor.setModel(modeloDesCon);
        
        this.mostrarDatos();
        this.limpiar();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cedula_personal = new javax.swing.JTextField();
        cedula_conductor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabdesigna_conductor = new javax.swing.JTable();
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
        jLabel17.setText("Cédula del personal");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(290, 150, 160, 29);

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Cédula del conductor");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(260, 190, 190, 29);

        cedula_personal.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        cedula_personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_personalActionPerformed(evt);
            }
        });
        jPanel1.add(cedula_personal);
        cedula_personal.setBounds(460, 150, 183, 29);

        cedula_conductor.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        cedula_conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_conductorActionPerformed(evt);
            }
        });
        jPanel1.add(cedula_conductor);
        cedula_conductor.setBounds(460, 190, 183, 29);

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(270, 300, 103, 31);

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(400, 300, 103, 31);

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
        jButton4.setBounds(660, 300, 93, 31);

        jButton5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(890, 30, 90, 30);

        tabdesigna_conductor.setModel(new javax.swing.table.DefaultTableModel(
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
        tabdesigna_conductor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabdesigna_conductorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabdesigna_conductor);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 390, 540, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytaxi/recursos/fondopdc.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 640);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedula_personalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_personalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedula_personalActionPerformed

    private void cedula_conductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_conductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedula_conductorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        Conexion objConexion = new Conexion();

        DesignaConductorBL objDesignaConductorBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("INSERT INTO DESIGNA_CONDUCTOR(CEDULA_PERSONAL, CEDULA_CONDUCTOR) "
        + "VALUES('%s', '%s')", objDesignaConductorBL.getCedula_personal(), objDesignaConductorBL.getCedula_conductor());

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

        DesignaConductorBL objDesignaConductorBL = recuperarDatosGUI();

        String sentenciaInsert = String.format("DELETE FROM DESIGNA_CONDUCTOR WHERE CEDULA_PERSONAL = '%s'", objDesignaConductorBL.getCedula_personal());

        objConexion.ejecutarSentencia(sentenciaInsert);
        this.mostrarDatos();
        this.limpiar();
        System.out.println("Dato eliminado en la BBDD");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 
        this.limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabdesigna_conductorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabdesigna_conductorMouseClicked
    
        if(evt.getClickCount()==1){

            JTable receptor =(JTable)evt.getSource();

            cedula_personal.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            cedula_conductor.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());

        }

        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        
    }//GEN-LAST:event_tabdesigna_conductorMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    public void mostrarDatos(){
        
        while(modeloDesCon.getRowCount() > 0){
        
            modeloDesCon.removeRow(0);
        
        }
        
        Conexion objConexion = new Conexion();
        
        try{
            
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM DESIGNA_CONDUCTOR");
            
            while(resultado.next()){
                
                System.out.println(resultado.getString("CEDULA_PERSONAL"));
                System.out.println(resultado.getString("CEDULA_CONDUCTOR"));
 
                Object[] oAceptaSolicitud = {resultado.getString("CEDULA_PERSONAL"), resultado.getString("CEDULA_CONDUCTOR")};
            
                modeloDesCon.addRow(oAceptaSolicitud);
                
            }
        
        }catch(Exception e){
        
            System.out.println(e);
        
        }
         
    }
    
    public DesignaConductorBL recuperarDatosGUI(){
        
        DesignaConductorBL objAceptaSolicitudBL = new DesignaConductorBL();

        objAceptaSolicitudBL.setCedula_personal(cedula_personal.getText());
        objAceptaSolicitudBL.setCedula_conductor(cedula_conductor.getText());

        return objAceptaSolicitudBL;
   
    }
    
    public void limpiar(){

        cedula_personal.setText("");
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
            java.util.logging.Logger.getLogger(DesignaConductorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesignaConductorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesignaConductorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesignaConductorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesignaConductorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula_conductor;
    private javax.swing.JTextField cedula_personal;
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
    private javax.swing.JTable tabdesigna_conductor;
    // End of variables declaration//GEN-END:variables
}
