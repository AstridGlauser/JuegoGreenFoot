import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roca2 extends Actor
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
        
        Actor nave2=getOneObjectAtOffset(0,0,nave.class);
        if(nave2!=null){
           universo uni=(universo)getWorld();
           getWorld().removeObject(nave2);
           uni.vidas.decrementar();
           getWorld().addObject(new nave2(),50,300);
           if(uni.vidas.obtenerValor()==0){
             GameOver t=new GameOver();
             getWorld().addObject(t,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
           }
        }
    }
}