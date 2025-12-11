import greenfoot.*;

/**
 * This is the player class
 * Version: 2
 * In this version, the crab walks around the beach more or less randomly.
 */
public class Crab extends Actor
{
    int spd;
    public Crab()
    {
        spd = 3;
    }
    /**
     * Act - do whatever the crab wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        eat();
        if (isGameWon()) {
            transitionToGameWonWorld();
            Greenfoot.playSound("fanfare.wav");
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
     * Transition to the game won world
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
    }
}
