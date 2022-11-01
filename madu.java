import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class madu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class madu extends Actor
{
    /**
     * Act - do whatever the madu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale(23,23);
        if(isTouching(bigfoot.class))
        {
           getWorld().removeObject(this);
           Greenfoot.playSound("makan.wav");
        }
    }    
}
