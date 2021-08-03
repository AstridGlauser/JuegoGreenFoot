import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.util.*;

/**
 * 
 */
public class jardin extends World
{

    /**
     * Constructor for objects of class espacio.
     */
    public lifes objLife;
    Tablero puntos;
    Tablero vidas;
    Tablero extra;
 
    public jardin()
    {
        super(600, 400, 1);
        setPaintOrder(GameOver.class,Tablero.class, abeja.class,mariposa.class);
        mariposa mariposa1 =new mariposa();
        addObject(mariposa1,50,300);
        crearPajaros(5);
        objLife=new lifes();
        puntos=new Tablero(0,"Puntos:");
        vidas=new Tablero(3,"Vidas:");
        extra=new Tablero(0,"Flores:");
        addObject(puntos,150,85);
        addObject(vidas,300,85);
        addObject(extra,420,85);
    
        
    }
    public void crearPajaros(int numero){
         for (int i=0; i <=numero ;i++){
            abeja abeja1=new abeja();
            int x =Greenfoot.getRandomNumber(getWidth());
            int y =Greenfoot.getRandomNumber(getHeight());
            addObject(abeja1,x,y);
           

        }
    }
       
                
            
        
             public void crearEnergia(int numero){
            for(int i =0;i<numero;i++){
                energia e =new energia();
                int x=Greenfoot.getRandomNumber(getWidth());
                int y=Greenfoot.getRandomNumber(getHeight());
                int ener=Greenfoot.getRandomNumber(5);
                if (ener==3){
                    addObject(e,x,y);
                }
        }
        
            
        }
      
    }
