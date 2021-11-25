package com.company;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        Boss Gitler=new Boss();
        Gitler.setDamage( 67);
        Gitler.setHealth( 1300);
        Gitler.weapon.setBot("USP");
        System.out.println( " Здоровье Босса" + Gitler.health + " Урон босса" + Gitler.damage + " Имя оружия " + Gitler.weapon.getbot()); 

    }
}
