import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * Version: 2
 * In this version, the crab walks around the beach more or less randomly.
 */
public class Crab extends Actor
{

    /* (World, Actor, GreenfootImage, and Greenfoot)*/

    /**
     * Act - do whatever the crab wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
        if (isGameWon()) {
            transitionToGameWonWorld();
            Greenfoot.playSound("fanfare.wav");
        }
    }

    /**
     * Adds movement and turning
     */
    public void moveAndTurn()
    {
        move(4);
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
    }

    /**
     * Eat worms when they intersect
     */
    public void eat()
    {
        Actor worm = getOneIntersectingObject(Worm.class);
        if (worm != null) {
            World world = getWorld();
            world.removeObject(worm);
            Greenfoot.playSound("slurp.wav");
        }
    }

    /**
     * Check if the game is won or not
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Worm.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Transition to the game won world
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
    }
}
