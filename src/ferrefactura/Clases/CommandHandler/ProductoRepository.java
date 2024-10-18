/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases.CommandHandler;
import ferrefactura.Clases.Productos;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author USUARIO
 */
public class ProductoRepository {
    private Map<String, Productos> database = new HashMap<>();

    public void save(Productos productos) {
         database.put(String.valueOf((char) productos.getId()), productos);
    }

    public Productos findById(String id) {
        return database.get(id);
    }

    public Map<String, Productos> findAll() {
        return database;
    }
    
    public void delete(String id) {
    database.remove(id); // Elimina el cliente del mapa
}
}
