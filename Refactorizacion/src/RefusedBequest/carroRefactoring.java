/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefusedBequest;

/**
 *
 * @author PC-4
 */
public class carroRefactoring extends TransporteRefactoring{

    public carroRefactoring(int nPasajeros) {
        super(nPasajeros);
    }
    
    
    public void drive(){
      System.out.println("Driving");
    }
}
