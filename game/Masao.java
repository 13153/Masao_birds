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
    private boolean flag_jump = false;
    public void act() 
    {
       int x = getX();
       int y = getY();
   
        /*if(scount <= 10){
            if( Greenfoot.isKeyDown( "space" ) && jump>=20 ){
                jump=0;
            
            }
        }*/
       if(Greenfoot.isKeyDown("space")){
            if( flag_jump == false ){
                if( jump >= 15){
                        jump = 0;
                        flag_jump = true;
                }
             }
       }
       else flag_jump = false;
        
        if(jump<15)
        {
            setLocation( x,y-15 );
            jump++;
        }
        else
        {
            setLocation( x,y+15 );
        }
       
       //判定処理
      
         
       Actor actor = getOneObjectAtOffset( 0, 0, l3_Wall.class );
       if( actor != null || y==0 || y == 599){
           // Masao とぶつかった時の処理を書く
           World w = new Gameover();
            Greenfoot.setWorld(w);
        }  
    }    
}