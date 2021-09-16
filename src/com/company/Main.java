package com.company;

public class Main {

    public static void main(String[] args) {

        warrior warrior = new warrior(200, 70, "St");
        Magic magic = new Magic(250, 100, "hj");
        Medic medic = new Medic(300, 50, "f");
        Hero[] superHero = {warrior, magic, medic};
        for (int i = 0; i < superHero.length; i++) {
            superHero[i].applySuperAbility("HJf");

        }
    }
}