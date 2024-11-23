/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases;

/**
 *
 * @author steve
 */
public class Provedor extends Usuarios {
    protected int ProductosVendidos;
    protected int Pagos;
    protected String Encargos;

    public Provedor() {
    }

    public Provedor(String Nombre, int ID, String Dirrecion, String Email, int Numero, String Contraseña, String Rol) {
        super(Nombre, ID, Dirrecion, Email, Numero, Contraseña,Rol);
    }

    public Provedor(int ProductosVendidos, int Pagos, String Encargos) {
        this.ProductosVendidos = ProductosVendidos;
        this.Pagos = Pagos;
        this.Encargos = Encargos;
    }

    public int getProductosVendidos() {
        return ProductosVendidos;
    }

    public void setProductosVendidos(int ProductosVendidos) {
        this.ProductosVendidos = ProductosVendidos;
    }

    public int getPagos() {
        return Pagos;
    }

    public void setPagos(int Pagos) {
        this.Pagos = Pagos;
    }

    public String getEncargos() {
        return Encargos;
    }

    public void setEncargos(String Encargos) {
        this.Encargos = Encargos;
    }
    
}
