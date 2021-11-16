// FractalDrawer class draws a fractal of a shape indicated by user input
//Written by Moyata Ebisso, ebiss001 and Tuujii Burka, burka058
import java.lang.Math.*;
import java.awt.Color;
import java.util.Scanner;
public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area
    private int count;
    private int count2;
    public FractalDrawer() {
        count2=0;}

    public double drawFractal(String type) {
        Canvas drawing = new Canvas(800,800);
        if(type.equals("circle")){
            count+=1;
            drawCircleFractal(150,350,350,Color.BLUE,drawing,1);
            return 1.0;
        }
        else if(type.equals("triangle")){
            count+=1;
            drawTriangleFractal(200,250,300,600,Color.BLACK,drawing,1);
            return 1.0;
        }
        else if(type.equals("rectangle")){
            count+=1;
            drawRectangleFractal(250,150,350,350,Color.BLUE,drawing,1);
            return 1.0;
        }
        else{
            return 2.0;
        }
    }

    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        Color [] gre = new Color [5];
        gre[0]=Color.BLACK;
        gre[1]=Color.BLUE;
        gre[2]=Color.CYAN;
        gre[3]=Color.GREEN;
        gre[4]=Color.PINK;
        int ran = (int)(Math.random() *5);
        if(level==7){
            count2++;
            if(count2==1){
                System.out.println("The total area is: " + totalArea);
            }

        }
    else{
                Triangle moa = new Triangle(x, y, width, height);
                moa.setColor(c);
                can.drawShape(moa);
                level += 1;
                totalArea += (width * height * 0.5);
                drawTriangleFractal(width / 2, height / 2, x + (width / 4), y - (height), gre[ran], can, level);
                drawTriangleFractal(width / 2, height / 2, x + width, y, gre[ran], can, level);
                drawTriangleFractal(width / 2, height / 2, x - (width / 2), y, gre[ran], can, level);

    }
    }

    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        Color [] gre = new Color [5];
        gre[0]=Color.BLACK;
        gre[1]=Color.BLUE;
        gre[2]=Color.CYAN;
        gre[3]=Color.GREEN;
        gre[4]=Color.PINK;
        int ran = (int)(Math.random() *5);
        if(level==7){
            count2++;
            if(count2==1){
                System.out.println("The total area is: " + totalArea);
            }

        }
        else{
            Circle kena = new Circle(x,y,radius);
            kena.setColor(c);
            can.drawShape(kena);
            level+=1;
            totalArea += (Math.PI * radius * radius);
            drawCircleFractal(radius/2,x-radius,y+radius,gre[ran],can,level);
            drawCircleFractal(radius/2,x-radius,y-radius,gre[ran],can,level);
            drawCircleFractal(radius/2,x+radius,y+radius,gre[ran],can,level);
            drawCircleFractal(radius/2,x+radius,y-radius,gre[ran],can,level);
        }
    }

    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        Color [] gre = new Color [8];
        gre[0]=Color.BLACK;
        gre[1]=Color.BLUE;
        gre[2]=Color.CYAN;
        gre[3]=Color.GREEN;
        gre[4]=Color.PINK;
        gre[5]=Color.ORANGE;
        gre[6]=Color.RED;
        gre[7]=Color.YELLOW;
        int ran = (int)(Math.random() *7);
        if(level==7){
            count2++;
            if(count2==1){
                System.out.println("The total area is: " + totalArea);
            }

        }
        else{
            Rectangle lillu = new Rectangle(x,y,width,height);
            lillu.setColor(c);
            can.drawShape(lillu);
            level+=1;
            totalArea+=(height*width);
            drawRectangleFractal(width/2,height/2,x+(width),y+(height/2),gre[ran],can,level);
            drawRectangleFractal(width/2,height/2,x-(width/2),y-(height),gre[ran],can,level);
            drawRectangleFractal(width/2,height/2,x-(width/2),y+(height/2),gre[ran],can,level);
            drawRectangleFractal(width/2,height/2,x+(width),y-(height),gre[ran],can,level);
        }
    }

    public static void main(String[] args){
        System.out.println("Pick a shape- circle, rectangle, triangle: ");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        FractalDrawer d = new FractalDrawer();
        d.drawFractal(input);

    }
}
