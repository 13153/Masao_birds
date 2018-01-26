import greenfoot.*;

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
      
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
    }
    public void act(){
           if(Greenfoot.isKeyDown("space")){
               World w = new MyWorld();
               Greenfoot.setWorld(w);
           }
    }
}
