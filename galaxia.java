import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.util.*;

/**
 * 
 */
public class galaxia extends World
{

    /**
     * Constructor for objects of class espacio.
     */
    public lifes objLife;
    Tablero puntos;
    Tablero vidas;
    Tablero extra;
 
    public galaxia()
    {
        super(600, 400, 1);
        setPaintOrder(GameOver.class,Tablero.class, nave.class,roca.class);
        nave nave1 =new nave();
        addObject(nave1,50,300);
        crearRocas(5);
        objLife=new lifes();
        puntos=new Tablero(0,"Puntos:");
        vidas=new Tablero(3,"Vidas:");
        extra=new Tablero(0,"Especial:");
        addObject(puntos,150,85);
        addObject(vidas,300,85);
        addObject(extra,420,85);
    
        
    }
    public void crearRocas(int numero){
         for (int i=0; i <=numero ;i++){
            roca roca1=new roca();
            int x =Greenfoot.getRandomNumber(getWidth());
            int y =Greenfoot.getRandomNumber(getHeight());
            addObject(roca1,x,y);
           

        }
    }
       
                
            
        
             public void crearEnergia(int numero){
            for(int i =0;i<numero;i++){
                energia2 e =new energia2();
                int x=Greenfoot.getRandomNumber(getWidth());
                int y=Greenfoot.getRandomNumber(getHeight());
                int ener=Greenfoot.getRandomNumber(5);
                if (ener==3){
                    addObject(e,x,y);
                }
        }
    }
        
       
    }
    
        
            
        
      
    
