import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{

    int map [][]={{1,1,1,1,1,1,1,1,1,1,1,1,1,6,1},
                  {1,0,1,0,1,0,1,0,0,0,0,0,1,0,1},
                  {1,0,0,0,1,0,1,1,1,0,0,1,1,0,1},
                  {1,0,0,0,1,0,0,0,1,0,0,0,0,5,1},
                  {1,0,1,0,1,0,0,0,1,0,1,1,1,0,1},
                  {1,0,1,0,1,0,0,1,1,0,0,1,0,0,1},
                  {1,0,1,0,1,0,1,1,0,0,0,0,0,0,1},
                  {1,0,1,0,1,0,0,1,1,1,1,1,0,0,1},
                  {1,2,1,0,1,0,1,0,0,0,0,0,0,0,1},
                  {1,0,1,0,1,0,1,0,1,1,1,0,0,0,1},
                  {1,0,1,0,1,4,1,0,0,4,0,1,1,1,1},
                  {1,0,1,2,0,0,0,1,1,0,0,0,0,0,1},
                  {1,0,1,1,1,1,0,0,1,0,1,1,0,1,1},
                  {3,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
                  {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(450, 450, 1); 
        karaktermasuk();
       Greenfoot.playSound("title.mp3");
    }
    public void karaktermasuk()
    {
        for(int i =0; i<15 ; i++)
            for (int j =0; j<15; j++)
            {
                if(map[i][j]==1 )
                {
                    addObject(new pohon(),15 + j * 30, 15 + i * 30);
                }
                if(map[i][j]==2 )
                {
                    addObject(new madu(),15 + j * 30, 15 + i * 30);
                }
                if(map[i][j]==3 )
                {
                    addObject(new bigfoot(),15 + j * 30, 15 + i * 30);
                }
                if(map[i][j]==4 )
                {
                    addObject(new ular(),15 + j * 30, 15 + i * 30);
                }
                if(map[i][j]==5 )
                {
                    addObject(new ular2(),15 + j * 30, 15 + i * 30);
                }
                if(map[i][j]==6 )
                {
                    addObject(new levelup(),15 + j * 30, 15 + i * 30);
                {
                }
                }
            }
    }
}
