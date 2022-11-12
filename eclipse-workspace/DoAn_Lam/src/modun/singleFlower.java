/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modun;

/**
 *
 * @author LAM
 */
public class singleFlower extends Flower{
    private double petalsFlowerNum;
    
    public singleFlower(double petalsFlowerNum) {
        this.petalsFlowerNum = petalsFlowerNum;
    }

    public singleFlower(double petalsFlowerNum, String Name, String Code, String Type, double Amount, String Color) {
        super(Name, Code, Type, Amount, Color);
        this.petalsFlowerNum = petalsFlowerNum;
    }

    public double getPetalsFlowerNum() {
        return petalsFlowerNum;
    }

    public void setPetalsFlowerNum(double petalsFlowerNum) {
        this.petalsFlowerNum = petalsFlowerNum;
    }

    public void setAmount(String amount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
