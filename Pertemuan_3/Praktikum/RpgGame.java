/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3.Praktikum;

/**
 *
 * @author hp
 */
public class RpgGame {
    public static void main(String[] args) {
        //BattleMage
        BattleMage bm = new BattleMage();
        bm.namaProfession = "Battle Mage";
        bm.mana = 400.5;
        bm.basicAttack = 42.3;
        bm.setBattlePoint(4);
        
        System.out.println("====================================");
        System.out.println("Nama Class : "+bm.namaProfession);
        System.out.println("Mana : "+bm.mana);
        System.out.println("Basic Attack : "+bm.basicAttack);
        System.out.println("Battle Point : "+bm.getBattlePoint());
        System.out.println("Total Damage : "+bm.damageBM());
        System.out.println("====================================");
        
        //Necromancer
        Necromancer nc = new Necromancer();
        nc.namaProfession = "Necromancer";
        nc.mana = 600.23;
        nc.basicAttack = 25;
        nc.setSummoner(4);
        
        System.out.println("====================================");
        System.out.println("Nama Class : "+nc.namaProfession);
        System.out.println("Mana : "+nc.mana);
        System.out.println("Basic Attack : "+nc.basicAttack);
        System.out.println("Skeleton : "+nc.getSummoner());
        System.out.println("Skeleton Damage : "+nc.damageNC());
        System.out.println("====================================");
        
        
        //SwordMAster
        SwordMaster sm = new SwordMaster();
        sm.namaProfession = "SwordMaster";
        sm.aura = 10.5;
        sm.basicAttack = 55;
        sm.setEvasion(14.2);
        
        System.out.println("====================================");
        System.out.println("Nama Class : "+sm.namaProfession);
        System.out.println("Aura : "+sm.aura);
        System.out.println("Basic Attack : "+sm.basicAttack);
        System.out.println("Evasion : "+sm.getEvasion());
        System.out.println("Sword Damage : "+sm.damageSM());
        System.out.println("====================================");
        
        
        //Elite Martial Art
        EliteMartialArt ema = new EliteMartialArt();
        ema.namaProfession = "EliteMartialArt";
        ema.aura = 17.5;
        ema.basicAttack = 52;
        ema.setRadiance(12.2);
        
        System.out.println("====================================");
        System.out.println("Nama Class : "+ema.namaProfession);
        System.out.println("Aura : "+ema.aura);
        System.out.println("Basic Attack : "+ema.basicAttack);
        System.out.println("Radiance : "+ema.getRadiance());
        System.out.println("Punch : "+ema.damageEMA());
        System.out.println("====================================");
        
        
        //Healer
        Cleric c = new Cleric();
        c.namaProfession = "Healer";
        c.basicAttack = 8.2;
        c.setFollower(12);
        c.setpointBlessing(407.4);
        
        System.out.println("====================================");
        System.out.println("Nama Class : "+c.namaProfession);
        System.out.println("Basic Attack : "+c.basicAttack);
        System.out.println("Follower : "+c.getFollower());
        System.out.println("Blessing : "+c.getpointBlessing());
        System.out.println("Healing :"+c.healing());
        System.out.println("====================================");
        
        
        
        //Eye Of Galaxy
        EyeOfGalaxy eog = new EyeOfGalaxy();
        eog.namaProfession = "EyeOfGalaxy";
        eog.basicAttack = 44.5;
        eog.setMultiTarget(12);
        eog.vision = 9;
        
        System.out.println("====================================");
        System.out.println("Nama Class : "+eog.namaProfession);
        System.out.println("Basic Attack : "+eog.basicAttack);
        System.out.println("Vision : "+eog.vision);
        System.out.println("Multi Target : "+eog.getMultiTarget());
        System.out.println("Total Damage :"+eog.damageEOG());
        System.out.println("====================================");
        
        
        
        //Sniper
        Sniper sp = new Sniper();
        sp.namaProfession = "Sniper";
        sp.basicAttack = 49;
        sp.setCritical(11);
        sp.vision = 21;
        
        System.out.println("====================================");
        System.out.println("Nama Class : "+sp.namaProfession);
        System.out.println("Basic Attack : "+sp.basicAttack);
        System.out.println("Vision : "+sp.vision);
        System.out.println("Critical : "+sp.getCritical());
        System.out.println("Total Damage :"+sp.damageSP());
        System.out.println("====================================");
    }
}
