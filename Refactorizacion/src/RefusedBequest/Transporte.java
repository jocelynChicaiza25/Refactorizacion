/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefusedBequest;

public class Transporte {

    int nPasajeros;

    public Transporte(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    
    // Metodo solo para transportes terrestres
    public void drive() {
        System.out.print("Driving");
    }

}
