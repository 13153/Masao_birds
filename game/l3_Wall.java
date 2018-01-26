import greenfoot.*;

/**
 * Write a description of class l3_Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class l3_Wall extends Actor
{
    /**
     * Act - do whatever the l3_Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int tuka = 0;
    public void act() 
    {
        
        move(-6);
        
        int x = getX();
        
        if(x<=0){
            move(800);
            
            tuka++;
        }
        
        if(tuka == 5){
           World w = new Clear();
            Greenfoot.setWorld(w);
        }
    }    
}
