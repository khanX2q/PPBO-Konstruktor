/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3.Praktikum;

/**
 *
 * @author hp
 */
public class Necromancer extends Wizard{
    private int summoner;
    
    public void setSummoner(int summoner){
        this.summoner = summoner;
    }
    public int getSummoner(){
        return summoner;
    }
    public double damageNC(){
        double damageNC = (basicAttack + mana)/summoner;
        return damageNC;
    }
}
