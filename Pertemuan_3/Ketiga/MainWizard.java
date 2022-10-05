/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3.Ketiga;

/**
 *
 * @author hp
 */
public class MainWizard {
    public static void main(String[] args){
        DarkMagic darkMagic = new DarkMagic();
        darkMagic.namaWizard = "Hell Zinger";
        darkMagic.manaWizard = 4000;
        
        darkMagic.darkAttribute = "Dark Elemental";
        
        WhiteMagic whiteMagic = new WhiteMagic();
        whiteMagic.namaWizard = "Gandhahalf";
        whiteMagic.manaWizard = 3000;
        whiteMagic.whiteAttribute = "Sun of Holyland";
        
        System.out.println("====== Dark Magician ======");
        System.out.println(darkMagic.profileDM());
        System.out.println("====== White Magician ======");
        System.out.println(whiteMagic.profileWM());
    }
}
