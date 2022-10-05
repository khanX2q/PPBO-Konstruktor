/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3.Ketiga;

/**
 *
 * @author hp
 */
public class DarkMagic extends Wizard{
    public String darkAttribute;
    
    public String profileDM(){
        String ps;
        ps = "Nama Wizard           : "+namaWizard+"\n"+
                "Mana Wizard        : "+manaWizard+"\n"+
                "Attribute Wizard   : "+darkAttribute+"\n";
        return ps;
    }
}
