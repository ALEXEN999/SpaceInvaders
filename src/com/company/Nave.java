package com.company;

import javax.swing.*;
import java.awt.*;

public class Nave {

    //Variables
    int x, y;
    int w, h;

    //Metodos

    void pintar (){
            Canvas.fillRect(x+w*2,y,w,h);
            Canvas.fillRect(x,y+h*2,w,h);
            Canvas.fillRect(x+w*2,y+h*2,w,h);
            Canvas.fillRect(x+w*4,y+h*2,w,h);


    }
}
