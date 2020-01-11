/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClumps;

class Camara {
   
    int nLentes;
    int Mpixeles;

    public Camara(int nLentes, int Mpixeles) {
        this.nLentes = nLentes;
        this.Mpixeles = Mpixeles;
    }

    public int getnLentes() {
        return nLentes;
    }

    public void setnLentes(int nLentes) {
        this.nLentes = nLentes;
    }

    public int getMpixeles() {
        return Mpixeles;
    }

    public void setMpixeles(int Mpixeles) {
        this.Mpixeles = Mpixeles;
    }
    
    
    
}
