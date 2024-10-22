import java.util.ArrayList;
import java.util.Random;


public class Circulo {
    private double radio;
    private String color;
    private int posX;
    private int posY;
    private double area;

    public Circulo(double radio, String color, int posX, int posY){
        this.radio = radio;
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String colorNuevo){
        this.color = colorNuevo;
    }

    public int getPosX(){
        return posX;
    }

    public void setPosX(int xNueva){
        this.posX = xNueva;
    }

    public int getPosY(){
        return posY;
    }

    public void setPosY(int yNueva){
        this.posY = yNueva;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(int radioNuevo){
        this.radio = radioNuevo;
    }

    public double getArea(){
        area = 3.1416 * (radio * radio);
        return area;
    }

    @Override
    public String toString(){
        return "Radio: " + radio + " Color: " + color + " X,Y:" + posX + "," + posY + " Area: " + getArea();
    }
}
