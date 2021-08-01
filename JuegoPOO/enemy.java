import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    Pantalla thisGame;
    //public static int score = 0;
    GifImage enemy = new GifImage ("enemix.gif"); //se abre la imagen de enemigo
    /**
     * Act - do whatever the enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(enemy.getCurrentImage());// Add your action code here.
        move(-1); //indica la velocidad con la que se está moviendo hacia el lado de la nave
        if (isAtEdge()){
            setLocation(600,getY());
        }
        
        Actor bala = getOneIntersectingObject(bala.class);
        if (bala != null){
            thisGame.score ++;
        }

    }
    
}


