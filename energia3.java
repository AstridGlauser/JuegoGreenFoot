import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class energia2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class energia3 extends Actor
{
    /**
     * Act - do whatever the energia2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        universo uni=(universo)getWorld();
        Actor act3=getOneIntersectingObject(nave2.class);
        if(act3!=null)
        {
            for(int i=1;i<=10;i++)
                uni.extra.incrementar();
           getWorld().removeObject(this);
        }
        // Add your action code here.
    }
}
