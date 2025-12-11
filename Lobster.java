import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{
    /**
     * Turn the lobster anywhere between 0-360 degrees
     */
    public Lobster()
    {
        turn(Greenfoot.getRandomNumber(360));
    }

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        removeCrab();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
    }

    /**
     * Move the lobster and make it turn when at the end
     */
    public void moveAround()
    {
        move(2);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * Remove the crab when they intersect
     */
    public void removeCrab()
    {
        Actor crab = getOneIntersectingObject(Crab.class);
        if (crab != null) {
            World world = getWorld();
            world.removeObject(crab);
            Greenfoot.playSound("au.wav");
        }
    }

    /**
     * Check if the game is over
     */
    public boolean isGameOver()
    {
        World world = getWorld();
        if (world.getObjects(Crab.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameOverWorld()
    {
        World gameOverWorld =  new  GameOverWorld();
        Greenfoot.setWorld(gameOverWorld);
    }
}
