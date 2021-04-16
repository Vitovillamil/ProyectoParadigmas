import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class R1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Raton extends Actor
{
    private int speed = 2;
    /**
     * Act - do whatever the R1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
   {  
       int y = getY();
        if(Greenfoot.isKeyDown("right"))
        {
            if (validarPared()) {
                move(speed);comer();
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            if (validarPared()) {
                move(-speed);comer();
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
            if (validarPared()) {
                y = y-speed; comer();
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            if (validarPared()) {
                y = y+speed;
                comer();
            }
        }
        
        if(Greenfoot.isKeyDown("F1"))
        {
            turn(2);comer();
        }
        
        if(Greenfoot.isKeyDown("F2"))
        {
            turn(2);comer();
        }
            setLocation(getX(),y);
        }
        
        /**
         * funcionalidad comer: se implementa el metodo de comer para evalua cada vez que se mueva el raton en el raton, y si encuentra 
         * un pan se recuperara un 10%, y cuando coma una salchicha la velocidad aumentará.
         */
        public void comer()
        {
            Actor pan;
            pan=getOneObjectAtOffset(0,0,Pan.class);
            if(pan!=null)
            {
                World escena2;
                escena2=getWorld();
                escena2.removeObject(pan);
            }
            Actor salchicha;
            salchicha=getOneObjectAtOffset(0,0,Salchicha.class);
            if(salchicha!=null)
            {
                World escena2;
                escena2=getWorld();
                escena2.removeObject(salchicha);
                speed = speed * 2;
            }     
            Actor Queso;
            Queso=getOneObjectAtOffset(0,0,Queso.class);
            if(Queso!=null)
            {
                World escena2;
                escena2=getWorld();
                escena2.removeObject(Queso);
               MyWorld game =(MyWorld)escena2;
               Counter cont = game.getCounter();
               cont.addcontar();
            }  
            
         
        }
    
    public boolean validarPared() {
        int x = getX();
        int y = getY();
        
        // x 100, y 90
        //if ((x >= 90 && x < 200) && (y >= 75 && y < 100)) {
            //return false;
        //} else {
            return true;
        //}
    }      
}



