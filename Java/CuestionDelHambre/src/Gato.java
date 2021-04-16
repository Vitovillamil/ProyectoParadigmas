import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

/**Creamos la clase Gato este es un obstaculo en nuestro juego, le dimos movimiento aleatorio a este  */		

public class Gato extends Actor
		{
    /**
     * Act - do whatever the Gato wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
        {
    {
    move(6);
        if(Greenfoot.getRandomNumber(50)<5)
        {
           turn (Greenfoot.getRandomNumber(20)-10); 
        } 
    
        if(isAtEdge())
        {   
            turn(9);
        }
    }
    // Add your action code here.
    }    
}