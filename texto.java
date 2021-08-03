import greenfoot.*;
import java.awt.*; 
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class texto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class texto extends Actor
{
    /**
     * Act - do whatever the texto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public texto(String text){
        GreenfootImage img=new GreenfootImage(text.length()*20,50);
        //img.setColor(Color.white);
        img.drawString(text,2,50);
        setImage(img);
        
        
        
        
        
    } 
    public void setText(String text){
        GreenfootImage img=getImage();
        img.clear();
        img.drawString(text,2,50);
        
        
    }
   
}
