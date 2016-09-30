/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodelavida;

/**
 *
 * @author adriancast
 */
class Celula {
    
    private Boolean vida;
    private int x;
    private int y;
    
    
    public Celula(int x,int y,Boolean vida){
        this.x=x;
        this.y=y;
        this.vida=vida;
    
    }
    
    

    public Boolean getVida() {
        return vida;
    }

    public void setVida(Boolean vida) {
        this.vida = vida;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}
