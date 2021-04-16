
	import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

	/**
	 * Write a description of class Counter here.
	 * 
	 * @author (your name) 
	 * @version (a version number or a date)
	 */
	/*Inicializamos la clase contador de nuestro juego */
	public class Counter extends Actor
	{
	    int contar = 0;
	    /**
	     * Act - do whatever the Counter wants to do. This method is called whenever
	     * the 'Act' or 'Run' button gets pressed in the environment.
	     */
	    
	    /**Aqui colocamos el color de nuestro contador, adicionamos la forma de la imagen, y un texto indicando cuantos quesos ha ganado 
	     * el raton */
	    public void act() 
	        {
	        setImage (new GreenfootImage("Quesos Ganados:" + contar, 50, Color.YELLOW, Color.BLUE));
	        } 
	        public void addcontar()
	        {

	            contar++;

	        } 
	        // Add your action code here.
	    }    


	
}
