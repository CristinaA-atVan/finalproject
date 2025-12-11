import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The title screen
 * 
 * @author Cristina Arnoldo
 * @version 1
 */
public class Title extends World
{
    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        super(560, 560, 1);
        prepare();
    }
    
    public void act()
    {
        waitForInput();
    }
    
    public void showTextWithBigWhiteFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }
    
    public void showTextWithSmallWhiteFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(20);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }
    
    public void waitForInput()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            World game = new CrabWorld();
            Greenfoot.setWorld(game);
        }
    }
    
    public void prepare()
    {
        showTextWithBigWhiteFont("ENDLESS CRAB GAME", 5, 150);
        showTextWithSmallWhiteFont("Press SPACE to play!", 200, 400);
    }
}
