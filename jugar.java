import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jugar extends Actor
{
    GifImage botonJ = new GifImage ("BotonJugar.gif");
    /**
     * Act - do whatever the jugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage (botonJ.getCurrentImage());// Add your action code here.
        if(Greenfoot.mouseClicked(this)){//cuando se presiona el boton con un click
            Greenfoot.setWorld(new Pantalla());//redirecciona a la pantalla del juego
        }
        
    }
}
