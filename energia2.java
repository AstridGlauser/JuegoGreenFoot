import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class energia2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class energia2 extends Actor
{
    /**
     * Act - do whatever the energia2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        galaxia gax=(galaxia)getWorld();
        Actor act1=getOneIntersectingObject(nave.class);
        if(act1!=null)
        {
            for(int i=1;i<=10;i++)
                gax.extra.incrementar();
           getWorld().removeObject(this);
        }
        // Add your action code here.
    }
}
