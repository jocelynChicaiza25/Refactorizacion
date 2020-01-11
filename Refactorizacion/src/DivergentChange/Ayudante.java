/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivergentChange;

public class Ayudante {

    String nombre;
    String cedula;
    String matricula;
    char Tipo;
    int edad;

    public Ayudante(String nombre, String cedula, String matricula, char Tipo, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.matricula = matricula;
        this.Tipo = Tipo;
        this.edad = edad;
    }

    public char getTipo() {
        return Tipo;
    }

    public void setTipo(char Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Si se necesita un nuevo tipo de ayudante se modificaria el metodo
    public void TipoAyudantias() {
        if (Tipo == 'G') {
            System.out.println("Ayudantias de Gestion");

        } else {
            System.out.println("Ayudantias de Docencia");

        }
    }

}
