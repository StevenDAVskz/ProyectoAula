/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.negocios.acciones.commands;

/**
 *
 * @author steve
 */
public class UpdateClienteCommand {
    private int id;
    private String nombre;
    private String direccion;
    private String email;
    private int numero;
    private String contrasena;
    private String productoComprado;
    private String formaDePago;
    private double pago;

    public UpdateClienteCommand(int id, String nombre, String direccion, String email, int numero, String contrasena, String productoComprado, String formaDePago, double pago) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.numero = numero;
        this.contrasena = contrasena;
        this.productoComprado = productoComprado;
        this.formaDePago = formaDePago;
        this.pago = pago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getProductoComprado() {
        return productoComprado;
    }

    public void setProductoComprado(String productoComprado) {
        this.productoComprado = productoComprado;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    
    
}
