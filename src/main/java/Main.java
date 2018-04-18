import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            /**
             * 1 cargamoos el driver de mysql.
             */
            Class.forName("com.mysql.jdbc.Driver");
            /**
             * 2 Preparamos la conexion con la base de datos con la Interface Connection
             * Vamos a usar una clase DriverManager es una clase de java con metodos staticos , getConnection (String url, String pass, String user)
             * -----¿ Pregunta, la interfaz Connection porque puede almacenar una clase de tipo DriverManager si no existe polimorfismo entre ellas , o si?
             * Es porque esta dentro del paquete java.sql?------
             *
             */
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/database", "user","root");
            /**
             * 3 Una sentencia para atacar la base de datos
             */
            Statement statement = connection.createStatement();
            /**
             * 4 especificamos la peticion , dentro de un String
             *  Las palabras reservadas del lenguaje SQL , se escriben en mayusculas, asi se diferencia
             *  --- CREATE TABLE es la sentencia de crear la tabla , prueba es el nomnbre de la tabla, y dentro de los parentis se definen las columbas
             *  id : nombre de la columna que es de tipo entero , no puede ser null y es auto incrementado,
             *  nombre: nombre de la columna de tipo de VARCHAR(30)<- numero de caracteres, NOT NULL, no puede estar vacia.
             *  con esto obligas a rellenar los campos o genera una excepción
             */
            String sql = "CREATE TABLE prueba (id INT NOT NULL AUTO_INCREMENT, nombre VARCHAR(30) NOT NULL); ";

            /**
             * Ejecutamos la sentencia
             */
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
