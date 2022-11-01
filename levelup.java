import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class levelup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class levelup extends Actor
{
    /**
     * Act - do whatever the levelup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale(25,25);
        naiklevel();
    }    
     public void naiklevel()
    {
        if(isTouching(bigfoot.class))
        {
           Greenfoot.setWorld(new level2());
        }
   }
}
