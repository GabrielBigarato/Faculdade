
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cjjdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/banco","root","usbw");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM USUARIOS");
            String sql = "SELECT * FROM USUARIOS";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
        }catch(Exception e){
            System.out.println("Conexão Inválida");
            e.printStackTrace();
        }
        
    }
    
}
