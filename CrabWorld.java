import greenfoot.*;

/**
 * 
 */
public class CrabWorld extends World
{

    /* (Actor, World, Greenfoot, GreenfootImage)*/

    /**
     * Create the crab world (the beach). Our world has a size of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Worm worm =  new  Worm();
        addObject(worm, 58, 65);
        Worm worm2 =  new  Worm();
        addObject(worm2, 389, 207);
        Worm worm3 =  new  Worm();
        addObject(worm3, 177, 171);
        Worm worm4 =  new  Worm();
        addObject(worm4, 462, 440);
        Worm worm5 =  new  Worm();
        addObject(worm5, 233, 394);
        Worm worm6 =  new  Worm();
        addObject(worm6, 91, 493);
        Crab crab =  new  Crab();
        addObject(crab, 110, 318);
        Worm worm7 =  new  Worm();
        addObject(worm7, 514, 301);
        Worm worm8 =  new  Worm();
        addObject(worm8, 460, 49);
        Lobster lobster =  new  Lobster();
        addObject(lobster, 481, 127);
    }
}
