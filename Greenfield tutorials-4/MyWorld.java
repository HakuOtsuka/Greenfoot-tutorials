import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter=new Counter();
    Healthbar healthbar=new Healthbar();
    boolean bossLevel=false;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    public Counter getCounter(){
        return counter;
    }
    public Healthbar getHealthbar(){
        return healthbar;
    }
    public void act(){
            addEnemy1();
            addEnemy2();
            Boss();
    }
    public void Boss(){
        if(counter.score==25||counter.score==26){
            if(bossLevel==false){
                addObject(new Boss(),300,0);
            }
        }
    }
    public void addEnemy1(){
        if(Greenfoot.getRandomNumber(120)<1){
            addObject(new Enemy1(),Greenfoot.getRandomNumber(600),0);
        }
        
    }
    public void addEnemy2(){
        if(Greenfoot.getRandomNumber(200)<1){
            addObject(new Enemy2(),Greenfoot.getRandomNumber(600),0);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter,50,50);
        addObject(healthbar,250,50);
        Player player = new Player();
        addObject(player,94,540);
    }
}
