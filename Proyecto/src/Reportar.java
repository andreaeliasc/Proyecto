
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */
public class Reportar extends javax.swing.JFrame {
        private final Registro r;
        private Connection cn;

    /**
     * Creates new form
     */
    public Reportar() {
        initComponents();
        titulo.setText(bienvenido.texto);
        r = new Registro();
        Grupo.add(Normal);
        Grupo.add(Moderada);
        Grupo.add(Larga);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Normal = new javax.swing.JRadioButton();
        Moderada = new javax.swing.JRadioButton();
        Larga = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblRestaurante = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblGracias = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Haz tu reporte");

        jButton4.setText("Enviar Reporte");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Normal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Normal.setForeground(new java.awt.Color(153, 204, 0));
        Normal.setText("Fila Normal");

        Moderada.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Moderada.setForeground(new java.awt.Color(255, 153, 51));
        Moderada.setText("Fila Moderada");

        Larga.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Larga.setForeground(new java.awt.Color(255, 51, 51));
        Larga.setText("Fila Muy Larga");
        Larga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LargaActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descarga.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/depositphotos_66922653-stock-illustration-long-queue-icon.jpg"))); // NOI18N

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(Normal))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButton1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(Moderada)
                                .addGap(158, 158, 158)
                                .addComponent(Larga))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(lblGracias))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRestaurante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombre)))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRestaurante)
                .addGap(10, 10, 10)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Normal)
                            .addComponent(Moderada)
                            .addComponent(Larga))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addGap(102, 102, 102)
                        .addComponent(lblGracias)
                        .addGap(46, 46, 46)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(64, 64, 64))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LargaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        
        if (Normal.isSelected()){
          double fila = 2.0;
            try { 
         conexion con = new conexion();
         cn = con.getconectar();
         String sql = "Insert into reporte (id,tiempo,restaurante) values(?,?,?)";
         PreparedStatement pst = cn.prepareCall(sql);
         pst.setInt(1,0);
         pst.setInt(2, (int) fila);
         pst.setString(3,titulo.getText());
         
        
         pst.executeUpdate();
         JOptionPane.showMessageDialog(null,"Reporte Enviado");
         pst.close();
         cn.close();
         
         
        
       }
       
       catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null,ex);
           
           
             lblGracias.setText("Gracias por Reportar");
             }
        }
        if(Moderada.isSelected()){
            double fila = 4.0;
            
            
            try { 
         conexion con = new conexion();
         cn = con.getconectar();
         String sql = "Insert into reporte (tiempo,restaurante) values(?,?)";
         PreparedStatement pst = cn.prepareCall(sql);
         pst.setInt(1, (int) fila);
         pst.setString(2,titulo.getText());
         
        
         pst.executeUpdate();
         JOptionPane.showMessageDialog(null,"Reporte Enviado");
         pst.close();
         cn.close();
         
         
        
       }
       
       catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null,ex);
           
             lblGracias.setText("Gracias por Reportar");
        }
        }
        
        if(Larga.isSelected()){
            double fila = 8.0;
           
            
            try { 
         conexion con = new conexion();
         cn = con.getconectar();
         String sql = "Insert into reporte (tiempo,restaurante) values(?,?)";
         PreparedStatement pst = cn.prepareCall(sql);
         pst.setInt(1, (int) fila);
         pst.setString(2,titulo.getText());
         
        
         pst.executeUpdate();
         JOptionPane.showMessageDialog(null,"Reporte Enviado");
         pst.close();
         cn.close();
         
         
        
       }
       
       catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null,ex);
           
             lblGracias.setText("Gracias por Reportar");
        }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Opciones nuevo = new Opciones();
        nuevo.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            //java.util.logging.LoggerGrupoeportar.class.getName.log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            //</editor-fold>
            
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Reportar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo;
    private javax.swing.JRadioButton Larga;
    private javax.swing.JRadioButton Moderada;
    private javax.swing.JRadioButton Normal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblGracias;
    public static javax.swing.JLabel lblNombre;
    public static javax.swing.JLabel lblRestaurante;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
