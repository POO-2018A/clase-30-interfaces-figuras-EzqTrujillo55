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
public class Circulo implements Figura {
    
    double r=0;

    public Circulo (double r) {
        this.r = r;
    }
    
    
    
   @Override
    public double CalcularArea() {
        return 2*pi*r;
    }

    
   @Override
    public double CalcularPerimetro() {
       return pi*r*r;
    }
    
    
}
