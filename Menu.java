import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    private GreenfootSound audio;
    private int opcion= 0;

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepararMundo();
        audio = new GreenfootSound("hopex.wav");
    }
    private void prepararMundo(){
        addObject(new jugar(), 500, 300);
        addObject(new salir(), 500, 350);
        


    }
    public void act(){
        if (Greenfoot.isKeyDown ("UP") && opcion!=0){opcion++;}
        if (Greenfoot.isKeyDown ("DOWN") && opcion!=0){opcion--;}
        if (opcion>=2) opcion=0;
        if (opcion<=0) opcion=1;
        
        
        
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0://jugar
                    Greenfoot.setWorld(new Pantalla());
                    break;
                case 1://salir del juego
                    Greenfoot.stop();
                    break;
            }
        }
    }
    public void started() {
         audio.playLoop();
        }
}
