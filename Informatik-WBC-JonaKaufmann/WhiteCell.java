import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Dies ist eine weiße Blutzelle. Diese Zellart hat die Aufgabe, Bakterien   
 * abzufangen und aus dem Blut zu entfernen.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class WhiteCell extends Actor
{
  private int score;
  private int health = 3;
  private int speed = 50;
  private int speedCounter;
    /**
     * Aktion: auf- und abbewegen, wenn Pfeiltasten gedrückt werden.
     */
    public void act() 
    {
        Greenfoot.setSpeed(speed);
        getWorld().showText("Punkte: "+ score, 100, 30);
        getWorld().showText("Leben:", 250, 30);
        checkKeyPress();
        checkCollision();
        if (health==0) {
         lost();   
        }
        setLifeSymbols();
    }
    
    /**
     * Prüft, ob eine Taste auf der Tastatur gedrückt wurde, und
     * reagiert, falls dies zutrifft.     
     */
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-4);
        }
        
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+4);
        }
    }
    public void checkCollision()
    {
        if(isTouching(Bacteria.class)) {
            removeTouching(Bacteria.class);
            Greenfoot.playSound("slurp.wav");
            score = score + 1;
            speedCounter = speedCounter + 1;
            if (speedCounter == 5) {
                if (speed < 58) {
                speed = speed + 1;
                Greenfoot.setSpeed(speed);
            }
        }
            if (speedCounter == 10) {
                if (speed < 58) {
                speed = speed + 1;
                Greenfoot.setSpeed(speed);
            }
        }
            if (speedCounter == 15) {
                if (speed < 58) {
                speed = speed + 1;
                Greenfoot.setSpeed(speed);
            }
        }
            if (speedCounter == 25) {
                if (speed < 58) {
                speed = speed + 1;
                Greenfoot.setSpeed(speed);
            }
        }
            if (speedCounter == 40) {
                if (speed < 58) {
                speed = speed + 1;
                Greenfoot.setSpeed(speed);
            }
        }
            if (speedCounter == 65) {
                if (speed < 58) {
                speed = speed + 1;
                Greenfoot.setSpeed(speed);
            }
        }
            if (speedCounter == 105){
                if (speed < 58)
                {
                speed = speed + 1;
                Greenfoot.setSpeed(speed);
            }
        }
            if (speedCounter == 170) {
                if (speed < 58) {
                speed = speed + 1;
                Greenfoot.setSpeed(speed);
            }
        }
        }
        
        if(isTouching(Virus.class)) {
            removeTouching(Virus.class);
            Greenfoot.playSound("au.wav");
            health = health - 1;
        }
        
        if(isTouching(RedCell.class)) {
            removeTouching(RedCell.class);
            health = health + 1;
            if (health>=5) {
                health = 5; 
            }
        }
    }
    public void lost()
    {   
        getWorld().showText("", 100, 30);
        getWorld().showText("", 250, 30);
        Greenfoot.playSound("game-over.wav");
        getWorld().showText("Gameover", 400, 180);
        getWorld().showText("Punkte: "+ score, 400, 210);
        removeLifeSymbols();
        greenfoot.Greenfoot.stop();
    }
    
    public void setLifeSymbols()
    {   
        removeLifeSymbols();
        if (health == 1) {
                getWorld().addObject(new LifeSymbol(), 320, 30);
        }
        if (health == 2) {
                getWorld().addObject(new LifeSymbol(), 320, 30);
                getWorld().addObject(new LifeSymbol(), 380, 30);
        }
        if (health == 3) {
                getWorld().addObject(new LifeSymbol(), 320, 30);
                getWorld().addObject(new LifeSymbol(), 380, 30);
                getWorld().addObject(new LifeSymbol(), 440, 30);
        }
        if (health == 4) {
                getWorld().addObject(new LifeSymbol(), 320, 30);
                getWorld().addObject(new LifeSymbol(), 380, 30);
                getWorld().addObject(new LifeSymbol(), 440, 30);
                getWorld().addObject(new LifeSymbol(), 520, 30);
        }
        if (health == 5) {
                getWorld().addObject(new LifeSymbol(), 320, 30);
                getWorld().addObject(new LifeSymbol(), 380, 30);
                getWorld().addObject(new LifeSymbol(), 440, 30);
                getWorld().addObject(new LifeSymbol(), 520, 30);
                getWorld().addObject(new LifeSymbol(), 580, 30);
        }
    
    }
    
    public void removeLifeSymbols()
    {   
        getWorld().removeObjects(getWorld().getObjects(LifeSymbol.class));
    
    }
}