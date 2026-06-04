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
        Cloud cloud = new Cloud();
        addObject(cloud,119,139);
        cloud.setLocation(76,171);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,590,166);
        cloud2.setLocation(644,75);
        cloud.setLocation(87,248);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,179,38);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,549,264);
        Trees trees = new Trees();
        addObject(trees,598,511);
        trees.setLocation(514,507);
        Trees trees2 = new Trees();
        addObject(trees2,148,514);
        Trees trees3 = new Trees();
        addObject(trees3,616,386);
        Trees trees4 = new Trees();
        addObject(trees4,77,483);
        Trees trees5 = new Trees();
        addObject(trees5,192,580);
        Trees trees6 = new Trees();
        addObject(trees6,663,508);
        Trees trees7 = new Trees();
        addObject(trees7,658,737);
        Trees trees8 = new Trees();
        addObject(trees8,347,412);
        Ground ground9 = new Ground();
        addObject(ground9,768,406);
        Ground ground10 = new Ground();
        addObject(ground10,762,416);
        Ground ground11 = new Ground();
        addObject(ground11,881,501);
        Ground ground12 = new Ground();
        addObject(ground12,885,514);
        Ground ground13 = new Ground();
        addObject(ground13,803,734);
        Ground ground14 = new Ground();
        addObject(ground14,810,743);
        Ground ground15 = new Ground();
        addObject(ground15,100,378);
        Ground ground16 = new Ground();
        addObject(ground16,109,394);
        ground16.setLocation(100,389);
    }
}
