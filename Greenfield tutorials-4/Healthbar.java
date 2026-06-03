import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Healthbar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Healthbar extends Actor
{
    /**
     * Act - do whatever the Healthbar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health=15;
    int healthBarWidth;
    int healthBarHeight;
    int pixelsPerHealthPoint=(int)healthBarWidth/health;
    public void act()
    {
    }
    public void update(){
        
    }
}
