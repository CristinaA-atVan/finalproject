import lang.stride.*;
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
        replaceWorm();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
    }

    /**
     * Move the lobster and make it turn when at the end
     */
    public void moveAround()
    {
        move(4);
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
     * Replace worms with lobsters on intersection
     */
    public void replaceWorm()
    {
        Actor worm = getOneIntersectingObject(Worm.class);
        Actor lobster =  new  Lobster();
        if (worm != null) {
            World world = getWorld();
            world.removeObject(worm);
            getWorld().addObject(lobster, getX(), getY());
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
