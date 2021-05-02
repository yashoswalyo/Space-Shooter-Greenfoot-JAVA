import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    boolean bossIn = false;
    HealthBar healthBar = new HealthBar();
    Counter counter = new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        prepare();
    }

    public Counter getCounter()
    {
        return counter;
    }

    public HealthBar getHealthBar()
    {
        return healthBar;
    }

    public void act()
    {
        addEnemy1();
        addEnemy2();
        boss();
    }

    public void addEnemy1()
    {
        if(Greenfoot.getRandomNumber(120)<1)
        {
            addObject(new Enemy1(), Greenfoot.getRandomNumber(700),0);
        }
    }
    public void boss()
    {
        int i = counter.score;
        if((i+1)%10==0 && bossIn==false)
        {
            addObject(new Boss(),350,0);
            bossIn=true;
        }
    }
    public void bossTrue()
    {
        bossIn=false;
    }
    public void addEnemy2()
    {
        if(Greenfoot.getRandomNumber(200)<1)
        {
            addObject(new Enemy2(), Greenfoot.getRandomNumber(700),0);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(healthBar,119,80);
        addObject(counter,119,40);
        Rocket rocket = new Rocket();
        addObject(rocket,350,550);

    }
}
