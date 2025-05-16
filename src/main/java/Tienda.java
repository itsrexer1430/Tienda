import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una tienda con inventario de productos.
 */
public class Tienda {
    private List<Producto> inventario;

    /**
     * Constructor para crear una nueva tienda.
     */
    public Tienda() {
        this.inventario = new ArrayList<>();
    }

    /**
     * Añade un producto al inventario de la tienda.
     * param producto Producto a añadir
     */
    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    /**
     * Lista todos los productos disponibles en la tienda.
     */
    public void listarProductos() {
        System.out.println("=== Productos disponibles ===");
        inventario.forEach(System.out::println);
    }

    /**
     * Procesa una compra de un cliente.
     * param cliente Cliente que realiza la compra
     * param nombreProducto Nombre del producto a comprar
     * param cantidad Cantidad a comprar
     * return true si la compra fue exitosa, false en caso contrario
     */
    public boolean realizarCompra(Cliente cliente, String nombreProducto, int cantidad) {
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                try {
                    producto.vender(cantidad);
                    cliente.agregarCompra(nombreProducto + " x" + cantidad);
                    return true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Error en la compra: " + e.getMessage());
                    return false;
                }
            }
        }
        System.out.println("Producto no encontrado: " + nombreProducto);
        return false;
    }

    /**
     * Obtiene la lista de productos en el inventario.
     * return Lista de productos
     */
    public List<Producto> getInventario() {
        return inventario;
    }
}