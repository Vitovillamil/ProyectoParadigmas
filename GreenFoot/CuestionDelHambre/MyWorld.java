import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter cont = new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1);  
        addObject(new Raton(), 90, 70);
        addObject(new Escoba(), 650, 550);
        addObject(new Gato(), 300, 550);
        addObject(new Vida(), 50, 20);
        addObject(new Vida(), 100, 20);
        addObject(new Vida(), 150, 20);
        addObject(new Pan(), 190, 80);
        addObject(new Pan(), 355, 550);
        addObject(new Pan(), 500, 300);
        addObject(new Salchicha(), 550, 80);
        addObject(new Salchicha(), 200, 300);
        addObject(new Salchicha(), 570, 545);
        addObject(new Salchicha(), 100, 400);
        addObject(new Veneno(), 350, 70);
        addObject(new Veneno(), 400, 300);
        addObject(new Veneno(), 100, 500);
        addObject(new Queso(), 100, 150);
        addObject(new Queso(), 100, 350);
        addObject(new Queso(), 390, 380);
        addObject(new Queso(), 330, 200);
        addObject(new Queso(), 500, 200);
        prepare();
        
    }
    public Counter getCounter()
    {
       return cont;
    }
   
    public void prepare()
    {
        addObject(cont, 400,20);
    }


}
