import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Prompt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prompt extends Actor
{
    /**
     * Act - do whatever the Prompt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage msg;
    public Prompt(String message)
    {
        msg = new GreenfootImage(message +"\n"+"Prompt Will Dissapear in 300ms",
                                  28, Color.WHITE, Color.BLACK);
    }
    public void act() 
    {
        // Add your action code here.
        setImage(this.msg);
        Greenfoot.delay(300);
        getWorld().removeObject(this);
    }    
}
