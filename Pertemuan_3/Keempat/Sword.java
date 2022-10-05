/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3.Keempat;

/**
 *
 * @author hp
 */
public class Sword {
    private String idSword;
    private String namaSword;
    private String gradeSword;
    private double basicDamage;
    
    public void setIdSword(String idSword){
        this.idSword = idSword;
    }
    public String getIdSword(){
        return idSword;
    }
    public void setNamaSword(String namaSword){
        this.namaSword = namaSword;
    }
    public String getNamaSword(){
        return namaSword;
    }
    public void setGradeSword(String gradeSword){
        this.gradeSword = gradeSword;
    }
    public String getGradeSword(){
        return gradeSword;
    }
    public void setBasicDamage(double basicDamage){
        this.basicDamage = basicDamage;
    }
    public double getBasicDamage(){
        return basicDamage;
    }
}
