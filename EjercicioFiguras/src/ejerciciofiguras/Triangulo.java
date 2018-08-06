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
public class Triangulo implements Figura {
    
    double l1=0;
    double l2=0;
    double l3=0;
    

    public Triangulo(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    
    
    
   
    public double CalcularArea() {
        return l1*l2;
    }

    
   
    public double CalcularPerimetro() {
       return l1+l2+l3;
    }
    
    
    
}
