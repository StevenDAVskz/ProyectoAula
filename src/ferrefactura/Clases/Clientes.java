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
    protected int Pago;

    public Clientes() {
    }

    public Clientes(String ProductoComprado, String FormaDePago, int Pago, String Nombre, String ID, String Dirrecion, String Email, String Numero, String Contraseña) {
        super(Nombre, ID, Dirrecion, Email, Numero, Contraseña);
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

    public int getPago() {
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDirrecion() {
        return Dirrecion;
    }

    public void setDirrecion(String Dirrecion) {
        this.Dirrecion = Dirrecion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    

    
    
}
