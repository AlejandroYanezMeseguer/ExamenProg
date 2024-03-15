import libreria.MostrarDatos.MostrarDatos;

import java.util.ArrayList;

public class FortniteManagerImpl implements IFortniteManager{

    ArrayList<String> inventarioArmas = new ArrayList<>();
    ArrayList<String> inventarioSkins = new ArrayList<>();

    @Override
    public void agregarArma(Arma arma) {
        inventarioArmas.add("arma");
    }

    @Override
    public void agregarSkin(Skin skin) {
        inventarioSkins.add("skin");
    }

    @Override
    public void buscarArmaPorTipo(String tipo) {
        for (String inventarioArmas : inventarioArmas) {
            MostrarDatos.MostrarString(inventarioArmas);
        }

    }

    @Override
    public void mostrarSkinsPorRareza(String rareza) {
        for (String inventarioSkins : inventarioSkins) {
            MostrarDatos.MostrarString(inventarioSkins);
        }
    }

    @Override
    public void eliminarArma(String tipo) {
        inventarioArmas.remove(1);
    }

    @Override
    public void eliminarSkin(String nombre) {
        inventarioSkins.remove(1);
    }
}
