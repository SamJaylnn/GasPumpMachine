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
        GreenfootImage gi= new GreenfootImage(100,100);
         String[] pin= new String[5];
         int currentPosition=0;
    
    public KeyPadScreen(PinPlaceHolder[] phArray){
        this.phArray=phArray;
        
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
           if(currentPosition+1 <5){
            currentPosition=currentPosition+1;
           
    pin[currentPosition] = key;
           // gi.clear();
    //gi.setColor( greenfoot.Color.YELLOW );
    //gi.fill();
    gi.setColor(greenfoot.Color.BLACK);
    System.out.println(key);
    gi.drawString(key,xCoordinate + ((currentPosition) * 40) ,yCoordinate+10);
}
    
        }
        
        public void removeDigit(){
            if(currentPosition-1 >0){
             currentPosition=currentPosition-1;
         gi.setColor(greenfoot.Color.BLACK);
    gi.drawString("",xCoordinate + ((currentPosition) * 100) ,yCoordinate+10);
     
        pin[currentPosition]=null;
    }
        }
}
