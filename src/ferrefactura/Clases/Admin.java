/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases;

/**
 *
 * @author steve
 */
public class Admin extends Usuarios{
    
    protected final int contraseña = 123456789;

    public Admin() {
    }

    public Admin(String Nombre, int ID, String Dirrecion, String Email, int Numero, String Contraseña) {
        super(Nombre, ID, Dirrecion, Email, Numero, Contraseña);
    }
}
