import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
{   

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);

        addObject(new Masao(),50,400); //主人公
        addObject(new l3_Wall(),600,50); //障害物
        addObject(new l3_Wall(),600,600); //下障害物 後回し
            
        
    } 

}
