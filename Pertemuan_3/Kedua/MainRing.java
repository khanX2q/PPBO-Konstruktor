/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3.Kedua;

/**
 *
 * @author hp
 */
public class MainRing {
    public static void main(String[] args) {
        Ring ring = new Ring();
        ring.idRing = "R01";
        ring.namaRing = "Ring of Basilius";
        ring.gradeRing = "Magic";
        ring.effekRing = "Corrosion";
        ring.atributRing = "Dark";
        
        System.out.println("Id Ring     :"+ring.idRing);
        System.out.println("Nama Ring   :"+ring.namaRing);
        System.out.println("Grade Ring  :"+ring.gradeRing);
        System.out.println("Effek Ring  :"+ring.effekRing);
        System.out.println("Atribut Ring:"+ring.atributRing);
    }
}
