/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchStatements;

public class Animal {

    String tipo;

    public void atacar() {
        switch (tipo) {
            case "Cat":
                System.out.println("Scratch");
                break;
            case "Dog":
                System.out.println("Bite");
                break;
            case "Wildebeest":
                System.out.println("Headbutt");
                break;
                
        }
    }

}
