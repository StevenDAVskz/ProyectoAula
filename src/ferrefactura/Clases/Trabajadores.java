/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases;

/**
 *
 * @author steve
 */
public class Trabajadores extends Usuarios{
    protected int Salario;
    protected String ProductosVendidos;

    public Trabajadores() {
    }

    public Trabajadores(int Salario, String ProductosVendidos) {
        this.Salario = Salario;
        this.ProductosVendidos = ProductosVendidos;
    }

    public Trabajadores(int Salario, String ProductosVendidos, String Nombre, int ID, String Direccion, String Email, int Numero, String Contraseña, String Rol) {
        super(Nombre, ID, Direccion, Email, Numero, Contraseña, Rol);
        this.Salario = Salario;
        this.ProductosVendidos = ProductosVendidos;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public String getProductosVendidos() {
        return ProductosVendidos;
    }

    public void setProductosVendidos(String ProductosVendidos) {
        this.ProductosVendidos = ProductosVendidos;
    }
    
    


    
    
    
}
