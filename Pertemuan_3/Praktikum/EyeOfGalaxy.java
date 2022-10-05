/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3.Praktikum;

/**
 *
 * @author hp
 */
public class EyeOfGalaxy extends Ranger{
    private int multiTarget;
    
    public int getMultiTarget(){
        return multiTarget;
    }
    public void setMultiTarget(int multiTarget){
        this.multiTarget = multiTarget;
    }
    public double damageEOG(){
        double damageEOG;
        damageEOG = basicAttack*vision*multiTarget;
        return damageEOG;
    }
}
