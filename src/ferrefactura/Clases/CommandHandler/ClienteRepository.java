/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases.CommandHandler;

import ferrefactura.Clases.Clientes;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author steve
 */
public class ClienteRepository {
    private Map<String, Clientes> database = new HashMap<>();

    public void save(Clientes cliente) {
        database.put(cliente.getID(), cliente);
    }

    public Clientes findById(String id) {
        return database.get(id);
    }

    public Map<String, Clientes> findAll() {
        return database;
    }
    
    public void delete(String id) {
    database.remove(id); // Elimina el cliente del mapa
}
}