import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int time=0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 550, 1); 
        prepare();
    }
    public void act(){
        time++;
        if(time%360 == 0){
            addObject(new Enemy(),Greenfoot.getRandomNumber(750),Greenfoot.getRandomNumber(550));
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Mouse mouse = new Mouse();
        addObject(mouse,53,566);
        WallHeightLong wallHeightLong = new WallHeightLong();
        addObject(wallHeightLong,27,118);
        wallHeightLong.setLocation(11,121);
        wallHeightLong.setLocation(13,141);
        wallHeightLong.setLocation(-10,147);
        wallHeightLong.setLocation(11,141);
        wallHeightLong.setLocation(8,141);
        WallHeightLong wallHeightLong2 = new WallHeightLong();
        addObject(wallHeightLong2,93,387);
        wallHeightLong2.setLocation(5,405);
        WallHeightLong wallHeightLong3 = new WallHeightLong();
        addObject(wallHeightLong3,696,167);
        wallHeightLong3.setLocation(747,165);
        WallHeightLong wallHeightLong4 = new WallHeightLong();
        addObject(wallHeightLong4,632,337);
        wallHeightLong4.setLocation(748,443);
        WallWidthLong wallWidthLong = new WallWidthLong();
        addObject(wallWidthLong,605,499);
        wallWidthLong.setLocation(593,585);
        WallWidthLong wallWidthLong2 = new WallWidthLong();
        addObject(wallWidthLong2,368,501);
        wallWidthLong2.setLocation(296,587);
        WallWidthSmall wallWidthSmall = new WallWidthSmall();
        addObject(wallWidthSmall,179,533);
        wallWidthSmall.setLocation(105,590);
        WallWidthLong wallWidthLong3 = new WallWidthLong();
        addObject(wallWidthLong3,403,371);
        wallWidthLong3.setLocation(382,540);
        WallWidthMedium wallWidthMedium = new WallWidthMedium();
        addObject(wallWidthMedium,147,535);
        wallWidthMedium.setLocation(145,540);
        wallWidthLong3.setLocation(256,533);
        wallWidthLong3.setLocation(356,538);
        WallWidthLong wallWidthLong4 = new WallWidthLong();
        addObject(wallWidthLong4,576,56);
        wallWidthLong4.setLocation(592,5);
        WallWidthLong wallWidthLong5 = new WallWidthLong();
        addObject(wallWidthLong5,335,66);
        wallWidthLong5.setLocation(345,57);
        wallWidthLong5.setLocation(292,6);
        WallHeightMedium wallHeightMedium = new WallHeightMedium();
        addObject(wallHeightMedium,389,149);
        wallHeightMedium.setLocation(397,155);
        removeObject(wallHeightMedium);
        WallHeightLong wallHeightLong5 = new WallHeightLong();
        addObject(wallHeightLong5,312,138);
        wallHeightLong5.setLocation(358,273);
        removeObject(wallHeightLong5);
        WallHeightMedium wallHeightMedium1 = new WallHeightMedium();
        addObject(wallHeightMedium,333,122);
        wallHeightMedium.setLocation(351,204);
        WallHeightSmall wallHeightSmall = new WallHeightSmall();
        addObject(wallHeightSmall,394,93);
        wallHeightSmall.setLocation(354,93);
        WallWidthLong wallWidthLong6 = new WallWidthLong();
        addObject(wallWidthLong6,569,146);
        wallWidthLong6.setLocation(588,100);
        WallHeightMedium wallHeightMedium2 = new WallHeightMedium();
        addObject(wallHeightMedium2,229,336);
        wallHeightMedium2.setLocation(73,380);
        WallWidthLong wallWidthLong7 = new WallWidthLong();
        addObject(wallWidthLong7,196,336);
        wallWidthLong7.setLocation(310,365);
        wallWidthLong7.setLocation(249,360);
        wallWidthLong7.setLocation(234,363);
        WallHeightMedium wallHeightMedium3 = new WallHeightMedium();
        addObject(wallHeightMedium3,610,280);
        wallHeightMedium3.setLocation(489,255);
        WallHeightMedium wallHeightMedium4 = new WallHeightMedium();
        addObject(wallHeightMedium4,581,210);
        wallHeightMedium4.setLocation(561,245);
        WallHeightMedium wallHeightMedium5 = new WallHeightMedium();
        addObject(wallHeightMedium5,649,217);
        wallHeightMedium5.setLocation(631,241);
        WallWidthMedium wallWidthMedium2 = new WallWidthMedium();
        addObject(wallWidthMedium2,621,155);
        wallWidthMedium2.setLocation(527,136);
        wallWidthMedium2.setLocation(599,141);
        wallWidthMedium2.setLocation(563,143);
        WallWidthSmall wallWidthSmall2 = new WallWidthSmall();
        addObject(wallWidthSmall2,657,177);
        wallWidthSmall2.setLocation(690,182);
        WallWidthSmall wallWidthSmall3 = new WallWidthSmall();
        addObject(wallWidthSmall3,102,49);
        wallWidthSmall3.setLocation(109,50);
        WallHeightSmall wallHeightSmall2 = new WallHeightSmall();
        addObject(wallHeightSmall2,164,121);
        wallHeightSmall2.setLocation(144,98);
        wallHeightSmall.setLocation(333,127);
        WallWidthMedium wallWidthMedium3 = new WallWidthMedium();
        addObject(wallWidthMedium3,333,127);
        wallHeightSmall.setLocation(217,142);
        wallHeightSmall.setLocation(352,80);
        wallHeightSmall.setLocation(352,89);
        WallWidthMedium wallWidthMedium4 = new WallWidthMedium();
        addObject(wallWidthMedium4,280,76);
        wallWidthMedium4.setLocation(280,52);
        WallWidthSmall wallWidthSmall4 = new WallWidthSmall();
        addObject(wallWidthSmall4,288,218);
        wallWidthSmall4.setLocation(456,48);
        WallHeightSmall wallHeightSmall3 = new WallHeightSmall();
        addObject(wallHeightSmall3,271,170);
        wallHeightSmall3.setLocation(279,181);
        WallHeightMedium wallHeightMedium6 = new WallHeightMedium();
        addObject(wallHeightMedium6,158,263);
        wallHeightMedium6.setLocation(212,299);
        WallWidthMedium wallWidthMedium5 = new WallWidthMedium();
        addObject(wallWidthMedium5,252,269);
        wallWidthMedium5.setLocation(282,271);
        WallWidthMedium wallWidthMedium6 = new WallWidthMedium();
        addObject(wallWidthMedium6,354,299);
        wallWidthMedium6.setLocation(360,309);
        wallWidthMedium6.setLocation(352,314);
        WallWidthMedium wallWidthMedium7 = new WallWidthMedium();
        addObject(wallWidthMedium7,118,194);
        wallWidthMedium7.setLocation(141,184);
        wallWidthMedium7.setLocation(68,185);
        WallHeightSmall wallHeightSmall4 = new WallHeightSmall();
        addObject(wallHeightSmall4,68,185);
        wallHeightSmall4.setLocation(66,184);
        WallWidthMedium wallWidthMedium8 = new WallWidthMedium();
        addObject(wallWidthMedium8,587,341);
        wallWidthMedium8.setLocation(563,360);
        WallHeightSmall wallHeightSmall5 = new WallHeightSmall();
        addObject(wallHeightSmall5,428,350);
        wallHeightSmall5.setLocation(423,360);
        WallHeightSmall wallHeightSmall6 = new WallHeightSmall();
        addObject(wallHeightSmall6,431,134);
        wallHeightSmall6.setLocation(428,136);
        WallHeightMedium wallHeightMedium7 = new WallHeightMedium();
        addObject(wallHeightMedium7,512,468);
        wallHeightMedium7.setLocation(489,470);
        WallWidthLong wallWidthLong8 = new WallWidthLong();
        addObject(wallWidthLong8,341,466);
        wallWidthLong8.setLocation(274,452);
        wallWidthLong8.setLocation(289,452);
        WallWidthMedium wallWidthMedium9 = new WallWidthMedium();
        addObject(wallWidthMedium9,265,497);
        wallWidthMedium9.setLocation(211,496);
        WallHeightMedium wallHeightMedium8 = new WallHeightMedium();
        addObject(wallHeightMedium8,396,484);
        wallHeightMedium8.setLocation(355,476);
        WallHeightSmall wallHeightSmall7 = new WallHeightSmall();
        addObject(wallHeightSmall7,632,440);
        wallHeightSmall7.setLocation(634,451);
        WallWidthMedium wallWidthMedium10 = new WallWidthMedium();
        addObject(wallWidthMedium10,659,492);
        wallWidthMedium10.setLocation(636,496);
        WallWidthMedium wallWidthMedium11 = new WallWidthMedium();
        addObject(wallWidthMedium11,572,441);
        wallWidthMedium11.setLocation(565,444);
        WallHeightSmall wallHeightSmall8 = new WallHeightSmall();
        addObject(wallHeightSmall8,695,358);
        wallHeightSmall8.setLocation(707,362);
        removeObject(wallHeightSmall8);
        WallHeightMedium wallHeightMedium9 = new WallHeightMedium();
        addObject(wallHeightMedium9,679,383);
        wallHeightMedium9.setLocation(704,384);
        WallWidthSmall wallWidthSmall5 = new WallWidthSmall();
        addObject(wallWidthSmall5,657,311);
        wallWidthSmall5.setLocation(663,311);
        wallWidthMedium8.setLocation(619,357);
        WallWidthSmall wallWidthSmall6 = new WallWidthSmall();
        addObject(wallWidthSmall6,619,357);
        wallWidthMedium8.setLocation(673,363);
        WallWidthSmall wallWidthSmall7 = new WallWidthSmall();
        addObject(wallWidthSmall7,593,62);
        wallWidthSmall7.setLocation(599,49);
        WallHeightSmall wallHeightSmall9 = new WallHeightSmall();
        addObject(wallHeightSmall8,580,77);
        wallHeightSmall8.setLocation(566,91);
        WallHeightMedium wallHeightMedium10 = new WallHeightMedium();
        addObject(wallHeightMedium10,729,68);
        wallHeightMedium10.setLocation(705,71);
        WallWidthSmall wallWidthSmall8 = new WallWidthSmall();
        addObject(wallWidthSmall8,125,248);
        wallWidthSmall8.setLocation(108,270);
        WallWidthMedium wallWidthMedium12 = new WallWidthMedium();
        addObject(wallWidthMedium12,216,395);
        wallWidthMedium12.setLocation(215,401);
        Cheese cheese = new Cheese();
        addObject(cheese,598,466);
        Cheese cheese2 = new Cheese();
        addObject(cheese2,401,486);
        Cheese cheese3 = new Cheese();
        addObject(cheese3,94,87);
        Cheese cheese4 = new Cheese();
        addObject(cheese4,669,61);
        Cheese cheese5 = new Cheese();
        addObject(cheese5,692,272);
        Teleporter teleporter = new Teleporter();
        addObject(teleporter,313,496);
        Teleporter teleporter2 = new Teleporter();
        addObject(teleporter2,526,77);
        Teleporter teleporter3 = new Teleporter();
        addObject(teleporter3,317,165);
        cheese5.setLocation(670,280);
        Enemy enemy = new Enemy();
        addObject(enemy,Greenfoot.getRandomNumber(750),Greenfoot.getRandomNumber(550));
        Enemy enemy2 = new Enemy();
        addObject(enemy2,Greenfoot.getRandomNumber(750),Greenfoot.getRandomNumber(550));
        Enemy enemy3 = new Enemy();
        addObject(enemy3,Greenfoot.getRandomNumber(750),Greenfoot.getRandomNumber(550));
        Enemy2 enemy22 = new Enemy2();
        addObject(enemy22,212,158);
        Enemy2 enemy23 = new Enemy2();
        addObject(enemy23,422,225);
    }
}
