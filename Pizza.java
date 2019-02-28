import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (maxwelllu3) 
 * @version (V1.0)
 */
public class Pizza extends Actor
{
    /** 
     * Fields
     */
    private int healthValue;
    private int speed;
    
    /**
     * Constructor
     * 
     * The constructor should initialize all fields for a class.
     */
    public Pizza()
    {
        healthValue = -7;
        speed = 1;
    }
    
    /**
     * Act - do whatever the Cabbage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY()+8);
        
        if ( isAtEdge()) 
        {
            HealthyWorld healthyworld = (HealthyWorld)getWorld();
            healthyworld.removeObject(this);
        }
    }
    
    /**
     * Returns the point value for this food item.
     */
    public int getHealthValue()
    {
        return healthValue;
    }
}