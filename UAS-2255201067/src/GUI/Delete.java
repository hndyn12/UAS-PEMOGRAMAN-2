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
public class Delete {
    Koneksi konek = new Koneksi();
   

    public void delete(String NIK ) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql = "delete from identitaspendonor where NIK ='" + NIK + "'";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }  
}
