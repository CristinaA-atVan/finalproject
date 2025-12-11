import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CrabWorld extends World
{
    Random r = new Random();
    /**
     * Create the crab world (the beach). Our world has a size of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        setup();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void setup()
    {
        Worm worm =  new  Worm();
        addObject(worm, r.nextInt(560), r.nextInt(560));
        Worm worm2 =  new  Worm();
        addObject(worm2, r.nextInt(560), r.nextInt(560));
        Worm worm3 =  new  Worm();
        addObject(worm3, r.nextInt(560), r.nextInt(560));
        Worm worm4 =  new  Worm();
        addObject(worm4, r.nextInt(560), r.nextInt(560));
        Worm worm5 =  new  Worm();
        addObject(worm5, r.nextInt(560), r.nextInt(560));
        Worm worm6 =  new  Worm();
        addObject(worm6, r.nextInt(560), r.nextInt(560));
        Crab crab =  new  Crab();
        addObject(crab, r.nextInt(560), r.nextInt(560));
        Worm worm7 =  new  Worm();
        addObject(worm7, r.nextInt(560), r.nextInt(560));
        Worm worm8 =  new  Worm();
        addObject(worm8, r.nextInt(560), r.nextInt(560));
        Lobster lobster =  new  Lobster();
        addObject(lobster, r.nextInt(560), r.nextInt(560));
    }
}
