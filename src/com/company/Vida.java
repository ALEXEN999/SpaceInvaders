package com.company;

public class Vida {
    int x, y;
    int w, h;

    void pintar (){
        Canvas.fillRect(x+w,y,w,h);
        Canvas.fillRect(x,y+h,w,h);
        Canvas.fillRect(x+w,y+h,w,h);
        Canvas.fillRect(x+w*2,y+h,w,h);
        Canvas.fillRect(x+w,y+h*2,w,h);

    }
}
