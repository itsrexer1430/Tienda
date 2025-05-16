import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un cliente de la tienda.
 */
public class Cliente {
    private String nombre;
    private String correo;
    private List<String> historialDeCompras;

    /**
     * Constructor para crear un nuevo cliente.
     * para nombre Nombre del cliente
     * para correo Correo electrónico del cliente
     */
    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.historialDeCompras = new ArrayList<>();
    }

    // Getters públicos
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    /**
     * Getter protegido para el historial de compras.
     * @return Lista de compras del cliente
     */
    protected List<String> getHistorialDeCompras() {
        return historialDeCompras;
    }

    /**
     * Metodo público para añadir una compra al historial.
     * para producto Nombre del producto comprado
     */
    public void agregarCompra(String producto) {
        historialDeCompras.add(producto);
    }

    /**
     * Metodo protegido para mostrar el historial de compras.
     */
    protected void mostrarHistorial() {
        System.out.println("Historial de compras de " + nombre + ":");
        historialDeCompras.forEach(System.out::println);
    }
}