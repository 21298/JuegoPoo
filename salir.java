import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class salir extends Actor
{
    GifImage botonS = new GifImage ("BotonSalir.gif");
    /**
     * Act - do whatever the jugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage (botonS.getCurrentImage());// Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.stop();
        }
            
    }
}
