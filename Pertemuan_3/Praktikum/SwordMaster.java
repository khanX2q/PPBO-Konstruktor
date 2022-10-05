/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3.Praktikum;

/**
 *
 * @author hp
 */
public class SwordMaster extends Fighter{
    private double evasion;
    
    public double getEvasion(){
        return evasion;
    }
    public void setEvasion(double evasion){
        this.evasion = evasion;
    }
    public double damageSM(){
        double damageSM;
        damageSM = basicAttack*aura*evasion;
        return damageSM;
    }
}
