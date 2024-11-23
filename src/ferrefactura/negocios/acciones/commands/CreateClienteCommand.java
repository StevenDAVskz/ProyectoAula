/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.negocios.acciones.commands;

/**
 *
 * @author steve
 */
public class CreateClienteCommand {
    private String nombre;
    private int id;
    private String direccion;
    private String email;
    private int numero;  // Cambiado de String a int
    private String contrasena;
    private String productoComprado;
    private String formaDePago;
    private double pago;  // Este puede ser un double para representar la cantidad de dinero

    // Constructor con los parámetros correctos
    public CreateClienteCommand(String nombre, int id, String direccion, String email, int numero, String contrasena, String productoComprado, String formaDePago, double pago) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.email = email;
        this.numero = numero;
        this.contrasena = contrasena;
        this.productoComprado = productoComprado;
        this.formaDePago = formaDePago;
        this.pago = pago;
    }

    // Métodos getters para acceder a los valores de los atributos

    public String getNombre() {
        return nombre;
    }

    public int getId() {  // Cambiado a int
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public int getNumero() {  // Cambiado a int
        return numero;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getProductoComprado() {
        return productoComprado;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public double getPago() {  // Cambiado a double
        return pago;
    }
}


// Comando para actualizar un cliente

