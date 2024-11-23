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
    private int numero;
    private String contrasena;
    private String productoComprado;
    private String formaDePago;
    private double pago;

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

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public int getNumero() {
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

    public double getPago() {
        return pago;
    }
    
}

// Comando para actualizar un cliente

