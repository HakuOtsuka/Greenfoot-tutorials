import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceActors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceActors extends Actor
{
    /**
     * Act - do whatever the SpaceActors wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    public void wrapAtEdge(){
        if(getX()==0){
            setLocation(899,getY());
        }
        if(getY()==0){
            setLocation(getX(),649);
        }
        if(getX()==898){
            setLocation(1,getY());
        }
        if(getY()==648){
            setLocation(getX(),649);
        }
    }
}
