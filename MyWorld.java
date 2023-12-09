import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Kelompok 6
 * Dito Hardiansyah
 * Novariyani Nur Ramadhani
 * Sendhy Rhysa 
 */
public class MyWorld extends World
{
    private int counter = 0;
    private int counterDif = 0;
    private int counterGround = 0;
    private int worldSpeed = 50;
    private int random;
    static public int difficulty = 0;
    private boolean startTime = true;
       
    public void act(){
        counter++;
        counterDif++;
        counterGround++;
        if (startTime){
            difficulty = 0;
            if (counter >= 180){
                counter = 0;
                counterGround = 0;
                random = Greenfoot.getRandomNumber(15);
                startTime = false;
                addObject(new cactus(), 900,280);
            }
        } else if (counter >= (90+random)-(int)(1.7*(double)difficulty)){
            counter = 0;
            random = Greenfoot.getRandomNumber(15);
            if (Greenfoot.getRandomNumber(3) == 0){
                addObject(new bird(), 900,Greenfoot.getRandomNumber(190)+80);
            } else{
                addObject(new cactus(), 900,280);
            }
        }
                
        if (counterDif >= 100){
            difficulty++;
            if (difficulty > 50){
                difficulty = 50;
            }
            counterDif = 0;
        }
    }

    public MyWorld()
    {    
        super(900, 400, 1); 
        prepare();
        setBackground("background.jpg");
        Greenfoot.setSpeed(worldSpeed);
    }    
    
    private void prepare()
    {
        dino dino = new dino();
        addObject(dino,70,279);
        addObject(new score(), 820, 35);
        addObject(new ground(), 376, 303);
        addObject(new ground(), 800, 303);
        setPaintOrder(gameOver.class, dino.class, score.class, bird.class, cactus.class, 
                       ground.class);
    }
}
