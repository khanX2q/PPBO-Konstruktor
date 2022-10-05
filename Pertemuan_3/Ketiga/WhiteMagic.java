/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3.Ketiga;

/**
 *
 * @author hp
 */
public class WhiteMagic extends Wizard{
    public String whiteAttribute;
    
    public String profileWM(){
        String ps;
        ps = "Nama Wizard           : "+namaWizard+"\n"+
                "Mana Wizard        : "+manaWizard+"\n"+
                "Attribute Wizard   : "+whiteAttribute+"\n";
        return ps;
    }
}
