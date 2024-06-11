package OOPJava.SOLID.DIP;

public class DIPPractice {
    public static void testDIP(){
        DBConnection dbConnection = new OracleConnection();
        new DBConnectionFactory(dbConnection);
    }
}

interface DBConnection{
    void connect();
}

class OracleConnection implements DBConnection{

    @Override
    public void connect() {
        System.out.println("Oracle connected");
    }
}

class MySQLConnection implements DBConnection{

    @Override
    public void connect() {
        System.out.println("MySQL connected");
    }
}

class PostgreSQLConnection implements DBConnection {

    @Override
    public void connect() {
        System.out.println("PostgreSQL connected");
    }
}

class DBConnectionFactory{
    public DBConnection getDbConnection() {
        return dbConnection;
    }

    private final DBConnection dbConnection;

    public DBConnectionFactory(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
        this.dbConnection.connect();
    }
}