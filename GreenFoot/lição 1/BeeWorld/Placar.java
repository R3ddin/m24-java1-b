import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta classe vai representar o placar no jogo BeeWorld
 * 
 * @author Nicolas Afonso 
 * @version 2024-05-11
 */
public class Placar extends Actor
{
    //Fields ou Campos ou Variaveis de instância
    private String texto;
    private int tamanhoTexto;
    private Color corFonte;
    //Constructor
    public Placar (){
        texto = "Score: 0";
        tamanhoTexto = 30;
        corFonte = Color.RED;
        atualizarImagem();
    }
    //Getters(acessadores de campos) e Setler (modificadores de campos)
    public String getTexto() {
        return texto;
    }
    public void setTexto(String value) {
        texto = value;
        atualizarImagem();
    }
    /**
     * Act - do whatever the Placar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void atualizarImagem() {
        GreenfootImage img = new GreenfootImage(tamanhoTexto * texto.length(), tamanhoTexto);
        img.setColor(corFonte);
        //                      NomeFonte, bold, Italic, tamanho
        img.setFont(new Font ("Arial", true, false, tamanhoTexto));
        img.drawString(texto, 0, tamanhoTexto);
        setImage(img);
    }
}
