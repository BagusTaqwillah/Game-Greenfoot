import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ular2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ular2 extends Actor
{
    int x = 2;
    /**
     * Act - do whatever the ular2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale(25,25);
        setLocation(getX()+x, getY());
        if(isTouching(pohon.class))
        {
            x=-x;
        }
        gameover();
    }  
     public void gameover()
    {
        if(isTouching(bigfoot.class))
        {
           Greenfoot.setWorld(new over());
        }
    }
}
