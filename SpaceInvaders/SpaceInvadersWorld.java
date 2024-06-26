import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe responsável pelo mundo do SpaceInvaders.
 * 
 * @author Nicolas Afonso 
 * @version 2024-04-27
 */
public class SpaceInvadersWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public SpaceInvadersWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Nave nave = new Nave();
        addObject(nave,403,563);
        Alien alien = new Alien();
        addObject(alien,411,30);
    }
}
