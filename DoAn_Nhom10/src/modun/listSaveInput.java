/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modun;

/**
 *
 * @author LAM
 */
public class listSaveInput {
    private String Name, Code, Type, Color, Time;
    private double Amount, petalsFlowerNum, subFlowerNum;
    
    public listSaveInput(String Code, String Name, String Type, String Color, double Amount, double subFlowerNum, double petalsFlowerNum, String Time) {
        this.Name = Name;
        this.Code = Code;
        this.Type = Type;
        this.Color = Color;
        this.Amount = Amount;
        this.petalsFlowerNum = petalsFlowerNum;
        this.subFlowerNum = subFlowerNum;
        this.Time = Time;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public double getpetalsFlowerNum() {
        return petalsFlowerNum;
    }

    public void setpetalsFlowerNum(double petalsFlowerNum) {
        this.petalsFlowerNum = petalsFlowerNum;
    }

    public double getsubFlowerNum() {
        return subFlowerNum;
    }

    public void setsubFlowerNum(double subFlowerNum) {
        this.subFlowerNum = subFlowerNum;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    
    
}
