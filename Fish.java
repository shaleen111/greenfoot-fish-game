import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean facinLeft = false;
    public Fish()
    {
        setImage(new GreenfootImage("fish3.png"));
    }
    public void act() 
    {
           handleKeys();
    }
    
    private void handleKeys()
    {
         if(Greenfoot.isKeyDown("up"))
        {
            setRotation(-90);
            move(2);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(2);
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            if(!facinLeft)
            {
                getImage().mirrorVertically();
                facinLeft=true;
            }
            move(2);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            
            setRotation(0);
            if(facinLeft)
            {
                getImage().mirrorVertically();
                facinLeft = false;
            }
            move(2);
        }
    }
}
