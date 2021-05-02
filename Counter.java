import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int score = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Counter()
    {
        setImage(new GreenfootImage("Score: " + score,40,Color.YELLOW,Color.BLACK));
    }

    public void act() 
    {
        setImage(new GreenfootImage("Score: " + score,40,Color.YELLOW,Color.BLACK));
        youWin();
    }

    public void addScore()
    {
        score = score + 1;
    }

    public void youWin()
    {
        if (score>=50)
        {
            getWorld().addObject(new YouWin(),350,300);
            Greenfoot.stop();
        }
    }
}