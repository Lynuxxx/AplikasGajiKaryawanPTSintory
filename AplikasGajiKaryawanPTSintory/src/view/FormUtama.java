/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;

 
public class FormUtama extends javax.swing.JFrame {

    public FormUtama() {
        initComponents();

        
            setUkuranLokasiFrame(0.8, true); 
    }

    @SuppressWarnings("unchecked")
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        mdiDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        aplikasiMenu = new javax.swing.JMenu();
        deskripsiMenuItem = new javax.swing.JMenuItem();
        aksesMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        keluarMenuItem = new javax.swing.JMenuItem();
        masterDataMenu = new javax.swing.JMenu();
        karyawanMenuItem = new javax.swing.JMenuItem();
        pekerjaanMenuItem = new javax.swing.JMenuItem();
        transaksiMenu = new javax.swing.JMenu();
        gajiMenuItem = new javax.swing.JMenuItem();
        laporanMenu = new javax.swing.JMenu();
        gajiLaporanMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        karyawanLaporanMenuItem = new javax.swing.JMenuItem();
        pekerjaanLaporanMenuItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi  Gaji Karyawan PT Sintory ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout mdiDesktopPaneLayout = new javax.swing.GroupLayout(mdiDesktopPane);
        mdiDesktopPane.setLayout(mdiDesktopPaneLayout);
        mdiDesktopPaneLayout.setHorizontalGroup(
            mdiDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );
        mdiDesktopPaneLayout.setVerticalGroup(
            mdiDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        aplikasiMenu.setText("Aplikasi");

        deskripsiMenuItem.setText("Deskripsi");
        aplikasiMenu.add(deskripsiMenuItem);

        aksesMenuItem.setText("Login");
        aplikasiMenu.add(aksesMenuItem);
        aplikasiMenu.add(jSeparator1);

        keluarMenuItem.setText("Keluar");
        keluarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarMenuItemActionPerformed(evt);
            }
        });
        aplikasiMenu.add(keluarMenuItem);

        jMenuBar1.add(aplikasiMenu);

        masterDataMenu.setText("Master Data");

        karyawanMenuItem.setText("Karyawan");
        karyawanMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karyawanMenuItemActionPerformed(evt);
            }
        });
        masterDataMenu.add(karyawanMenuItem);

        pekerjaanMenuItem.setText("Pekerjaan");
        masterDataMenu.add(pekerjaanMenuItem);

        jMenuBar1.add(masterDataMenu);

        transaksiMenu.setText("Transaksi");

        gajiMenuItem.setText("Gaji");
        transaksiMenu.add(gajiMenuItem);

        jMenuBar1.add(transaksiMenu);

        laporanMenu.setText("Laporan");

        gajiLaporanMenuItem.setText("Gaji");
        laporanMenu.add(gajiLaporanMenuItem);
        laporanMenu.add(jSeparator2);

        karyawanLaporanMenuItem.setText("Karyawan");
        laporanMenu.add(karyawanLaporanMenuItem);

        pekerjaanLaporanMenuItem.setText("Pekerjaan");
        laporanMenu.add(pekerjaanLaporanMenuItem);

        jMenuBar1.add(laporanMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mdiDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mdiDesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void setEnableMenu(boolean aktif) {
        masterDataMenu.setEnabled(aktif);
        transaksiMenu.setEnabled(aktif);
        laporanMenu.setEnabled(aktif);
    }

    private void setUkuranLokasiFrame(double skala, boolean tengah) {
        Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
        setSize((int) (skala * dimensi.getWidth()), (int) (skala * dimensi.getHeight()));

        if(tengah) {
            setLocation((int) (dimensi.getWidth() - getWidth()) / 2, (int) ((dimensi.getHeight() - getHeight()) / 2));
        }
    }

    private void keluarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarMenuItemActionPerformed
        // TODO add your handling code here:
        System.exit(0); 
    }//GEN-LAST:event_keluarMenuItemActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void karyawanMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karyawanMenuItemActionPerformed
        // TODO add your handling code here:
            // Buat instance FormKaryawan
        FormKaryawan formKaryawan = new FormKaryawan();

        // Tambahkan ke mdiDesktopPane
        mdiDesktopPane.add(formKaryawan);

        // Tampilkan FormKaryawan
        formKaryawan.setVisible(true);
    }//GEN-LAST:event_karyawanMenuItemActionPerformed

    
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
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aksesMenuItem;
    private javax.swing.JMenu aplikasiMenu;
    private javax.swing.JMenuItem deskripsiMenuItem;
    private javax.swing.JMenuItem gajiLaporanMenuItem;
    private javax.swing.JMenuItem gajiMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem karyawanLaporanMenuItem;
    private javax.swing.JMenuItem karyawanMenuItem;
    private javax.swing.JMenuItem keluarMenuItem;
    private javax.swing.JMenu laporanMenu;
    private javax.swing.JMenu masterDataMenu;
    private javax.swing.JDesktopPane mdiDesktopPane;
    private javax.swing.JMenuItem pekerjaanLaporanMenuItem;
    private javax.swing.JMenuItem pekerjaanMenuItem;
    private javax.swing.JMenu transaksiMenu;
    // End of variables declaration//GEN-END:variables
}
