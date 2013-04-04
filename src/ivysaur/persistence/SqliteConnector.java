package ivysaur.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqliteConnector {

    private Connection connection = null;
    private Statement statement;

    public void connect(String dbFile) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:" + dbFile);
        statement = connection.createStatement();
    }

    public void createTable(String table, String[] columns) throws SQLException {
        String query = "create table " + table + "(";
        for (String column : columns) {
            query += column;
        }
        query += ");";

        statement.executeUpdate("drop table if exists " + table);
        statement.executeUpdate(query);
    }

    public void insert(String table, String[] values) throws SQLException {
        String query = "insert into " + table + " values(";
        for (String value : values) {
            query += value;
        }
        query += ");";
        statement.executeUpdate(query);


    }

    public ResultSet selectFrom(String table) throws SQLException {
        return statement.executeQuery("select * from " + table);
    }

    public void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
