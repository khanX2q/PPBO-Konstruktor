/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3.Praktikum;

/**
 *
 * @author hp
 */
public class Sniper extends Ranger{
    private double critical;
    
    public double getCritical(){
        return critical;
    }
    public void setCritical(double critical){
        this.critical = critical;
    }
    public double damageSP(){
        double damageSP = basicAttack*vision*critical;
        return damageSP;
    }
}
