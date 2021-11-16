//Written by Moyata Ebisso, ebiss001 and Tuujii Burka, burka058
import java.lang.Math.*;
import java.awt.Color.*;
import java.awt.*;
public class Triangle {
    private double xpos;
    private double ypos;
    private double width;
    private double height;
    private Color col2;
    public Triangle(double xpos1, double ypos1, double w, double h){
        xpos = xpos1;
        ypos = ypos1;
        width = w;
        height = h;
    }
    public double calculateArea(){
        double area = width * height * 0.5;
        return area;
    }
    public void setPos(double x, double y){
        xpos = x;
        ypos = y;
    }
    public void setColor(Color c){
        col2 = c;
    }
    public void setHeight(double h){
        height = h;
    }
    public void setWidth(double w){
        width = w;
    }
    public Color getColor(){
        return col2;
    }
    public double getXPos(){
        return xpos;
    }
    public double getYPos(){
        return ypos;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
}
