/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author X1
 */
public class Insert {

    Koneksi konek = new Koneksi();
   

    public void insert(String NIK, String Nama, String JenisKelamin, String TanggalLahir, String Alamat,String NomorHP, String WilayahDonor ) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
         //   String sql = "insert into identitas (nim, nama, alamat, jeniskelamin)" + "values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
              String sql = "insert into identitaspendonor"+" values('" + NIK + "','" + Nama + "','" + JenisKelamin + "','" + TanggalLahir + "','" + Alamat + "','" + NomorHP + "','" + WilayahDonor + "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }  
}
