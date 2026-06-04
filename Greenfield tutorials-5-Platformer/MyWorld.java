import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,91,339);
        Ground ground2 = new Ground();
        addObject(ground2,316,272);
        Ground ground3 = new Ground();
        addObject(ground3,510,173);
        Ground ground4 = new Ground();
        addObject(ground4,156,112);
        ground.setLocation(125,754);
        ground2.setLocation(296,687);
        ground3.setLocation(556,625);
        ground4.setLocation(332,495);
        Player player = new Player();
        addObject(player,35,705);
        Ground ground5 = new Ground();
        addObject(ground5,122,766);
        Ground ground6 = new Ground();
        addObject(ground6,299,704);
        ground2.setLocation(334,700);
        Ground ground7 = new Ground();
        addObject(ground7,569,637);
        Ground ground8 = new Ground();
        addObject(ground8,339,503);
    }
}
