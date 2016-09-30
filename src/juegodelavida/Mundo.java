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
public class Mundo {
    private final int DIM_TAB = 10;
    private Celula[][] celulas = new Celula[DIM_TAB][DIM_TAB];
    
    public Mundo(){
        iniCelulas();
        this.imprimirMundo();
    }

    private void iniCelulas() {
        for (int i = 0; i < DIM_TAB; i++) {
            for (int j = 0; j < DIM_TAB; j++) {
                celulas[i][j] = null;
            }
        }
}

  
    public void imprimirMundo() {
      
         for (int i = 0; i < DIM_TAB; i++) {
            for (int j = 0; j < DIM_TAB; j++) {
                if(celulas[i][j] != null){
                System.out.print("X");
                   
                }else{
                    System.out.print("O");
                }
                System.out.print(" ");
            }
             System.out.print("\n");
        }
        
        
        
    }
    
}
