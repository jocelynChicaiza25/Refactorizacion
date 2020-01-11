/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClumps;


public class CelularRefactoring {
     String Marca;
    String Modelo;
    String Almacenamiento;
    Camara Principal;
    Camara Frontal;

    public CelularRefactoring(String Marca, String Modelo, String Almacenamiento, Camara Principal, Camara Frontal) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Almacenamiento = Almacenamiento;
        this.Principal = Principal;
        this.Frontal = Frontal;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(String Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    public Camara getPrincipal() {
        return Principal;
    }

    public void setPrincipal(Camara Principal) {
        this.Principal = Principal;
    }

    public Camara getFrontal() {
        return Frontal;
    }

    public void setFrontal(Camara Frontal) {
        this.Frontal = Frontal;
    }
    
    
}
