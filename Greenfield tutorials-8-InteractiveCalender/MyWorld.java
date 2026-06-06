import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    //World Color declarations
    Color color;
    //Button Declarations
    Button red=new Button(Color.RED,this);
    Button blue=new Button(Color.BLUE,this);
    Button yellow=new Button(Color.YELLOW,this);
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1,false);
        //Background colour
        getBackground().setColor(Color.LIGHT_GRAY);
        getBackground().fill();
        //Method calls
        drawCalender();
        addButtons();
        //Test
    }
    public void drawCalender(){
        //Draw rows+columns
        GreenfootImage column = new GreenfootImage(2,600);
        GreenfootImage rows = new GreenfootImage(700,2);
        column.setColor(Color.BLACK);
        rows.setColor(Color.BLACK);
        column.fillRect(0,0,1,599);
        rows.fillRect(0,0,699,1);
        for(int i=0;i<6;i++){
            getBackground().drawImage(column,i*100+100,100);
        }
        for(int i=0;i<5;i++){
            getBackground().drawImage(rows,0,i*100+100);
        }
        //Draw Month names
        getBackground().setColor(Color.GREEN);
        getBackground().fillRect(0,0,699,100);
        GreenfootImage title=new GreenfootImage("DECEMBER",90,Color.RED,Color.GREEN,Color.BLACK);
        getBackground().drawImage(title,150,0);
        //Draw dates in corner
        int dayCount=1;
        for(int week=0;week<5;week++){
            for(int daysOfWeek=0;daysOfWeek<7;daysOfWeek++){
                if(dayCount<32){
                showText(""+dayCount,daysOfWeek*100+90,week*100+110);
                addObject(new Days(this),daysOfWeek*100+50,week*100+150);
                dayCount++;
                }
            }
        }
    }
    public void addButtons(){
        addObject( red,20,20);
        addObject( blue,50,20);
        addObject( yellow,80,20);
    }
}
