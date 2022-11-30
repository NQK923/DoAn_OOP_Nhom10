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
import modun.Account;
import modun.listFlower;

/**
 *
 * @author LAM
 */
public class ConnectToXampp {

    public static List<listFlower> findAll() {
        List<listFlower> listF = new ArrayList<>();
        Connection conn = null;
        Statement statement = null;
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conncect to success!!");
            String sql = "select *from flower";
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                listFlower e = new listFlower(rs.getString("Code"), rs.getString("Name"), rs.getString("Type"), rs.getString("Color"), rs.getInt("Amount"), rs.getInt("subFlowerNum"), rs.getInt("petalsFlowerNum"), rs.getString("Time"));
                listF.add(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
        return listF;
    }

    public static void delete(String Code) {
        Connection conn = null;
        PreparedStatement statement = null;
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            String sql = "delete from flower where Code = ?";
            statement = conn.prepareCall(sql);
            statement.setString(1, Code);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Error");
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
    }

    public static void update(listFlower flower) {
        Connection conn = null;
        PreparedStatement statement = null;
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println(flower.getCode() + flower.getName() + flower.getType() + flower.getColor() + flower.getAmount() + flower.getsubFlowerNum() + flower.getpetalsFlowerNum() + flower.getTime());
            String sql = "update flower set Name=?, Type=?, Color=?, Amount=?, SubFlowerNum=?, PetalsFlowerNum=?, Time=?  where Code=?";
            System.out.println("Conncect to success up!!");
            statement = conn.prepareStatement(sql);
            statement.setString(1, flower.getName());
            statement.setString(2, flower.getType());
            statement.setString(3, flower.getColor());
            statement.setInt(4, (int) flower.getAmount());
            statement.setInt(5, (int) flower.getsubFlowerNum());
            statement.setInt(6, (int) flower.getpetalsFlowerNum());
            statement.setString(7, flower.getTime());
            statement.setString(8, flower.getCode());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
    }

    public static void insert(listFlower flower) {
        Connection conn = null;
        PreparedStatement statement = null;
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            String sql = "insert into flower(Code, Name, Type, Color, Amount, SubFlowerNum, PetalsFlowerNum, Time) values(?, ?, ?, ?, ?, ?, ?, ?)";
            statement = conn.prepareCall(sql);
            statement = conn.prepareStatement(sql);
            statement.setString(1, flower.getCode());
            statement.setString(2, flower.getName());
            statement.setString(3, flower.getType());
            statement.setString(4, flower.getColor());
            statement.setInt(5, (int) flower.getAmount());
            statement.setInt(6, (int) flower.getsubFlowerNum());
            statement.setInt(7, (int) flower.getpetalsFlowerNum());
            statement.setString(8, flower.getTime());
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
    }

    public static List<Account> findAllAccount() {
        List<Account> listAccount = new ArrayList<>();
        Connection conn = null;
        Statement statement = null;
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conncect to success!!");
            String sql = "select *from accountuser";
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Account e = new Account(rs.getString("userName"), rs.getString("Gmail"), rs.getString("passWord"));
                listAccount.add(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
        return listAccount;
    }

    public static void deleteAccount(String userName) {
        Connection conn = null;
        PreparedStatement statement = null;
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            String sql = "delete from accountuser where Code = ?";
            statement = conn.prepareCall(sql);
            statement.setString(1, userName);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Error");
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
    }

    public static void insertAccount(Account account) {
        Connection conn = null;
        PreparedStatement statement = null;
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            String sql = "insert into accountuser(userName, Gmail, passWord) values(?, ?, ?)";
            statement = conn.prepareCall(sql);
            statement = conn.prepareStatement(sql);
            statement.setString(1, account.getUserName());
            statement.setString(2, account.getGmail());
            statement.setString(3, account.getPassWord());
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
    }
}
