import greenfoot.*;

/**
 * Write a description of class energia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class energia extends Actor
{
    /**
     * Act - do whatever the energia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        jardin jar=(jardin)getWorld();
        Actor act=getOneIntersectingObject(mariposa.class);
        if(act!=null)
        {
            for(int i=1;i<=10;i++)
                jar.extra.incrementar();
           getWorld().removeObject(this);
        }
        
        
        
    }    
}

