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
    int count;
    public MyWorld()
{   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        showText( "よーい", 100, 50 );
        addObject(new Masao(),80,300); //主人公
        addObject(new l3_Wall(),800,0); //障害物
        addObject(new l3_Wall(),800,500); //下障害物 後回し
       
        addObject(new l3_Wall(),400,100); //障害物
        addObject(new l3_Wall(),400,600); //下障害物 後回し
        
        
    } 
}
   


