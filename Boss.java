import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Enemy
{
    int hitCount=6;
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Boss()
    {
    }   
    public void act() 
    {
        moveEnemy();
        hitByProjectile();
    }
    public void hitByProjectile()
    {
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if(projectile != null)
        {
            getWorld().removeObject(projectile);
            hitCount--;
        }
        else removeEnemy();
        if (hitCount==0)
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
            counter.addScore();
            counter.addScore();
            getWorld().removeObject(this);
            myWorld.bossTrue();
        }
    }
}
