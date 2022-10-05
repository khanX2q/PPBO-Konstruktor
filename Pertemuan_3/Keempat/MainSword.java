/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3.Keempat;

/**
 *
 * @author hp
 */
public class MainSword {
    public static void main(String[] args) {
        Sword pedang = new Sword();
        pedang.setIdSword("S01");
        pedang.setNamaSword("Excalibur");
        pedang.setGradeSword("Legendary");
        pedang.setBasicDamage(1898.223);
        
        System.out.println("========================");
        System.out.println("Nama Pedang     : "+pedang.getNamaSword());
        System.out.println("Garde Pedang    : "+pedang.getGradeSword());
        System.out.println("Basic Damage    : "+pedang.getBasicDamage());
    }
}
