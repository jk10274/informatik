import greenfoot.*;  // (World, Actor, GreenfootImage und Greenfoot)

/**
 * Ein Klavier, das mit der Computertastatur gespielt werden kann.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Erzeugt das Klavier.
     */
    public Piano() 
    {
        super(800, 340, 1);
        makeKeys();
    }
    
    /**
     * 
     */
    public void makeKeys() 
    {
        int i = 0;
        
        while (i < 12)
        {
            addObject(new Key("f", "3a.wav"), i*63, 140);
            i = i + 1;
        }   
    }
}