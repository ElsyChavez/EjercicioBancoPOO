/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopoo;

/**
 *
 * @author kevit
 */
public class Transaccion {
    private int[] tiempo;
    
    public Transaccion() {
    }
    public Transaccion(int[] tiempo) {
        this.tiempo = tiempo;
    }
    
    public int[]  getTiempo() {
        return tiempo;
    }

    public void setTiempo(int[] Tiempo) {
        this.tiempo = Tiempo;
    }
    
}
