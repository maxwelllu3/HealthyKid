import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kid here.
 * 
 * @author (maxwelllu3) 
 * @version (V1.0)
 */
public class Kid extends Actor
{
    /**
     * Act - do whatever the Kid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();
        checkCollision();
    }    
    
    /**
     * Check whether a keyboard key has been pressed and react if it has.
     */
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX()+6, getY());
        }
        
        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-6, getY());
        }

    }
    
    /**
     * Check whether we are touching a bacterium or virus. Remove bacteria.
     * Game over if we hit a virus.
     */
    private void checkCollision()
    {
       if (isTouching(Cabbage.class)) 
        {
            Greenfoot.playSound("slurp.wav");
            removeTouching(Cabbage.class);
            HealthyWorld healthyworld = (HealthyWorld)getWorld();
            healthyworld.addHealthLevel(5);
        }

       if (isTouching(Eggplant.class)) 
        {
            Greenfoot.playSound("slurp.wav");
            removeTouching(Eggplant.class);
            HealthyWorld healthyworld = (HealthyWorld)getWorld();
            healthyworld.addHealthLevel(5);
        }
        
       if (isTouching(Onion.class)) 
        {
            Greenfoot.playSound("slurp.wav");
            removeTouching(Onion.class);
            HealthyWorld healthyworld = (HealthyWorld)getWorld();
            healthyworld.addHealthLevel(3);
        }
       if (isTouching(Pizza.class)) 
        {
            Greenfoot.playSound("slurp.wav");
            removeTouching(Pizza.class);
            HealthyWorld healthyworld = (HealthyWorld)getWorld();
            healthyworld.addHealthLevel(-7);
        }
        
       if (isTouching(Cake.class)) 
        {
            Greenfoot.playSound("slurp.wav");
            removeTouching(Cake.class);
            HealthyWorld healthyworld = (HealthyWorld)getWorld();
            healthyworld.addHealthLevel(-10);
        }
        
       if (isTouching(Icecream.class)) 
        {
            Greenfoot.playSound("slurp.wav");
            removeTouching(Icecream.class);
            HealthyWorld healthyworld = (HealthyWorld)getWorld();
            healthyworld.addHealthLevel(-8);
        }
    }
}
