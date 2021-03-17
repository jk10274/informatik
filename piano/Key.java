import greenfoot.*;  // (World, Actor, GreenfootImage und Greenfoot)

public class Key extends Actor
{
    private boolean isDown;
    private String key;
    private String sound;
    /**
     * Erstellt eine neue Taste.
     */
    public Key(String keyName, String soundFile)
    {
        key = keyName;
        sound = soundFile;
    }

    /**
     * Die Aktion fuer diese Taste.
     */
    public void act()
    {
        if (!isDown && Greenfoot.isKeyDown(key)){
            setImage("white-key-down.png");
            isDown = true;
            play();
        }
        if (isDown && !Greenfoot.isKeyDown(key)) {
            setImage("white-key.png");
            isDown = false;
        }
        
    }
    public void play() {
        Greenfoot.playSound(sound);
    }
}

