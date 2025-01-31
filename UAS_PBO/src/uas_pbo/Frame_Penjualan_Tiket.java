/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas_pbo;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class Frame_Penjualan_Tiket extends javax.swing.JFrame {
private DefaultTableModel model;
   
    public Frame_Penjualan_Tiket() {
        initComponents();
        model = new DefaultTableModel();
        tabel.setModel(model);
        model.addColumn("No Kursi");
        model.addColumn("Jenis Tiket");
        model.addColumn("Harga Satuan");
        model.addColumn("Jumlah Beli");
        model.addColumn("Total Harga");
        model.addColumn("Judul Film");
        model.addColumn("Jam Tayang");
        
        loadData();
    }
    
    //PUBLIC UNTUK MENGLOAD DATA
    public void loadData() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        Connection c = null;
        Statement s = null;
        ResultSet r = null;
        
        try {
            c = KoneksiDatabase.getKoneksi();
            if (c == null) {
            System.out.println("Connection failed. Please check the database configuration.");
            return;
            }
            
            s = c.createStatement();
            String sql = "SELECT * FROM sistem_Pemesanan";
            r = s.executeQuery(sql);
            
            while (r.next()) {
                Object[] o = new Object[7];
                o[0] = r.getString("No_kursi");
                o[1] = r.getString("Jenis_tiket");
                o[2] = r.getString("Harga_satuan");
                o[3] = r.getString("Jumlah_beli");
                o[4] = r.getString("Total_harga");
                o[5] = r.getString("Judul_film");
                o[6] = r.getString("Jam_tayang");
                model.addRow(o);
            }

        }
        catch (SQLException e) {
            System.out.println("Terjadi kesalahan pada load data" + e.getMessage());
        } finally {
            try {
                if (r !=null) r.close();
                if (s !=null)s.close();
                return;
            } catch (SQLException e) {
                System.out.println("Terjadi kesalahan saat menutup koneksi" + e.getMessage());
            }
        }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JUDUL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        HargaSatuan = new javax.swing.JTextField();
        JumlahBeli = new javax.swing.JTextField();
        TotalHarga = new javax.swing.JTextField();
        NoKursi = new javax.swing.JComboBox<>();
        Reguler = new javax.swing.JRadioButton();
        XDUltra = new javax.swing.JRadioButton();
        Ultra = new javax.swing.JRadioButton();
        Gold = new javax.swing.JRadioButton();
        Proses = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ListFilm = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        JamTayang = new javax.swing.JComboBox<>();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JUDUL.setFont(new java.awt.Font("ROG Fonts", 1, 36)); // NOI18N
        JUDUL.setForeground(new java.awt.Color(255, 204, 51));
        JUDUL.setText("PEMESANAN TIKET BIOSKOP");
        getContentPane().add(JUDUL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No.Kursi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jenis Tiket");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Harga Satuan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jumlah Beli");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Harga");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, -1, -1));

        HargaSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaSatuanActionPerformed(evt);
            }
        });
        getContentPane().add(HargaSatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 204, -1));

        JumlahBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahBeliActionPerformed(evt);
            }
        });
        getContentPane().add(JumlahBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 204, -1));

        TotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalHargaActionPerformed(evt);
            }
        });
        getContentPane().add(TotalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 204, 30));

        NoKursi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Nomer Kursi", "A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "B4", "B5", "C1", "C2", "C3", "C4", "C5" }));
        getContentPane().add(NoKursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 200, 30));

        Reguler.setForeground(new java.awt.Color(255, 204, 102));
        Reguler.setText("Reguler");
        Reguler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegulerActionPerformed(evt);
            }
        });
        getContentPane().add(Reguler, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        XDUltra.setForeground(new java.awt.Color(255, 204, 102));
        XDUltra.setText("XD Ultra");
        XDUltra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XDUltraActionPerformed(evt);
            }
        });
        getContentPane().add(XDUltra, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        Ultra.setForeground(new java.awt.Color(255, 204, 102));
        Ultra.setText("Ultra");
        Ultra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltraActionPerformed(evt);
            }
        });
        getContentPane().add(Ultra, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, -1, -1));

        Gold.setForeground(new java.awt.Color(255, 204, 102));
        Gold.setText("Gold");
        Gold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoldActionPerformed(evt);
            }
        });
        getContentPane().add(Gold, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, -1, -1));

        Proses.setText("Proses");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });
        getContentPane().add(Proses, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, -1, -1));

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, -1, -1));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 860, 250));

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 640, 350, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Judul Film");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        ListFilm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Judul Film ", "Marni", "Badarawuhi", "Kereta Berdarah", "Train To Busan", "Jurnal Risa", "Menjelang Ajal", "Siksa Kubur", "Do You See What I see" }));
        ListFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListFilmActionPerformed(evt);
            }
        });
        getContentPane().add(ListFilm, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 206, 32));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jam Tayang ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, -1));

        JamTayang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jam Tayang", "13:15", "15:15", "17:15", "19:15", "21:15" }));
        getContentPane().add(JamTayang, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 206, 32));

        jLabelBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\krisna\\OneDrive\\Pictures\\pngwing.com (13).png")); // NOI18N
        jLabelBackground.setText(".");
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -220, 950, 1370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalHargaActionPerformed

    private void RegulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegulerActionPerformed
         HargaSatuan.setText("50000");
         System.out.println("Tiket Reguler yang dipilih");
    }//GEN-LAST:event_RegulerActionPerformed

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
        int a = Integer.parseInt(HargaSatuan.getText());
        int b = Integer.parseInt(JumlahBeli.getText());
        int hasilnya= a*b ;
        TotalHarga.setText(""+hasilnya);
        System.out.println("Testing  : " + hasilnya);
    }//GEN-LAST:event_ProsesActionPerformed

    private void XDUltraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XDUltraActionPerformed
         HargaSatuan.setText("70000");
         System.out.println("Tiket XDUltra yang dipilih");
    }//GEN-LAST:event_XDUltraActionPerformed

    private void UltraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltraActionPerformed
         HargaSatuan.setText("60000");
         System.out.println("Tiket Ulta yang dipilih");
    }//GEN-LAST:event_UltraActionPerformed

    private void GoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoldActionPerformed
        HargaSatuan.setText("100000");
        System.out.println("Tiket Gold yang dipilih");
    }//GEN-LAST:event_GoldActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        NoKursi.setSelectedItem("");
        JumlahBeli.setText("");
        HargaSatuan.setText("");
        TotalHarga.setText("");
        ListFilm.setSelectedItem("");
        JamTayang.setSelectedItem("");
        System.out.println("Button cancel dapat di pencet");
    }//GEN-LAST:event_CancelActionPerformed

    
    //BUTTON UNTUK MENYIMPAN DAN MENAMPILKAN KE TABEL
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String noKursi = (String) NoKursi.getSelectedItem();
        String hargaSatuan = HargaSatuan.getText();
        String jumlahBeli = JumlahBeli.getText();
        String totalHarga = TotalHarga.getText();
        String jenisTiket = "";
        String judulFilm = (String) ListFilm.getSelectedItem();
        String jamTayang = (String) JamTayang.getSelectedItem();
        
        //radio button selection
        if (Reguler.isSelected()) jenisTiket = "Reguler";
        else if (Ultra.isSelected()) jenisTiket = "Ultra";
        else if (XDUltra.isSelected()) jenisTiket = "XDUltra";
        else if (Gold.isSelected()) jenisTiket = "Gold";
        
        //UNTUK CHECK VALIDASI
        if (noKursi.isEmpty() || hargaSatuan.isEmpty() || totalHarga.isEmpty() || jenisTiket.isEmpty() || judulFilm.isEmpty() || jamTayang.isEmpty()) {
            System.out.println("semua field harus diisi");
            return;
        }
        
        try {
            int harga = Integer.parseInt(hargaSatuan);
            int jumlah = Integer.parseInt(jumlahBeli);
            int total = Integer.parseInt(totalHarga);
            
            
            //UNTUK MENAMPILKAN DATANYA KE DATABASE MYSQL
            Connection c  = KoneksiDatabase.getKoneksi();
            String sql = "INSERT INTO sistem_pemesanan (no_kursi, jenis_Tiket, harga_satuan, jumlah_Beli, total_Harga, judul_Film, jam_Tayang) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, noKursi);
                p.setString(2, jenisTiket);
                p.setInt(3, Integer.parseInt(hargaSatuan));
                p.setInt(4, Integer.parseInt(jumlahBeli));
                p.setInt(5, Integer.parseInt(totalHarga));
                p.setString(6, judulFilm);
                p.setString(7, jamTayang);
                p.executeUpdate();
                System.out.println("Data berhasil ditambahkan");
            }catch (SQLException e ) {
            System.out.println("Terjadi Kesalahan saat menyimpan data" + e.getMessage());
        }            
        }catch (NumberFormatException e) {
            System.out.println("Field harga satuan, jumlah beli, dan total harga harus berupa angka valid");
        }
        
        //reload data
        loadData();
    }//GEN-LAST:event_btnTambahActionPerformed

        
    private void HargaSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaSatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HargaSatuanActionPerformed

    private void JumlahBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahBeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahBeliActionPerformed

    private void ListFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListFilmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListFilmActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(Frame_Penjualan_Tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Penjualan_Tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Penjualan_Tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Penjualan_Tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //todo code
        Frame_Penjualan_Tiket Laund = new Frame_Penjualan_Tiket();
        Laund.setVisible(true);
        
        // pengujian code button 
         
        //UNTUK PENGUJIANYA BUAT DISINI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Penjualan_Tiket().setVisible(true);
            }
   
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JRadioButton Gold;
    private javax.swing.JTextField HargaSatuan;
    private javax.swing.JLabel JUDUL;
    private javax.swing.JComboBox<String> JamTayang;
    private javax.swing.JTextField JumlahBeli;
    private javax.swing.JComboBox<String> ListFilm;
    private javax.swing.JComboBox<String> NoKursi;
    private javax.swing.JButton Proses;
    private javax.swing.JRadioButton Reguler;
    private javax.swing.JTextField TotalHarga;
    private javax.swing.JRadioButton Ultra;
    private javax.swing.JRadioButton XDUltra;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
