Greenfoot tutorials 

(1)“extends” means all methods and attributes from the class mentioned exists in the subclass 

For Worlds super(y size, x size, pixel size) 

In “prepare” of Worlds: 

 ActorClassName nameOfObject = new ActorClassName(); 

AddObject(nameOfObject, y coord, x coord) 

Ctrl+Space will display all available methods for the class 

Act button causes the act method to act out once per click 

Run button causes the act method to act out every second 

The number in turn() is how many degrees the actor will turn 

(2)Putting a second move() on an object will cause it to move the sum of the pixels within them (e.g. move(2) + move(3) = move(5)) 

(3)// will begin a note 

No code can be read from an object after it has been removed apart from Greenfoot.stop()  

(5) Saving too many objects in the world at once will create errors in the prepare of the world 

(6) The program runs 120 times per second (with time++ where time=0 initially when time=120 1s has passed) 

(9) Can get mouse info from Greenfoot.getMouseInfo() 

(10) Construtors don’t require a data type declaration 

(13)Typecasting can be done by putting the data type in brackets behind the value (typecasting to int will round down) 

drawRect(startWidth,startHeight,endWidth,endHeight) 

(14)getOneObjectAtOffset(PixelsFromWidthCentre,PixelsFromHeightCentre,ClassObjectWouldBeTouching) 

(15)Backgrounds of images can be easily removed with PowerPoint 

(17)setWorld(new WorldName()) is the code used to change the world users view 

(20) WorldName worldName =(WorldName)getWorld() -> Creates a variable version of the world that can be used to access all methods and information within the world 

(21)ClassName className = myWorld.getter() -> Creates a variable version of the named class (in the class the code is being written in) that can be used to access all information within the named class 

Public ClassName getClassName(){return className} -> A method to be written in the world class that allows other classes to access the information of the object of the class in the world 

GetWorld() gives access to all the methods of the world superclass not just the world you’ve created 
