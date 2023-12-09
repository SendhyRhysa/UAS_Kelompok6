import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class cactus extends obstacle
{
    private int counter = 0;
    private boolean cactus = true;
    
    public cactus(){
        setImage("cactus-small-2.png");
    }
    
    public void act() 
    {
        if(dino.alive){
            counter++;
            if(cactus){
                randomization();
                cactus = false;
            }
            move(-6 - MyWorld.difficulty);
            if(isAtEdge()){
                cactus = true;
                getWorld().removeObject(this);
            }
        }
    }    
    
    private void randomization(){
        if (Greenfoot.getRandomNumber(4) == 0){
            setImage("cactus-big-1.png");
        }  else {
            setImage("cactus-small-2.png");
        } 
    }
}
