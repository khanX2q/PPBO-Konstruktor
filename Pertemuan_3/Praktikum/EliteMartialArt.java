/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3.Praktikum;

/**
 *
 * @author hp
 */
public class EliteMartialArt extends Fighter{
    private double radiance;
    
    public double getRadiance(){
        return radiance;
    }
    public void setRadiance(double radiance){
        this.radiance = radiance;
    }
    public double damageEMA(){
        double damageEMA;
        damageEMA = basicAttack*aura*radiance;
        return damageEMA;
    }
}
