/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author X1
 */
public class Ubah {
    Koneksi konek = new Koneksi();

    public void Ubah(String NIK, String Nama, String JenisKelamin, String TanggalLahir, String Alamat,String NomorHP, String WilayahDonor) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql_Nama = "update identitaspendonor set Nama='"+ Nama + "'where NIK ='" + NIK + "'";
            String sql_JenisKelamin = "update identitaspendonor set JenisKelamin='"+ JenisKelamin + "'where NIK ='" + NIK + "'";
            String sql_TanggalLahir = "update identitaspendonor set TanggalLahir='"+ TanggalLahir + "'where NIK ='" + NIK + "'";
            String sql_Alamat = "update identitaspendonor set Alamat='"+ Alamat + "'where NIK ='" + NIK + "'";
            String sql_NomorHP = "update identitaspendonor set NomorHP='"+ NomorHP + "'where NIK ='" + NIK + "'";
            String sql_WilayahDonor = "update identitaspendonor set WilayahDonor    ='"+ WilayahDonor + "'where NIK ='" + NIK + "'";
            
            statement.executeUpdate(sql_Nama);
            statement.executeUpdate(sql_JenisKelamin);
            statement.executeUpdate(sql_TanggalLahir);
            statement.executeUpdate(sql_Alamat);
            statement.executeUpdate(sql_NomorHP);
            statement.executeUpdate(sql_WilayahDonor);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }  
}
