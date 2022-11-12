/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectDatabase;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modun.listSaveInput;
/**
 *
 * @author LAM
 */
public class ConnectToXampp {
    public static List<listSaveInput>findAll(){
        List<listSaveInput> listF = new ArrayList<>();
        Connection conn;
        Statement stm;
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try{
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conncect to success!!");
            String sql = "select *from flower";
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                listSaveInput e = new listSaveInput(rs.getString("Code"), rs.getString("Name"), rs.getString("Type"), rs.getString("Color"), rs.getInt("Amount"), rs.getInt("subFlowerNum"), rs.getInt("petalsFlowerNum"), rs.getString("Time"));
                listF.add(e);
            }
        } catch (SQLException e) {
            System.out.println("Error");
        }
        return listF;
    }
}
