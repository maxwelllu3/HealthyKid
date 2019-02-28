 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * HealthyWorld
 * 
 * 
 * @author (maxwelllu3) 
 * @version (V1.0)
 * 
 * Art assets citations
 * ====================
 * 
 * Background
 * http://clipart-library.com/clipart/kcMKrBBXi.htm
 * 
 * Kid:
 * http://www.iconarchive.com/show/people-icons-by-martin-berube/child-icon.html
 * 
 * Mostly unhealthy foods:
 * http://www.iconarchive.com/show/food-icons-by-martin-berube.html
 * http://www.iconarchive.com/show/food-icons-by-martin-berube/pop-corn-icon.html
 * http://www.iconarchive.com/show/swarm-icons-by-sonya/Pizza-icon.html
 * http://www.iconarchive.com/show/tasty-bites-icons-by-pixelkit.html
 * 
 * Mostly healthy foods:
 * http://www.iconarchive.com/show/vegetables-icons-by-fengsj.html
 * 
 */
public class HealthyWorld extends World
{
    /**
     * Fields (instance variables)
     */
    private int healthLevel;
    private int time;
    
    /**
     * Constructor for objects of class HealthyWorld.
     * 
     */
    public HealthyWorld()
    {   
        // Create a new wolrd with 800x400 cells and a cell size of 1x1 pixels
        super(800, 400, 1);
        healthLevel = 10;
        time = 2000;
        showHealthLevel();
        showTime();
        // Create a kid in the middle of the screen
        Kid theKid = new Kid();
        this.addObject(theKid, 400, 350);
    }
    
    /**
     * Create new floating objects at irregular intervals.
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(200) < 3)
        {
            addObject(new Cabbage(), Greenfoot.getRandomNumber(600), 0);
        }
        
        if (Greenfoot.getRandomNumber(200) < 3)
        {
            addObject(new Eggplant(), Greenfoot.getRandomNumber(600), 0);
        }
        
        if (Greenfoot.getRandomNumber(200) < 3)
        {
            addObject(new Onion(), Greenfoot.getRandomNumber(600), 0);
        }
        
        if (Greenfoot.getRandomNumber(300) < 3)
        {
            addObject(new Pizza(), Greenfoot.getRandomNumber(600), 0);
        }
        
        if (Greenfoot.getRandomNumber(400) < 3)
        {
            addObject(new Cake(), Greenfoot.getRandomNumber(600), 0);
        }
        
        if (Greenfoot.getRandomNumber(400) < 3)
        {
            addObject(new Icecream(), Greenfoot.getRandomNumber(600), 0);
        }
        countTime();
    }
    
    /**
     * Add some points to our current score. (May be negative.)
     * If the score falls below 0, game's up.
     */
    public void addHealthLevel(int points)
    {
        healthLevel = healthLevel + points;
        showHealthLevel();
        if (healthLevel < 0) 
        {
            Greenfoot.playSound("game-over.wav");
            Greenfoot.stop();
        }
    }
    
    /**
     * Show our current score on screen.
     */
    private void showHealthLevel()
    {
        showText("Health Level: " + healthLevel, 120, 25);
    }
    
    /**
     * Count down the game time and display it. Stop the game 
     * with a winning message when time is up.
     */
    private void countTime()
    {
        time--;
        showTime();
        if (time == 0)
        {
            showEndMessage();
            Greenfoot.stop();
        }
    }
    
    /**
     * Show the remaining game time on screen.
     */
    private void showTime()
    {
        showText("Time: " + time, 700, 25);
    }
    
    /**
     * Show the end-of-game message on screen.
     */
    private void showEndMessage()
    {
        showText("Time is up - you win!", 390, 150);
        showText("Your final score: " + healthLevel + " points", 390, 170);
    }
}
