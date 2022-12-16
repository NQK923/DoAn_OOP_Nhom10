/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modun;

/**
 *
 * @author LAM
 */
public class listError {

    private String Name, Code, Type, Color;
    private int Amount, petalsFlowerNum, subFlowerNum;

    public listError(String Name, String Code, String Type, String Color, int Amount, int petalsFlowerNum, int subFlowerNum) {
        this.Name = Name;
        this.Code = Code;
        this.Type = Type;
        this.Color = Color;
        this.Amount = Amount;
        this.petalsFlowerNum = petalsFlowerNum;
        this.subFlowerNum = subFlowerNum;
    }

    public int getPetalsFlowerNum() {
        return petalsFlowerNum;
    }

    public int getSubFlowerNum() {
        return subFlowerNum;
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

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public int getpetalsFlowerNum() {
        return petalsFlowerNum;
    }

    public void setpetalsFlowerNum(int petalsFlowerNum) {
        this.petalsFlowerNum = petalsFlowerNum;
    }

    public int getsubFlowerNum() {
        return subFlowerNum;
    }

    public void setsubFlowerNum(int subFlowerNum) {
        this.subFlowerNum = subFlowerNum;
    }
}
