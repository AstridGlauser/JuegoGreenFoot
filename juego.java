import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class juego extends World
{

    /**
     * Constructor for objects of class juego.
     * 
     */
    public juego()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(895, 380, 1);
        //Greenfoot.playSound("segundo.wav");
        prepararMundo();
    }
     private void prepararMundo(){
        addObject(new Amanda(),150,195);
        addObject(new sofia(),445,190);
        addObject(new violeta(),791,200);
        //addObject(flecha,305,550);
        
    }
}
