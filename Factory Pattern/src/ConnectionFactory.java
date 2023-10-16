class ConnectionFactory {
    public DatabaseConnection createConnection(String type) {
        if (type.equals("MySQL")) {
            return new MySQLConnection();
        } else if (type.equals("PostgreSQL")) {
            return new PostgreSQLConnection();
        } else if (type.equals("MongoDB")) {
            return new MongoDBConnection();
        }
        return null;
    }
}