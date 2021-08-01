import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class salir2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class salir2 extends Actor
{
    GifImage boton2 = new GifImage ("salir2.gif");
    /**
     * Act - do whatever the salir2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //
        setImage (boton2.getCurrentImage());
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Menu());
        }
    
    }
}

