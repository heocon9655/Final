/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.awt.Color;
import java.awt.Point;

/**
 * This class contains information of Line
 *
 * @author Hung
 */
public class Line {

    int x1, x2, y1, y2; //point 1, point 2
    Color color ; //color of line
    public Line(int x1, int y1, int x2, int y2, Color colour) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.color = colour;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public Color getColor() {
        return color;
    }

    public void setColour(Color colour) {
        this.color = colour;
    }
    
    public Point getP1() {
        Point p = new Point(x1, y1);
        return p;
    }
    
    public Point getP2() {
        Point p = new Point(x2, y2);
        return p;
    }
}
