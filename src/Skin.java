public class Skin {

    private String Nombre;
    private String Rareza;

    public Skin(String nombre, String rareza) {
        Nombre = nombre;
        Rareza = rareza;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getRareza() {
        return Rareza;
    }

    public void setRareza(String rareza) {
        Rareza = rareza;
    }
}
