package pl.imiajd.Kochanski;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle{

    public BetterRectangle(int w, int h){
        //setLocation(0, 0);        // zadanie 6
        //setSize(w, h);            // zadanie 6
        super(w, h);                // zadanie 7
    }

    public double getArea(){
        return getWidth() * getHeight();
    }

    public double getPerimeter(){
        return (getWidth() + getHeight()) * 2;
    }
}
