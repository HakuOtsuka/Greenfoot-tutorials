import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class
 Player extends Actor
{
    private int vSpeed=0;
    private int acceleration=1;
    private int jumpHeight=-20;
    private int collect=0;
    boolean TenCoinsCollected=false;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        checkFalling();
        collect();
        SecondLevel();
    }
    private void fall(){
        setLocation(getX(),getY()+vSpeed);
        vSpeed=vSpeed+acceleration;
    }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right")){
            move(4);
        }
        if(Greenfoot.isKeyDown("left")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("space") && onGround()==true){
            vSpeed=jumpHeight;
            fall();
        }
        if(Greenfoot.isKeyDown("space") && onGroundMid()==true){
            vSpeed=jumpHeight;
            fall();
        }
        if(Greenfoot.isKeyDown("space") && onGroundHigh()==true){
            vSpeed=jumpHeight;
            fall();
        }
    }
    boolean onGround(){
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2,Ground.class);
        return under!=null;
    }
    boolean onGroundMid(){
        Actor under2 = getOneObjectAtOffset(0,getImage().getHeight()/2,GroundMiddle.class);
        return under2!=null;
    }
    boolean onGroundHigh(){
        Actor under3 = getOneObjectAtOffset(0,getImage().getHeight()/2,GroundHigh.class);
        return under3!=null;
    }
    public void checkFalling(){
        if(onGround()==false || onGroundMid()==false||onGroundHigh()==false){
            fall();
        }
        if(onGround()==true||onGroundMid()==true||onGroundHigh()==true){
            vSpeed=0;
        }
    }
    public void collect(){
        Actor coin=getOneIntersectingObject(Coin.class);
        if(coin!=null){
            getWorld().removeObject(coin);
            collect++;
        }
        if(collect==10 && TenCoinsCollected==false){
            getWorld().addObject(new SecretDoor(),1950,450);
            TenCoinsCollected=true;
        }
    }
    public void SecondLevel(){
        Actor secretDoor=getOneIntersectingObject(SecretDoor.class);
        if(secretDoor!=null){
            Greenfoot.setWorld(new Background2());
        }
    }
}
