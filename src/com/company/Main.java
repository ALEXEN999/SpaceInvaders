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

        Defensa barrera1 = new Defensa();

        barrera1.x = 150;
        barrera1.y = 450;
        barrera1.w = 25;
        barrera1.h = 25;

        barrera1.pintar();

        Defensa barrera2 = new Defensa();

        barrera2.x = 250;
        barrera2.y = 450;
        barrera2.w = 25;
        barrera2.h = 25;

        barrera2.pintar();

        Defensa barrera3 = new Defensa();

        barrera3.x = 350;
        barrera3.y = 450;
        barrera3.w = 25;
        barrera3.h = 25;

        barrera3.pintar();

        Defensa barrera4 = new Defensa();

        barrera4.x = 450;
        barrera4.y = 450;
        barrera4.w = 25;
        barrera4.h = 25;

        barrera4.pintar();

        Defensa barrera5 = new Defensa();

        barrera5.x = 550;
        barrera5.y = 450;
        barrera5.w = 25;
        barrera5.h = 25;

        barrera5.pintar();

        marciano2 marci1 = new marciano2();

        marci1.x = 150;
        marci1.y = 150;
        marci1.w = 10;
        marci1.h = 10;

        marci1.pintar();

        marciano2 marci2 = new marciano2();

        marci2.x = 250;
        marci2.y = 150;
        marci2.w = 10;
        marci2.h = 10;

        marci2.pintar();

        marciano2 marci3 = new marciano2();

        marci3.x = 350;
        marci3.y = 150;
        marci3.w = 10;
        marci3.h = 10;

        marci3.pintar();

        marciano2 marci4 = new marciano2();

        marci4.x = 450;
        marci4.y = 150;
        marci4.w = 10;
        marci4.h = 10;

        marci4.pintar();

        marciano2 marci5 = new marciano2();

        marci5.x = 550;
        marci5.y = 150;
        marci5.w = 10;
        marci5.h = 10;

        marci5.pintar();
    }
}
