import greenfoot.*;

/**
 * This is the player class
 * Version: 1
 */
public class Crab extends Actor
{
    int spd;
    public Crab()
    {
        spd = 2;
    }
    
    /**
     * All the methods are here yippee
     */
    public void act()
    {
        move();
        eat();
        if (isGameWon()) {
            transitionToNextLevel();
        }
    }

    /**
     * Adds movement and turning
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX()-spd, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX()+spd, getY());
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-spd);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+spd);
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
     * Transition to the next level
     */
    public void transitionToNextLevel()
    {
        World world = new CrabWorld();
        Greenfoot.setWorld(world);
    }
}
