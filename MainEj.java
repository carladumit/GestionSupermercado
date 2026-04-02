import java.util.ArrayList;

public class Main1 {

    public static ArrayList<Producto> productos = new ArrayList<>();

    public static void main (String args[]) {

        Producto detergente1 = new Detergente("Ariel", 2.34f);
        Producto detergente2 = new Detergente("Ariel", 6.78f);
        Producto cereales1 = new Cereales("Keloggs", 2.44f, "Espelta");
        Producto cereales2 = new Cereales("Eco Cereals", 4.20f, "Arroz");
        Producto vino1 = new Vino("Viñedo", 5.99f, "Tinto", 10);
        Producto vino2 = new Vino("La Mancha", 12.5f, "Blanco", 13);

        productos.add(detergente1);
        productos.add(detergente2);
        productos.add(cereales1);
        productos.add(cereales2);
        productos.add(vino1);
        productos.add(vino2);

        Menu.mostrarProductos(productos);
        Menu.calculaSumaCalorias(productos);
    }
}