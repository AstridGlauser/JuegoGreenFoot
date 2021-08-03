import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class shot extends Actor
{
    int speedShot=10;
    int position;
    public shot(int direction){
        position=direction;
    }

    /**
     * Act - do whatever the bola wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   

        switch(position){
            case 0:
                setLocation(getX(),getY()-speedShot);
                break;
                case 1:
                    setLocation(getX(),getY()+speedShot);
                    break;
                case 2:
                    setLocation(getX()+speedShot,getY());
                    break;
                case 3:
                    setLocation(getX()-speedShot,getY());
                    break;
                    
                    
        }
        Actor abeja=getOneObjectAtOffset(0,0,abeja.class);
        //nave2 boss=(nave2)getOneIntersectingObject(nave2.class);
        if(abeja!=null){
            jardin jar=(jardin)getWorld();
            jar.puntos.incrementar();
             
            jar.crearPajaros(1);
            jar.crearEnergia(1);
            getWorld().removeObject(abeja);
           
            
           
            }
        Actor roca=getOneObjectAtOffset(0,0,roca.class);
        //nave2 boss=(nave2)getOneIntersectingObject(nave2.class);
        if(roca!=null){
            galaxia gax=(galaxia)getWorld();
            gax.puntos.incrementar();
             
            gax.crearRocas(1);
            gax.crearEnergia(1);
            getWorld().removeObject(roca);
           
            
           
            }
             Actor roca2=getOneObjectAtOffset(0,0,roca2.class);
            if(roca2!=null){
            universo uni=(universo)getWorld();
            uni.puntos.incrementar();
             
            uni.crearRocas(1);
            uni.crearEnergia(1);
            getWorld().removeObject(roca2);
           
            
           
            }
            
        
        
                       if((getX()>=getWorld().getWidth()-5)|| (getX()<=5)){
            getWorld().removeObject(this);
}
    else{
        if((getY()>=getWorld().getHeight()-5)|| (getY()<=5)){
            getWorld().removeObject(this);
}
        
    }

}
}