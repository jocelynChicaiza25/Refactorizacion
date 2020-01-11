package DataClumps;

public class Celular {

    String Marca;
    String Modelo;
    String Almacenamiento;
    int MpCamaraFrontal;
    int MpCamaraPrincipal;
    int nLentesFrontal;
    int nLentesPrincipal;

    public Celular(String Marca, String Modelo, String Almacenamiento, int MpCamaraFrontal, int MpCamaraPrincipal, int nLentesFrontal, int nLentesPrincipal) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Almacenamiento = Almacenamiento;
        this.MpCamaraFrontal = MpCamaraFrontal;
        this.MpCamaraPrincipal = MpCamaraPrincipal;
        this.nLentesFrontal = nLentesFrontal;
        this.nLentesPrincipal = nLentesPrincipal;
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

    public int getMpCamaraFrontal() {
        return MpCamaraFrontal;
    }

    public void setMpCamaraFrontal(int MpCamaraFrontal) {
        this.MpCamaraFrontal = MpCamaraFrontal;
    }

    public int getMpCamaraPrincipal() {
        return MpCamaraPrincipal;
    }

    public void setMpCamaraPrincipal(int MpCamaraPrincipal) {
        this.MpCamaraPrincipal = MpCamaraPrincipal;
    }

    public int getnLentesFrontal() {
        return nLentesFrontal;
    }

    public void setnLentesFrontal(int nLentesFrontal) {
        this.nLentesFrontal = nLentesFrontal;
    }

    public int getnLentesPrincipal() {
        return nLentesPrincipal;
    }

    public void setnLentesPrincipal(int nLentesPrincipal) {
        this.nLentesPrincipal = nLentesPrincipal;
    }

}
