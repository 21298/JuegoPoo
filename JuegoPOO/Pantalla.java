import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pantalla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pantalla extends World
{
    public static int lives = 3;
    public static int score = 0;

    /**
     * Constructor for objects of class Pantalla.
     * 
     */
    public Pantalla()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new navecita(), 100, 200);
        prepare();
    }
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        enemy enemy = new enemy();
        addObject(enemy,502,150);
        enemy enemy2 = new enemy();
        addObject(enemy2,593,206);
        enemy enemy3 = new enemy();
        addObject(enemy3,568,381);
        enemy3.setLocation(513,306);
        enemy enemy4 = new enemy();
        addObject(enemy4,513,306);
        enemy.setLocation(574,94);
        enemy enemy5 = new enemy();
        addObject(enemy5,574,94);
        enemy4.setLocation(466,245);
        enemy enemy6 = new enemy();
        addObject(enemy6,466,245);
        enemy4.setLocation(444,354);
        enemy enemy7 = new enemy();
        addObject(enemy7,694,382);
        enemy4.setLocation(452,356);
        enemy enemy8 = new enemy();
        addObject(enemy8,698,544);
        enemy8.setLocation(696,542);
        enemy8.setLocation(615,554);
        enemy3.setLocation(565,474);
        enemy4.setLocation(611,318);
        enemy6.setLocation(710,40);
        enemy2.setLocation(548,203);
        enemy.setLocation(615,120);
        enemy5.setLocation(777,147);
        salir2 salir2 = new salir2();
        addObject(salir2,766,586);
        enemy8.setLocation(661,238);
        enemy3.setLocation(684,491);
        enemy8.setLocation(722,245);
        enemy5.setLocation(822,172);
        enemy5.setLocation(778,159);
        enemy6.setLocation(759,11);
        enemy.setLocation(712,76);
        enemy2.setLocation(766,310);
        enemy3.setLocation(764,521);
        enemy7.setLocation(660,459);
        enemy4.setLocation(711,389);
        enemy8.setLocation(717,237);
        enemy2.setLocation(751,297);
        enemy4.setLocation(774,443);
        enemy7.setLocation(790,357);
        enemy2.setLocation(778,271);
        enemy8.setLocation(769,192);
        enemy5.setLocation(705,120);
        enemy.setLocation(714,398);
        enemy6.setLocation(766,84);

        lives = 3; // reset counter
        score = 0;
        bala bala=new bala();
        addObject(bala,100,200);

        pared pared = new pared();
        addObject(pared,25,391);
        pared pared2 = new pared();
        addObject(pared2,25,207);
        enemy enemy9 = new enemy();
        addObject(enemy9,679,234);
        enemy enemy10 = new enemy();
        addObject(enemy10,694,51);
        enemy enemy11 = new enemy();
        addObject(enemy11,683,501);
        enemy enemy12 = new enemy();
        addObject(enemy12,664,297);
        enemy enemy13 = new enemy();
        addObject(enemy13,638,162);
        enemy enemy14 = new enemy();
        addObject(enemy14,605,74);
        enemy enemy15 = new enemy();
        addObject(enemy15,609,370);
        enemy enemy16 = new enemy();
        addObject(enemy16,622,438);
        enemy enemy17 = new enemy();
        addObject(enemy17,607,534);
    }

    public void act()
    {
        addEnemy();
        showText("Vidas restantes: " + lives, 100,25 );
        showText("Punteo: " + score, 500,25 );
        if (score >= 4  ){
            Greenfoot.setWorld(new win());
 
        }
        
    long curTime  = System.currentTimeMillis();
    
    
    }
    public void addEnemy(){
        if(Greenfoot.getRandomNumber (60)< 1){
            addObject(new enemy(), Greenfoot.getRandomNumber(600), 0);
        }
    }
      
    
}
