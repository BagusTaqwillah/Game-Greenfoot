import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class selesai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class selesai extends Actor
{
    /**
     * Act - do whatever the selesai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        selesai();
    }    
     public void selesai()
    {
        if(isTouching(bigfoot.class))
        {
           Greenfoot.setWorld(new menang());
        }
    }
}
