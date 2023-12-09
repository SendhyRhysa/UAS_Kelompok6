import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Kelompok 6
 * Dito Hardiansyah
 * Novariyani Nur Ramadhani
 * Sendhy Rhysa 
 */
public class gameOver extends Actor
{
    public void act() 
    {
        dino dino = new dino();
        if (Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("up")){
            dino.alive = true;
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
    public gameOver(){
        setLocation(450, 200);
        setImage("game-over.png");
    }
}
