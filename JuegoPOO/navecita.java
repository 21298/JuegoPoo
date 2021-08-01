import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class navecita extends Actor
{
    Pantalla thisGame;

    GifImage nave = new GifImage("navecita.gif");
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    /**
     * @atribute - 
    */
    //World w;
    int posX;
    int posY;
    
    public navecita()
    {
        setRotation(0);  //indicar la rotacion de la imagen para que esté apuntando hacie el este
    }
    
    public void act() 
    {
        // Add your action code here.
        //w = getWorld();
        actualizarPosicion(); //mover a la posición inicial de partida
        setImage(nave.getCurrentImage());
        disparador(); //se declara la variable que ayudara para que la nave dispare
        
    }
    
    /**
     * Este medodo se encarga de actulizar la posición de la Nave acorde a la tecla presionada
     * 
     */   
    public void actualizarPosicion()
    {
        posX = getX();
        posY = getY();
        
        //los indicadores a continuación muestran los movimientos de la nave para arriba y para abajo con las flechas de dirección          
        if( Greenfoot.isKeyDown( "down" ) )
            posY += 3;            
        else if( Greenfoot.isKeyDown( "up" ) )
            posY -= 3;
            
        setLocation( posX, posY );
    }
    public void disparador()
    {
        if(Greenfoot.isKeyDown("z"))
        {
            Launch ();
        }//crea una objeto de clase mundo y la coloca en el mundo actual
        
            
    }
    long lastAdded = System.currentTimeMillis();
    public void Launch ()
    {
        World w = getWorld();
        bala ammo = new bala ();
        
        long curTime = System.currentTimeMillis();
        
        if (curTime  >= lastAdded + 100){
            w.addObject(new bala(), getX()+50, getY());
            lastAdded = curTime;
        }
    }
}

