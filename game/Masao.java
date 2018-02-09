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
    int jump = 6;
    private boolean flag_jump = false;
    public void act() 
    {
       int x = getX();
       int y = getY();

       if(Greenfoot.isKeyDown("space")){
            if( flag_jump == false ){
                if( jump >= 12){
                        jump = 0;
                        flag_jump = true;
                }
             }
       }
       else flag_jump = false;
        
        if(jump<12)
        {
            setLocation( x,y-12 );
            jump++;
        }
        else
        {
            setLocation( x,y+12 );
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