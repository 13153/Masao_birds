import greenfoot.*;

/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A extends Actor
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
<<<<<<< HEAD
        if( Greenfoot.isKeyDown( "left" ) ){
            setRotation(180);
            move(1);
=======
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(270);
        move(1);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(1);
>>>>>>> 8dbfd7ef9949b4de9e86968bae8a4a54cab60ffa
        }
    }    
}
