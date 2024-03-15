public class Arma {

    private String Tipo;
    private int Daño;

    public Arma(String tipo, int daño) {
        Tipo = tipo;
        Daño = daño;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getDaño() {
        return Daño;
    }

    public void setDaño(int daño) {
        Daño = daño;
    }
}
