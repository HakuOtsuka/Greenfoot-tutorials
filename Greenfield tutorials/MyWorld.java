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
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,323,150);
        Enemy enemy = new Enemy();
        addObject (enemy, 50, 60);
        Enemy enemy2 = new Enemy();
        addObject (enemy2, 100, 600);
        Enemy enemy3 = new Enemy();
        addObject (enemy3, 200, 320);
        enemy.setLocation(47,25);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,553,169);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,431,242);
        enemy4.setLocation(490,282);
        enemy4.setLocation(373,391);
        enemy5.setLocation(576,156);
        enemy4.setLocation(562,402);
        Enemy enemy6 = new Enemy();
        addObject(enemy6,75,138);
        Enemy enemy7 = new Enemy();
        addObject(enemy7,703,304);
        Enemy enemy8 = new Enemy();
        addObject(enemy8,353,473);
        enemy6.setLocation(61,315);
        enemy3.setLocation(192,304);
        enemy3.setLocation(136,140);
        Enemy enemy9 = new Enemy();
        addObject(enemy9,305,273);
        Enemy enemy10 = new Enemy();
        addObject(enemy10,710,506);
        Enemy enemy11 = new Enemy();
        addObject(enemy11,180,473);
    }
}
