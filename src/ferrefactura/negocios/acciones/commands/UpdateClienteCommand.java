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
    private  String Rol;

    public UpdateClienteCommand() {
    }

    public UpdateClienteCommand(int id, String nombre, String direccion, String email, int numero, String contrasena, String Rol) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.numero = numero;
        this.contrasena = contrasena;
        this.Rol = Rol;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
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

    public String getRol() {
        return Rol;
    }
    
    
    
}