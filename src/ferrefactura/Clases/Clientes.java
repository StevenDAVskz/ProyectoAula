/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases;

/**
 *
 * @author steve
 */
public class Clientes extends Usuarios{
    protected String ProductoComprado;
    protected String FormaDePago;
    protected double Pago;

    public Clientes() {
    }

    public Clientes(String ProductoComprado, String FormaDePago, double Pago, String Nombre, int ID, String Direccion, String Email, int Numero, String Contraseña, String Rol) {
        super(Nombre, ID, Direccion, Email, Numero, Contraseña, Rol);
        this.ProductoComprado = ProductoComprado;
        this.FormaDePago = FormaDePago;
        this.Pago = Pago;
    }

    public String getProductoComprado() {
        return ProductoComprado;
    }

    public void setProductoComprado(String ProductoComprado) {
        this.ProductoComprado = ProductoComprado;
    }

    public String getFormaDePago() {
        return FormaDePago;
    }

    public void setFormaDePago(String FormaDePago) {
        this.FormaDePago = FormaDePago;
    }

    public double getPago() {
        return Pago;
    }

    public void setPago(int Pago) {
        this.Pago = Pago;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDirrecion(String Dirrecion) {
        this.Direccion = Dirrecion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    

    
    
}
