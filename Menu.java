import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static ArrayList<Producto> productos = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void mostrarMenu(int opcion) {
        while (opcion != 4) {
            System.out.println("----------------------------");
            System.out.println("        SUPERMERCADO        ");
            System.out.println("----------------------------");
            System.out.println("[1] Registrar un producto");
            System.out.println("[2] Mostrar productos");
            System.out.println("[3] Calcular calorías totales");
            System.out.println("[4] Salir");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    registrarProducto();
                    break;

                case 2:
                    mostrarProductos(productos);
                    break;

                case 3:
                    calculaSumaCalorias(productos);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        }
    }

    public static void registrarProducto() {
        System.out.println("Selecciona un tipo de producto: " +
                "1.Detergente " +
                "2.Cereales " +
                "3.Vino");
        int tipoProducto;

        while (true) {
            try {
                tipoProducto = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número válido (1-3).");
            }
        }

        switch(tipoProducto) {
            case 1:
                Producto detergente = new Detergente(registrarMarca(), registrarPrecio());
                productos.add(detergente);
                System.out.println("Se ha registrado el producto " + detergente.toString());
                break;

            case 2:
                Producto cereales = new Cereales(registrarMarca(), registrarPrecio(), registrarTipoCereal());
                productos.add(cereales);
                System.out.println("Se ha registrado el producto " + cereales.toString());
                break;

            case 3:
                Producto vino = new Vino(registrarMarca(), registrarPrecio(), registrarTipoVino(), registrarGraduacionAlcoholica());
                productos.add(vino);
                System.out.println("Se ha registrado el producto " + vino.toString());
                break;

            default:
                System.out.println("Producto no disponible.");
        }
    }

    public static String registrarMarca() {
        System.out.print("Introduce la marca: ");
        String texto = sc.nextLine().trim();
        while (texto.isEmpty()) {
            System.out.println("No puede estar vacío. Introduce la marca:");
            texto = sc.nextLine().trim();
        }
        return texto;
    }

    public static float registrarPrecio() {
        while (true) {
            try {
                System.out.print("Introduce el precio: ");
                return Float.parseFloat(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Valor no válido. Introduce un precio numérico.");
            }
        }
    }

    public static String registrarTipoCereal() {
        System.out.print("Introduce el tipo de cereal: ");
        String texto = sc.nextLine().trim();

        while (texto.isEmpty()) {
            System.out.println("No puede estar vacío. Introduce el tipo de cereal: ");
            texto = sc.nextLine().trim();
        }

        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }

    public static String registrarTipoVino() {
        System.out.print("Introduce el tipo de vino: ");
        String texto = sc.nextLine().trim();

        while (texto.isEmpty()) {
            System.out.println("No puede estar vacío. Introduce el tipo de vino: ");
            texto = sc.nextLine().trim();
        }
        return texto;
    }

    public static int registrarGraduacionAlcoholica() {
        while (true) {
            try {
                System.out.print("Introduce la graduación alcohólica: ");
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Valor no válido. Inténtalo de nuevo.");
            }
        }
    }

    public static void mostrarProductos(ArrayList<Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la lista.");
        }
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
    }

    public static void calculaSumaCalorias(ArrayList<Producto> productos) {
        int sumaCalorias = 0;
        for (Producto producto : productos) {
            if (producto instanceof ICalorias c) {
                sumaCalorias += c.getCalorias();
            }
        }
        System.out.println("La suma calórica de los alimentos es de " + sumaCalorias + " kcal.");
    }

}