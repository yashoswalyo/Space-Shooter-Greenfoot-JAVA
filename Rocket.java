import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    boolean canFire=true;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Rocket()
    {
    }
    public void act() 
    {
        moveAround();
        fireProjectile();// Add your action code here.
    }   
    public void moveAround()
    {  
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5,getY()); 
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5,getY()); 
        }
    }
    public void fireProjectile()
    {
        if(Greenfoot.isKeyDown("space") && canFire==true)
        {
            getWorld().addObject(new Projectile(),getX(),getY()-60);
            canFire=false;
        }
        if(!Greenfoot.isKeyDown("space"))
        {
            canFire=true;
        }
    }
}   
