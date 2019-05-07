import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        spawnPlastic(5);
        spawnBug(5);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Fish fish = new Fish();
        addObject(fish,265,176);
    }
    
    private void spawnPlastic(int quantity)
    {
        for(int i = 0; i < quantity; i++)
        {
            do
            {
                int x = Greenfoot.getRandomNumber(getWidth());
                int y = Greenfoot.getRandomNumber(getHeight());   
                Plastic plastic = new Plastic();
                addObject(plastic, x, y);
                if(!plastic.colliding(Fish.class) && !plastic.colliding(Bug.class)
                   && !plastic.colliding(Plastic.class))
                {
                    break;
                }
                else
                {
                    removeObject(plastic);
                }
            } while (true);
        }
    }
    
    private void spawnBug(int quantity)
    {
        for(int i = 0; i < quantity; i++)
        {
            do
            {
                int x = Greenfoot.getRandomNumber(getWidth());
                int y = Greenfoot.getRandomNumber(getHeight());   
                Bug bug = new Bug();
                addObject(bug, x, y);
                if(!bug.colliding(Fish.class) && !bug.colliding(Bug.class)
                   && !bug.colliding(Plastic.class))
                {
                    break;
                }
                else
                {
                    removeObject(bug);
                }
            } while (true);
        }
    }
}
