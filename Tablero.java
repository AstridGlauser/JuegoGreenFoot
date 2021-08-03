import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.awt.Font.*;
import java.awt.Color.*;


/**
 * 
 */

public class Tablero extends Actor
{
GreenfootImage imagen;
int cont;
String mensaje;
    /**
     * Act - do whatever the Tablero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tablero(int c,String msj){
        cont=c;
        mensaje=msj;
        imagen=new GreenfootImage(250,150);
        imagen.setColor(new Color(100,90,100,200));
        imagen.setFont(new Font("Verdana",24));
        dibuja();
    }
    public void dibuja(){
        imagen.clear();
        imagen.drawString(mensaje+cont,20,20);
        setImage(imagen);

    }
    public void incrementar(){
        cont++;
        dibuja();
    }
    public void decrementar(){
        cont--;
        dibuja();
        
    }
    public int obtenerValor(){
        return cont;
    }
    public void act()
    {
    }
}

