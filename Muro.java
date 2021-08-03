import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro extends World
{
    Flecha flecha=new Flecha();
    private int opcion=0;
    texto hola=new texto("Bienvenido al juego, debes elegir un nivel");
   // GreenfootSound myMusic=new GreenfootSound("primero.wav");
    /**
     * Constructor for objects of class Muro.
     * 
     */
    public Muro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 750, 1); 
     // myMusic.playLoop();
        addObject(hola,500,200);
        Greenfoot.playSound("primero.wav");
        prepararMundo();
    }
    private void prepararMundo(){
        addObject(new Facil(),150,550);
        addObject(new Intermedio(),150,650);
        addObject(flecha,305,550);
        
    }
    public void act(){
        if(Greenfoot.isKeyDown("UP") && opcion!=0){opcion++;}
        if(Greenfoot.isKeyDown("DOWN") && opcion!=1){opcion--;}
        if(opcion>=2) opcion=0;
        if(opcion<0) opcion=1;
        flecha.setLocation(305,550+(opcion*100));
    }
}
