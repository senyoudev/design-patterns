public class App {
    public static void main(String[] args) throws Exception {
         ConnectionFactory factory = new ConnectionFactory();

        DatabaseConnection mySQLConnection = factory.createConnection("MySQL");
        mySQLConnection.connect();  // Output: Connected to MySQL database.

        DatabaseConnection postgreSQLConnection = factory.createConnection("PostgreSQL");
        postgreSQLConnection.connect();  // Output: Connected to PostgreSQL database.

        DatabaseConnection mongoDBConnection = factory.createConnection("MongoDB");
        mongoDBConnection.connect(); 
    }
}
