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
public class BancoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente = new Cliente("Elsa");
        Cliente cliente2 = new Cliente("German");
        Cliente cliente3 = new Cliente("True");
        Cliente cliente4 = new Cliente("Foxes");
        
        Transaccion tran1 = new Transaccion(new int[] {5});
        Transaccion tran2 = new Transaccion(new int[] {2});
        
        long initialTime = System.currentTimeMillis();
        
        Cajero cajero1 = new Cajero("Fex",cliente4,tran1,initialTime);
        Cajero cajero2 = new Cajero("Fox",cliente2,tran2,initialTime);
        Cajero cajero3 = new Cajero("Foxy",cliente3,tran1,initialTime);
            
        cajero1.start();
        cajero2.start();
        cajero3.start();
    }
    
}
