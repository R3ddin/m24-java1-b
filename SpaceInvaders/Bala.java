import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa a Bala no jogo.
 * 
 * @author Nicolas Afonso 
 * @version 2024-04-27
 */
public class Bala extends Actor
{
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() -5);
        removerAlien();
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
    /**
     * Método que verifica se a bala atingiu o alien e remove-o se atingido.
     */
    public void removerAlien() {
        if (isTouching(Alien.class)) {
            removeTouching(Alien.class);
            //Criando um novo alien
            getWorld().addObject(new Alien(),
            Greenfoot.getRandomNumber(getWorld().getWidth()), 50);
        }
    }
}
