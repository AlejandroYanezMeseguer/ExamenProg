import libreria.LeerDatos.LeerDatosJOP;
import libreria.MostrarDatos.MostrarDatos;

public class MenuSeleccion {

    public void menu(){

        int bucle=1;

        while (bucle==1){
            FortniteManagerImpl fmi = new FortniteManagerImpl();

            int opcion = LeerDatosJOP.LeerInt("Elije la Opcion que quieres hacer\n\n" +
                    "1-Agregar un arma a tu inventario\n" +
                    "2-agregar una skin a tu inventario\n" +
                    "3-Mostrar tus armas\n" +
                    "4-Mostrar tus skins\n" +
                    "5-eliminar un arma\n" +
                    "6-eliminar ena skin\n" +
                    "7-salir del programa");

            switch (opcion) {

                case 1: {
                    MostrarDatos.MostrarString("Arma añadida");
                    fmi.agregarArma(new Arma("escopeta", 200));
                    break;
                }
                case 2: {
                    MostrarDatos.MostrarString("skin añadida");
                    fmi.agregarSkin(new Skin("tronchamulas", "legendaria"));
                    break;
                }
                case 3: {
                    fmi.buscarArmaPorTipo("escopeta");
                    break;
                }
                case 4: {
                    fmi.mostrarSkinsPorRareza("legendaria");
                    break;
                }
                case 5: {
                    MostrarDatos.MostrarString("Arma eliminada");
                    fmi.eliminarArma("escopeta");
                    break;
                }
                case 6: {
                    MostrarDatos.MostrarString("Skin eliminada");
                    fmi.eliminarSkin("tronchamulas");
                    break;
                }
                case 7:{
                    MostrarDatos.MostrarString("saliendo del programa");
                    bucle=2;
                    break;
                }
            }
        }
    }
}
