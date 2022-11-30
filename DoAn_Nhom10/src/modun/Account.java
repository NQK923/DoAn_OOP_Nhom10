/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modun;

/**
 *
 * @author pc
 */
public class Account {

    private String userName, gmail, passWord;

    public Account() {
    }

    public Account(String tenTK, String soDT, String matKhau) {
        this.userName = tenTK;
        this.gmail = soDT;
        this.passWord = matKhau;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String tenTK) {
        this.userName = tenTK;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String soDT) {
        this.gmail = soDT;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String matKhau) {
        this.passWord = matKhau;
    }

}
