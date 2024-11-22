/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.negocios.acciones.commands;

/**
 *
 * @author USUARIO
 */
public class DeleteProducto {
    private int id;
    
    public DeleteProducto(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
}
