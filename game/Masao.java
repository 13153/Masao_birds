import greenfoot.*;

/**
 * Write a description of class Masao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Masao extends Actor
{
    /**
     * Act - do whatever the Masao wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int scount = 0;
    int jump = 15;
    int a = 0;
    public void act() 
    {
        getWorld().showText( "jump"+jump+"scount"+scount, 100, 50 );   
        /*if(scount <= 10){
            if( Greenfoot.isKeyDown( "space" ) && jump>=20 ){
                jump=0;
            
            }
        }*/
       if(Greenfoot.isKeyDown("space")){
            scount++;
            if( jump >= 15 && scount <= 20){
                    jump = 0;
                }
        }
        else{
            if(a == 0){
                scount = 0;   
             }
       }
        
        if(jump<15)
        {
            setRotation(-90);
            move(15);
            setRotation(90);
            jump++;
            a = 1;
        }
        else
        {
            setRotation(90);
            move(10);
            setRotation(-90);
            a = 0;
        }
        
    }    
}