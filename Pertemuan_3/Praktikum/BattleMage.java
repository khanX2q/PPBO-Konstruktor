/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3.Praktikum;

/**
 *
 * @author hp
 */
public class BattleMage extends Wizard{
    private int battlePoint;
    
    public void setBattlePoint(int battlePoint){
        this.battlePoint = battlePoint;
    }
    public int getBattlePoint(){
        return battlePoint;
    }

    /**
     *
     * @return
     */
    public double damageBM(){
        double damageBM;
        damageBM = (basicAttack * battlePoint)+ mana;
        return damageBM;
    }
}
