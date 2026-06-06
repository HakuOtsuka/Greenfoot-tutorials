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
        super(2000, 800, 1); 
        prepare();
    }
    public void act(){
        if(Greenfoot.getRandomNumber(100)<=2){
            addObject(new Coin(),getWidth()-1,Greenfoot.getRandomNumber(250)+500);
            
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
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
        Cloud cloud5 = new Cloud();
        addObject(cloud5,978,72);
        Cloud cloud6 = new Cloud();
        addObject(cloud6,1206,126);
        Cloud cloud7 = new Cloud();
        addObject(cloud7,1504,112);
        Cloud cloud8 = new Cloud();
        addObject(cloud8,1730,128);
        Trees trees9 = new Trees();
        addObject(trees9,1427,322);
        Trees trees10 = new Trees();
        addObject(trees10,1070,361);
        Trees trees11 = new Trees();
        addObject(trees11,1534,589);
        Trees trees12 = new Trees();
        addObject(trees12,1284,696);
        Trees trees13 = new Trees();
        addObject(trees13,1100,762);
        Trees trees14 = new Trees();
        addObject(trees14,1031,570);
        Trees trees15 = new Trees();
        addObject(trees15,1328,434);
        Trees trees16 = new Trees();
        addObject(trees16,1724,403);
        Cloud cloud9 = new Cloud();
        addObject(cloud9,2070,59);
        Cloud cloud10 = new Cloud();
        addObject(cloud10,2598,22);
        Cloud cloud11 = new Cloud();
        addObject(cloud11,2363,73);
        Cloud cloud12 = new Cloud();
        addObject(cloud12,2882,111);
        Cloud cloud13 = new Cloud();
        addObject(cloud13,3234,155);
        Cloud cloud14 = new Cloud();
        addObject(cloud14,3096,70);
        Trees trees17 = new Trees();
        addObject(trees17,2255,356);
        Trees trees18 = new Trees();
        addObject(trees18,2076,476);
        Trees trees19 = new Trees();
        addObject(trees19,1950,570);
        Trees trees20 = new Trees();
        addObject(trees20,3005,505);
        Trees trees21 = new Trees();
        addObject(trees21,2630,509);
        Trees trees22 = new Trees();
        addObject(trees22,2313,595);
        Trees trees23 = new Trees();
        addObject(trees23,2740,694);
        Trees trees24 = new Trees();
        addObject(trees24,2106,727);
        Trees trees25 = new Trees();
        addObject(trees25,2721,389);
        Trees trees26 = new Trees();
        addObject(trees26,3231,538);
        Trees trees27 = new Trees();
        addObject(trees27,3122,739);
        Cloud cloud15 = new Cloud();
        addObject(cloud15,3682,88);
        Cloud cloud16 = new Cloud();
        addObject(cloud16,4245,91);
        Cloud cloud17 = new Cloud();
        addObject(cloud17,4715,110);
        Cloud cloud18 = new Cloud();
        addObject(cloud18,3939,111);
        Trees trees28 = new Trees();
        addObject(trees28,4641,340);
        Trees trees29 = new Trees();
        addObject(trees29,4507,509);
        Trees trees30 = new Trees();
        addObject(trees30,4398,697);
        Trees trees31 = new Trees();
        addObject(trees31,3915,621);
        Trees trees32 = new Trees();
        addObject(trees32,4077,580);
        Trees trees33 = new Trees();
        addObject(trees33,3870,388);
        Trees trees34 = new Trees();
        addObject(trees34,3687,514);
        Trees trees35 = new Trees();
        addObject(trees35,4192,371);
        Trees trees36 = new Trees();
        addObject(trees36,3430,601);
        Trees trees37 = new Trees();
        addObject(trees37,3580,724);
        Trees trees38 = new Trees();
        addObject(trees38,4681,653);
        Cloud cloud19 = new Cloud();
        addObject(cloud19,4498,151);
        Cloud cloud20 = new Cloud();
        addObject(cloud20,4941,81);
        Trees trees39 = new Trees();
        addObject(trees39,4858,387);
        Trees trees40 = new Trees();
        addObject(trees40,4886,728);
        Coin coin = new Coin();
        addObject(coin,589,590);
        Coin coin2 = new Coin();
        addObject(coin2,370,452);
        Coin coin3 = new Coin();
        addObject(coin3,1261,574);
        Coin coin4 = new Coin();
        addObject(coin4,928,452);
        Coin coin5 = new Coin();
        addObject(coin5,1695,606);
        Coin coin6 = new Coin();
        addObject(coin6,1583,419);
        Ground ground = new Ground();
        addObject(ground,85,749);
        Ground ground2 = new Ground();
        addObject(ground2,382,696);
        Ground ground3 = new Ground();
        addObject(ground3,664,694);
        Ground ground4 = new Ground();
        addObject(ground4,889,664);
        Ground ground5 = new Ground();
        addObject(ground5,1150,698);
        Ground ground6 = new Ground();
        addObject(ground6,1372,694);
        Ground ground7 = new Ground();
        addObject(ground7,1661,691);
        Ground ground8 = new Ground();
        addObject(ground8,1921,679);
        GroundMiddle groundMiddle = new GroundMiddle();
        addObject(groundMiddle,1917,487);
        GroundMiddle groundMiddle2 = new GroundMiddle();
        addObject(groundMiddle2,1654,485);
        GroundMiddle groundMiddle3 = new GroundMiddle();
        addObject(groundMiddle3,1430,480);
        GroundMiddle groundMiddle4 = new GroundMiddle();
        addObject(groundMiddle4,1167,471);
        GroundMiddle groundMiddle5 = new GroundMiddle();
        addObject(groundMiddle5,869,487);
        GroundMiddle groundMiddle6 = new GroundMiddle();
        addObject(groundMiddle6,617,484);
        GroundMiddle groundMiddle7 = new GroundMiddle();
        addObject(groundMiddle7,381,496);
        trees4.setLocation(78,495);
        GroundMiddle groundMiddle8 = new GroundMiddle();
        addObject(groundMiddle8,78,495);
        cloud.setLocation(45,328);
        GroundHigh groundHigh = new GroundHigh();
        addObject(groundHigh,45,328);
        GroundHigh groundHigh2 = new GroundHigh();
        addObject(groundHigh2,310,320);
        cloud4.setLocation(586,311);
        GroundHigh groundHigh3 = new GroundHigh();
        addObject(groundHigh3,586,311);
        GroundHigh groundHigh4 = new GroundHigh();
        addObject(groundHigh4,918,297);
        GroundHigh groundHigh5 = new GroundHigh();
        addObject(groundHigh5,1161,312);
        GroundHigh groundHigh6 = new GroundHigh();
        addObject(groundHigh6,1340,280);
        GroundHigh groundHigh7 = new GroundHigh();
        addObject(groundHigh7,1533,281);
        GroundHigh groundHigh8 = new GroundHigh();
        addObject(groundHigh8,1770,274);
        GroundHigh groundHigh9 = new GroundHigh();
        addObject(groundHigh9,1972,270);
        Player player = new Player();
        addObject(player,35,705);
    }
}
