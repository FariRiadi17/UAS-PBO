package uaspbo;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

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
    
    private java.sql.Connection conn;
    
    public Form() {
        initComponents();
        conn = Connection.koneksi();
        getData();
    }
    
    private void getData(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        try{
            String sql = "select * From mahasiswa";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("No");
                String nama = rs.getString("nama");
                String alamat = rs.getString("alamat");
                String asalSekolah = rs.getString("asal_sekolah");
                String jenisKelamin = rs.getString("jns_klmn");
                String email = rs.getString("email");
                int telpon = rs.getInt("no_telp");
                
                Object[] rowData = {id,nama,alamat, asalSekolah,jenisKelamin,email,telpon};
                model.addRow(rowData);
            }
            rs.close();
            st.close();
        }   catch (Exception e){
                Logger.getLogger(Form.class.getName()).log(Level.SEVERE,null,e);
        }
       
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
        lblTglLhr1 = new javax.swing.JLabel();
        fieldAsalSekolah = new javax.swing.JTextField();
        lblTglLhr3 = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        lblTglLhr4 = new javax.swing.JLabel();
        fieldTelpon = new javax.swing.JTextField();
        jTableMouseClicked = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        save = new javax.swing.JButton();
        jenisKel = new javax.swing.JComboBox<>();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

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

        lblTglLhr1.setText("JENIS KELAMIN");

        fieldAsalSekolah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAsalSekolahActionPerformed(evt);
            }
        });

        lblTglLhr3.setText("EMAIL");

        fieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEmailActionPerformed(evt);
            }
        });

        lblTglLhr4.setText("NO. TELPON");

        fieldTelpon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTelponActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "Alamat", "Asal Sekolah", "Jenis Kelamin", "Email", "No. Telpon"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTableMouseClicked.setViewportView(jTable1);

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jenisKel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki laki", "Perempuan" }));
        jenisKel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisKelActionPerformed(evt);
            }
        });

        btnHapus.setText("Delete");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
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
                            .addComponent(jTableMouseClicked, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(save))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblTglLhr1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblNama)
                                                .addComponent(lblAlamat)
                                                .addComponent(lblAsalSekolah))
                                            .addComponent(lblTglLhr3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTglLhr4, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fieldAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                            .addComponent(fieldNama)
                                            .addComponent(fieldAsalSekolah)
                                            .addComponent(fieldEmail)
                                            .addComponent(fieldTelpon)
                                            .addComponent(jenisKel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEdit)))))
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
                    .addComponent(fieldAsalSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTglLhr1)
                    .addComponent(jenisKel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTglLhr3))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTglLhr4)
                    .addComponent(fieldTelpon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(btnHapus)
                    .addComponent(btnEdit))
                .addGap(18, 18, 18)
                .addComponent(jTableMouseClicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNamaActionPerformed

    private void fieldAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAlamatActionPerformed

    private void fieldAsalSekolahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAsalSekolahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAsalSekolahActionPerformed

    private void fieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEmailActionPerformed

    private void fieldTelponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTelponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTelponActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String nama = fieldNama.getText();
        String alamat = fieldAlamat.getText();
        String asalSekolah = fieldAsalSekolah.getText();
        int index = jenisKel.getSelectedIndex();
        String jenisKelamin = jenisKel.getItemAt(index);
        String email = fieldEmail.getText();
        int telpon = Integer.parseInt(fieldTelpon.getText());
        
        try {
            String sql = "INSERT INTO mahasiswa (nama,alamat,asal_sekolah,jns_klmn,email,no_telp) VALUES (?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, nama);
            stmt.setString(2, alamat);
            stmt.setString(3, asalSekolah);
            stmt.setString(4, jenisKelamin);
            stmt.setString(5, email);
            stmt.setInt(6, telpon);
            
            int rowInserted = stmt.executeUpdate();
            if(rowInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil Ditambahkan");
                resetForm();
                getData();
        }
        } catch (Exception e) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_saveActionPerformed
    
    private void jenisKelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisKelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisKelActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow != -1){
            String nama = jTable1.getValueAt(selectedRow,1).toString();
            String alamat = jTable1.getValueAt(selectedRow,2).toString();
            String asalSekolah = jTable1.getValueAt(selectedRow,3).toString();
            Object jenisKelamin = jTable1.getValueAt(selectedRow,4);
            String email = jTable1.getValueAt(selectedRow,5).toString();
            String telpon = jTable1.getValueAt(selectedRow,6).toString();
            
            fieldNama.setText(nama);
            fieldAlamat.setText(alamat);
            fieldAsalSekolah.setText(asalSekolah);
            jenisKel.setSelectedItem(jenisKelamin);
            fieldEmail.setText(email);
            fieldTelpon.setText(telpon);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    
    private void hiddenBtn(boolean isTrue) {
        save.setEnabled(isTrue);
    }
    
    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Yakin?");
        
        if(confirm == JOptionPane.YES_OPTION) {
            String id = jTable1.getValueAt(selectedRow, 0).toString();
            
            try {
                String sql = "DELETE FROM MAHASISWA WHERE No = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, id);
                
                int rowDelete = stmt.executeUpdate();
                
                if(rowDelete > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
                    resetForm();
                    getData();
                }
                
                stmt.close();
            } catch(HeadlessException | SQLException e) {
                Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:                                     
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Pilih Baris Yang Akan di Perbarui");
            return;
        }
        
        String id = jTable1.getValueAt(selectedRow, 0).toString();
        String nama = fieldNama.getText();
        String alamat = fieldAlamat.getText();
        String asalSekolah = fieldAsalSekolah.getText();
        int index = jenisKel.getSelectedIndex();
        String jenisKelamin = jenisKel.getItemAt(index);
        String email = fieldEmail.getText();
        int telpon = Integer.parseInt(fieldTelpon.getText());
        
        if(nama.isEmpty() || alamat.isEmpty() || asalSekolah.isEmpty() || email.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Di Isi", "Validasi", JOptionPane.ERROR);
            return;
        }

        try {
            String sql = "UPDATE mahasiswa SET nama=?, alamat=?, asal_sekolah=?, jns_klmn=?, email=?, no_telp=? WHERE No=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, nama);
            stmt.setString(2, alamat);
            stmt.setString(3, asalSekolah);
            stmt.setString(4, (String) jenisKelamin);
            stmt.setString(5, email);
            stmt.setInt (6, telpon);
            stmt.setInt(7, Integer.parseInt(id));
            
            int rowInserted = stmt.executeUpdate();
            if(rowInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil Ditambahkan");
                resetForm();
                getData();
            }
        
            stmt.close();
            } catch (Exception e) {
                Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, e);
            }
      hiddenBtn(true);
    }//GEN-LAST:event_btnEditActionPerformed

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
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JTextField fieldAlamat;
    private javax.swing.JTextField fieldAsalSekolah;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldTelpon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane jTableMouseClicked;
    private javax.swing.JComboBox<String> jenisKel;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblAsalSekolah;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblTglLhr1;
    private javax.swing.JLabel lblTglLhr3;
    private javax.swing.JLabel lblTglLhr4;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables

    private void resetForm(){
        fieldNama.setText("");
        fieldAlamat.setText("");
        fieldAsalSekolah.setText("");
        fieldEmail.setText("");
        fieldTelpon.setText("");
    }
}
