/**
 * Clase principal que demuestra el funcionamiento del sistema de tienda.
 */
public class Main {
    public static void main(String[] args) {
        // Crear una tienda
        Tienda tienda = new Tienda();

        // Añadir productos a la tienda
        tienda.agregarProducto(new Producto("Laptop", 3500000.00, 10));
        tienda.agregarProducto(new Producto("Teléfono", 800000.00, 15));
        tienda.agregarProducto(new Producto("Tablet", 600000.00, 20));

        // Listar productos disponibles
        tienda.listarProductos();

        // Crear un cliente
        Cliente cliente = new Cliente("robin Perez", "robinpapasito@gami.com");

        // Realizar algunas compras
        System.out.println("\nRealizando compras...");
        tienda.realizarCompra(cliente, "Laptop", 2);
        tienda.realizarCompra(cliente, "Teléfono", 1);

        // Intentar comprar más de lo disponible (debería fallar)
        tienda.realizarCompra(cliente, "Tablet", 25);

        // Mostrar el estado actual del inventario
        System.out.println("\nInventario después de compras:");
        tienda.listarProductos();

        // Mostrar información del cliente
        System.out.println("\nInformación del cliente:");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Correo: " + cliente.getCorreo());

        // Reabastecer un producto
        Producto tablet = null;
        for (Producto producto : tienda.getInventario()) {
            if (producto.getNombre().equals("Tablet")) {
                tablet = producto;
                break;
            }
        }

        if (tablet != null) {
            tablet.reabastecer(10);
            System.out.println("\nTablet reabastecida. Nuevo stock: " + tablet.getCantidadDisponible());
        }

        // Listar productos nuevamente para ver los cambios
        System.out.println("\nInventario final:");
        tienda.listarProductos();
    }
}