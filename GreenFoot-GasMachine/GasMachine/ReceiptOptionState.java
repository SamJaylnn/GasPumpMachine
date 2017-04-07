import greenfoot.*;  

/**
 * If Car Wash option is "NO", Ask customers if they want their receipt.
 *
 */

public class ReceiptOptionState extends State 
{
    final String OPTION_MESSAGE = "Would you like to keep your receipt?";
    final String YES_OPTION = "YES";
    final String NO_OPTION = "NO";
    
    private boolean answer;
    
    /**
     * Constructor 
     */
    public ReceiptOptionState() 
    {
        answer = false;
    }
    
    /**
     * Provide options ("YES" or "NO") on the screenboard.
     */
    public void showOption() 
    {
        setMessage(OPTION_MESSAGE);
    }
    
    /**
     * Set answer according to customer's choice (Pressed "YES" or "NO").
     */
    public void setAnswer() 
    {
        /*HOW TO INTERACT WITH SCREENBOARD TO GET USER CHOICE????*/
    }
    
    /**
     * Call this function to check if the customer needs the receipt or not.
     */
    public boolean needsReceipt() 
    {       
        return answer;
    }
}


