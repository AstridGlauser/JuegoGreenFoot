import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class abeja extends Actor
{
    /**
     * Act - do whatever the roca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        World m=getWorld();
        if(getX()>=m.getWidth()-5||getX()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
            turn(Greenfoot.getRandomNumber(90-45));
        }
        }
        if(getY()>=m.getHeight()-5||getY()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
            turn(Greenfoot.getRandomNumber(90-45));
        }
        }
        
        Actor mariposa=getOneObjectAtOffset(0,0,mariposa.class);
        if(mariposa!=null){
           jardin jar=(jardin)getWorld();
           getWorld().removeObject(mariposa);
           jar.vidas.decrementar();
           getWorld().addObject(new mariposa(),50,300);
           if(jar.vidas.obtenerValor()==0){
             GameOver t=new GameOver();
             getWorld().addObject(t,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
           }
        }
    }
}
