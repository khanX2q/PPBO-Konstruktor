/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3.Praktikum;

/**
 *
 * @author hp
 */
public class Cleric extends Professions{
    private double pointBlessing;
    private int follower;
    
    public double getpointBlessing(){
        return pointBlessing;
    }
    public void setpointBlessing(double pointBlessing){
        this.pointBlessing = pointBlessing;
    }
    public int getFollower(){
        return follower;
    }
    public void setFollower(int follower){
        this.follower = follower;
    }
    public double healing(){
        double healing = (basicAttack+pointBlessing)*follower;
        return healing;
    }
}
