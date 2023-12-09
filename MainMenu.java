import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Kelompok 6
 * Dito Hardiansyah
 * Novariyani Nur Ramadhani
 * Sendhy Rhysa 
 */
public class MainMenu extends World
{   
    public MainMenu()
    {    
        super(900, 400, 1);
        setBackground("background.jpg");
        prepare();
    }
    
    private void prepare()
    {
        dino dino = new dino();
        addObject(dino,70,279);
        addObject(new noInternet(), 470, 220);
        dino.alive = false;
        setPaintOrder(noInternet.class, gameOver.class, dino.class, score.class, bird.class, cactus.class, 
            ground.class);
        if (Greenfoot.mouseClicked(dino)) {
                dino.alive = true;
                noInternet.mainmenu = false;
                Greenfoot.setWorld(new MyWorld());
            }
    }
}
