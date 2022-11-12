/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modun;

/**
 *
 * @author LAM
 */
public class banyanFlower extends Flower{
    private double subFlowerNum;

    public banyanFlower() {
    }

    public banyanFlower(double subFlowerNum) {
        this.subFlowerNum = subFlowerNum;
    }

    public banyanFlower(double subFlowerNum, String Name, String Code, String Type, double Amount, String Color) {
        super(Name, Code, Type, Amount, Color);
        this.subFlowerNum = subFlowerNum;
    }

    public double getSubFlowerNum() {
        return subFlowerNum;
    }

    public void setSubFlowerNum(double subFlowerNum) {
        this.subFlowerNum = subFlowerNum;
    }
    
}
