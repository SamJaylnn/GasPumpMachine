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
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        FuelType[] types = new FuelType[3]; 
        types[0] = new FuelType87();
        types[1] = new FuelType91();
        types[2] = new FuelType93();
        int x = 300;
        int y = 400;
        for (int i = 0; i < types.length; i++) {
            addObject(types[i], x, y);
            x+= 50;
        }
        
        addObject(new Nozzle(), 500, y);
        
         KeyPad keyPad= new KeyPad();
        KeyPadButton[][] keyPadMatrix = new KeyPadButton[4][4];
        
        keyPadMatrix[0][0]=new KeyPadButton1(keyPad);
        keyPadMatrix[0][1]=new KeyPadButton2(keyPad);
        keyPadMatrix[0][2]=new KeyPadButton3(keyPad);
        keyPadMatrix[0][3]=new KeyPadButtonClear(keyPad);
        
        
        keyPadMatrix[1][0]=new KeyPadButton4(keyPad);
        keyPadMatrix[1][1]=new KeyPadButton5(keyPad);
        keyPadMatrix[1][2]=new KeyPadButton6(keyPad);
        keyPadMatrix[1][3]=new KeyPadButtonEnter(keyPad);
        
        keyPadMatrix[2][0]=new KeyPadButton7(keyPad);
        keyPadMatrix[2][1]=new KeyPadButton8(keyPad);
        keyPadMatrix[2][2]=new KeyPadButton9(keyPad);
        keyPadMatrix[2][3]=new KeyPadButton(keyPad);
        
        keyPadMatrix[3][0]=new KeyPadButton(keyPad);
        keyPadMatrix[3][1]=new KeyPadButton0(keyPad);
        keyPadMatrix[3][2]=new KeyPadButton(keyPad);
        keyPadMatrix[3][3]=new KeyPadButton(keyPad);
      
          x = 300;
         y = 200;
         for (int r = 0; r < 4; r++) {
             for (int c = 0; c < 4; c++) { 
            addObject(keyPadMatrix[r][c], x, y);
            x+= 50;
        }
        y+=50;
        x=300;
        }
        
        
        PinPlaceHolder phArray[]=new PinPlaceHolder[5];
        for(int i=0;i<5;i++){
        phArray[i]=new PinPlaceHolder();
        }
        
        KeyPadScreen keyPadScreen = new KeyPadScreen(phArray);
        keyPadScreen.xCoordinate=100;
        keyPadScreen.yCoordinate=100;
             addObject(keyPadScreen, -1000, -1000000);
        keyPadScreen.display();
    
        
        keyPad.screen=keyPadScreen;
        
        
    }
}
