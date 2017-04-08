import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeyPadScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyPadScreen extends Screen
{
    
    private  PinPlaceHolder phArray[]=null;
        GreenfootImage gi;
         String[] pin= new String[5];
    
    public KeyPadScreen(PinPlaceHolder[] phArray){
        this.phArray=phArray;
         gi= new GreenfootImage(100,100);
    setImage(gi);
    }
    
    /**
     * Act - do whatever the KeyPadScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    
     public void display(){
         int x=xCoordinate;
         int y=yCoordinate+50;
         for(int i=0;i<5;i++){
        getWorld().addObject(phArray[i],x,y);
        x=x+100;
       
        }
         
         
    }
    
  
    
   
        public void digitEntered(String key){
           
            int digitsEntered = pin.length;
    pin[digitsEntered+1] = key;
           // gi.clear();
    //gi.setColor( greenfoot.Color.YELLOW );
    //gi.fill();
    gi.setColor(greenfoot.Color.BLACK);
    gi.drawString(key,xCoordinate + ((digitsEntered+1) * 100) ,yCoordinate+10);
    
        }
        
        public void removeDigit(){
              int digitsEntered = pin.length;
         gi.setColor(greenfoot.Color.BLACK);
    gi.drawString("",xCoordinate + ((digitsEntered-1) * 100) ,yCoordinate+10);
     
        pin[digitsEntered-1]=null;
        
        }
}
