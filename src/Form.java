/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author riadi
 */
public class Form extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        fieldNama = new javax.swing.JTextField();
        lblAlamat = new javax.swing.JLabel();
        lblAsalSekolah = new javax.swing.JLabel();
        fieldAlamat = new javax.swing.JTextField();
        fieldAsalSekolah1 = new javax.swing.JTextField();
        lblTglLhr1 = new javax.swing.JLabel();
        dotLaki = new javax.swing.JRadioButton();
        dotPerempuan = new javax.swing.JRadioButton();
        lblTglLhr2 = new javax.swing.JLabel();
        fieldAsalSekolah2 = new javax.swing.JTextField();
        lblTglLhr3 = new javax.swing.JLabel();
        fieldAsalSekolah3 = new javax.swing.JTextField();
        lblTglLhr4 = new javax.swing.JLabel();
        fieldAsalSekolah4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRASI MAHASISWA");

        lblNama.setText("NAMA");

        fieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNamaActionPerformed(evt);
            }
        });

        lblAlamat.setText("ALAMAT");

        lblAsalSekolah.setText("ASAL SEKOLAH");

        fieldAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAlamatActionPerformed(evt);
            }
        });

        fieldAsalSekolah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAsalSekolah1ActionPerformed(evt);
            }
        });

        lblTglLhr1.setText("JENIS KELAMIN");

        dotLaki.setText("Laki-laki");

        dotPerempuan.setText("Perempuan");

        lblTglLhr2.setText("NEM");

        fieldAsalSekolah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAsalSekolah2ActionPerformed(evt);
            }
        });

        lblTglLhr3.setText("EMAIL");

        fieldAsalSekolah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAsalSekolah3ActionPerformed(evt);
            }
        });

        lblTglLhr4.setText("NO. TELPON");

        fieldAsalSekolah4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAsalSekolah4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "Alamat", "Asal Sekolah", "Jenis Kelamin", "Email", "No. Telpon", "NEM"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(save)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTglLhr1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNama)
                                            .addComponent(lblAlamat)
                                            .addComponent(lblAsalSekolah))
                                        .addComponent(lblTglLhr3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTglLhr4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTglLhr2, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fieldAlamat)
                                        .addComponent(fieldNama)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(dotPerempuan)
                                            .addGap(18, 18, 18)
                                            .addComponent(dotLaki))
                                        .addComponent(fieldAsalSekolah2)
                                        .addComponent(fieldAsalSekolah3)
                                        .addComponent(fieldAsalSekolah4)
                                        .addComponent(fieldAsalSekolah1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlamat)
                    .addComponent(fieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsalSekolah)
                    .addComponent(fieldAsalSekolah2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTglLhr1)
                    .addComponent(dotPerempuan)
                    .addComponent(dotLaki))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldAsalSekolah3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTglLhr3))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTglLhr4)
                    .addComponent(fieldAsalSekolah4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTglLhr2)
                    .addComponent(fieldAsalSekolah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNamaActionPerformed

    private void fieldAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAlamatActionPerformed

    private void fieldAsalSekolah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAsalSekolah1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAsalSekolah1ActionPerformed

    private void fieldAsalSekolah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAsalSekolah2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAsalSekolah2ActionPerformed

    private void fieldAsalSekolah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAsalSekolah3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAsalSekolah3ActionPerformed

    private void fieldAsalSekolah4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAsalSekolah4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAsalSekolah4ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton dotLaki;
    private javax.swing.JRadioButton dotPerempuan;
    private javax.swing.JTextField fieldAlamat;
    private javax.swing.JTextField fieldAsalSekolah1;
    private javax.swing.JTextField fieldAsalSekolah2;
    private javax.swing.JTextField fieldAsalSekolah3;
    private javax.swing.JTextField fieldAsalSekolah4;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblAsalSekolah;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblTglLhr1;
    private javax.swing.JLabel lblTglLhr2;
    private javax.swing.JLabel lblTglLhr3;
    private javax.swing.JLabel lblTglLhr4;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
