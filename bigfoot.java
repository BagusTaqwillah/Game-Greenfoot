import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bigfoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bigfoot extends Actor
{
    /**
     * Act - do whatever the bigfoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale(22,22);
        gerak();
    }    
    public void gerak()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-2);
            if(nabrak() == true )
            {
             setLocation(getX(), getY()+2);
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+2);
            if(nabrak() == true )
            {
             setLocation(getX(), getY()-2);
            }
        }
        if(Greenfoot.isKeyDown("Right"))
        {
            setLocation(getX()+2,getY());
            if(nabrak() == true )
            {
             setLocation(getX()-2, getY());
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2,getY());
            if(nabrak() == true )
            {
             setLocation(getX()+2, getY());
            }
        }
    }
    public boolean nabrak()
    {
        if(isTouching(pohon.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
