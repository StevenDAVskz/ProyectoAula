package ferrefactura.Clases.CommandHandler;

import ferrefactura.negocios.acciones.commands.CreateClienteCommand;
import ferrefactura.negocios.acciones.commands.DeleteClienteCommand;
import ferrefactura.negocios.acciones.commands.UpdateClienteCommand;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ClienteCommandHandler {
    private Connection conn;

    // Constructor que establece la conexión con la base de datos
    public ClienteCommandHandler() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ferrefactura", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error de conexión a la base de datos", e);
        }
    }

    // Método para crear un cliente en la base de datos
   public boolean createCliente(String nombre, int id, String direccion, String email, int numero, String contrasena, String productoComprado, String formaDePago, double pago) {
    String checkQuery = "SELECT COUNT(*) FROM usuarios WHERE id = ?";
    String insertQuery = "INSERT INTO usuarios (nombre, id, direccion, email, numero, contrasena, producto_comprado, forma_de_pago, pago) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
         PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {

        // Verificar si el ID ya existe en la base de datos
        checkStmt.setInt(1, id);
        ResultSet rs = checkStmt.executeQuery();
        rs.next();
        if (rs.getInt(1) > 0) {
            throw new RuntimeException("ID ya en uso: " + id); // Lanzamos una excepción personalizada
        }

        // Insertar el nuevo cliente en la base de datos
        insertStmt.setString(1, nombre);
        insertStmt.setInt(2, id);
        insertStmt.setString(3, direccion);
        insertStmt.setString(4, email);
        insertStmt.setInt(5, numero);
        insertStmt.setString(6, contrasena);
        insertStmt.setString(7, productoComprado);
        insertStmt.setString(8, formaDePago);
        insertStmt.setDouble(9, pago); // Pago debe ser de tipo double

        int rowsAffected = insertStmt.executeUpdate();
        return rowsAffected > 0; // Si filas fueron afectadas, se retornará true

    } catch (Exception e) {
        e.printStackTrace();
        throw new RuntimeException("Error al crear el cliente: " + e.getMessage(), e);
    }
}


  public boolean updateCliente(int id, String nombre, String direccion, String email, int numero, String contrasena, String productoComprado, String formaDePago, double pago) {
    String checkQuery = "SELECT COUNT(*) FROM usuarios WHERE id = ?";
    String updateQuery = "UPDATE usuarios SET nombre = ?, direccion = ?, email = ?, numero = ?, contrasena = ?, producto_comprado = ?, forma_de_pago = ?, pago = ? WHERE id = ?";

    try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
         PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {

        // Verificar si el cliente existe
        checkStmt.setInt(1, id);
        ResultSet rs = checkStmt.executeQuery();
        rs.next();
        if (rs.getInt(1) == 0) {
            throw new RuntimeException("Cliente no encontrado: " + id); // Excepción personalizada
        }

        // Actualizar los datos del cliente
        updateStmt.setString(1, nombre);
        updateStmt.setString(2, direccion);
        updateStmt.setString(3, email);
        updateStmt.setInt(4, numero);
        updateStmt.setString(5, contrasena);
        updateStmt.setString(6, productoComprado);
        updateStmt.setString(7, formaDePago);
        updateStmt.setDouble(8, pago); // Asegúrate de que `pago` sea de tipo double
        updateStmt.setInt(9, id);

        int rowsAffected = updateStmt.executeUpdate();
        return rowsAffected > 0;

    } catch (Exception e) {
        e.printStackTrace();
        throw new RuntimeException("Error al actualizar el cliente: " + e.getMessage(), e);
    }
}


  public boolean deleteCliente(int id) {
    String checkQuery = "SELECT COUNT(*) FROM usuarios WHERE id = ?";
    String deleteQuery = "DELETE FROM usuarios WHERE id = ?";

    try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
         PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery)) {

        // Verificar si el cliente existe
        checkStmt.setInt(1, id);
        ResultSet rs = checkStmt.executeQuery();
        rs.next();
        if (rs.getInt(1) == 0) {
            throw new RuntimeException("Cliente no encontrado: " + id); // Excepción personalizada
        }

        // Eliminar el cliente de la base de datos
        deleteStmt.setInt(1, id);
        int rowsAffected = deleteStmt.executeUpdate();
        return rowsAffected > 0;

    } catch (Exception e) {
        e.printStackTrace();
        throw new RuntimeException("Error al eliminar el cliente: " + e.getMessage(), e);
    }
}

}
