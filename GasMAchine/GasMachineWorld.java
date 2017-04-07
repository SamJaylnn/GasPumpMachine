import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasMachineWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GasMachineWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1);
        prepare();
    }
   /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        GasMachine gasmachine = new GasMachine();
        KeyPad keypad = new KeyPad();
        Nozzel nozzel = new Nozzel();
        FuelOption fueloption = new FuelOption();
        CardSlot cardslot = new CardSlot();
        addObject(gasmachine, 367, 237);
        gasmachine.setLocation(317,217);
        addObject(keypad, 57, 71 ) ;
        keypad.setLocation(560,410);
        addObject(nozzel, 68, 156 ) ;
        nozzel.setLocation(100,290);
        addObject(fueloption, 66, 248 ) ;
        fueloption.setLocation(330,440);
        addObject(cardslot,43,22);
        cardslot.setLocation(560,260);
        Button a = new Button("A");
        Button b = new Button("B");
        Button c = new Button("C");
        Button d = new Button("D");
        Button e = new Button("E");
        Button f= new Button("F");
        Button g = new Button("G");
        Button h= new Button("H");
        //Message msg = new Message("Welcome, please insert Credit Card");
        //addObject(msg,250,80);
        addObject(a,100,80);
        addObject(b,100,120);
        addObject(c,100,160);
        addObject(d,100,200);
        addObject(e,510,80);
        addObject(f,510,120);
        addObject(g,510,160);
        addObject(h,510,200);
        
         
    }
}

