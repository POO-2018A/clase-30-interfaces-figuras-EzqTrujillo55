/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofiguras;

/**
 *
 * @author Ezq
 */
public class Cuadrado implements Figura {
    
   double l=0;

    public Cuadrado(double l) {
        this.l = l;
    }
    
    
    
   @Override
    public double CalcularArea() {
        return l*l;
    }

    
   @Override
    public double CalcularPerimetro() {
       return 4*l;
    }
    
    
    
}
