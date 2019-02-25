package com.company;

import javax.swing.*;
import java.awt.*;

public class Nave {

    //Variables
    boolean vida;
    int color;
    int x, y;
    int size;
    int movimiento;
    Image image;
    //Metodos

    void pintar (){
        ImageIcon imageIcon = new ImageIcon("src/com.company/image.png");
        image = imageIcon.getImage();
    }
}
