import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bala extends Actor
{
    GifImage bala = new GifImage ("bala.gif");// se abre la imagen
    private int lifetime;
    /**
     * Act - do whatever the bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        setImage(bala.getCurrentImage());// ingresando a la imagen actual de bala
        move (3);//mover con cierta velocidad
        if(isTouching(enemy.class)){// si la bala está tocando a enemix
            removeTouching(enemy.class); // el enemigo desaparecer
        if (isTouching(enemy.class)){
            
        }
        }
        deleteme(); // al tocarlo se elimina
        
    }
    private void deleteme()
    {
     if (++lifetime == 100){
         getWorld().removeObject(this);//despues de 2 segundos la bala desaparece
         return;
     }
    }
    
    }
