package com.company;

public class Main {

    public static void main(String[] args) {

        Nave defaultNave = new Nave();

        defaultNave.x = 350;
        defaultNave.y = 525;
        defaultNave.w = 15;
        defaultNave.h = 15;


        defaultNave.pintar();

        Vida live1 = new Vida();

        live1.x = 600;
        live1.y = 10;
        live1.w = 15;
        live1.h = 15;

        live1.pintar();

        Vida live2 = new Vida();

        live2.x = 650;
        live2.y = 10;
        live2.w = 15;
        live2.h = 15;

        live2.pintar();

        Vida live3 = new Vida();

        live3.x = 700;
        live3.y = 10;
        live3.w = 15;
        live3.h = 15;

        live3.pintar();
    }
}
