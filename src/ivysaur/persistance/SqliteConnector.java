package ivysaur.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqliteConnector implements DBConnector{

    private Connection connection = null;
    private Statement statement;

    @Override
    public void connect(String dbFile) {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + dbFile);
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SqliteConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void createTable(String table, String[] columns) {
        try {
            String query = "create table " + table + "(";
            for (String column : columns) {
                query += column;
            }
            query += ");";

            statement.executeUpdate("drop table if exists " + table);
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(SqliteConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insert(String table, String[] values) {
        try {
            String query = "insert into " + table + " values(";
            for (String value : values) {
                query += value;
            }
            query += ");";
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(SqliteConnector.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @Override
    public ResultSet selectAllFromConditional(String table, String condition) {
        try {
            return statement.executeQuery("select * from " + table + "where" + condition);
        } catch (SQLException ex) {
            Logger.getLogger(SqliteConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ResultSet selectAllFrom(String table) {
        try {
            return statement.executeQuery("select * from " + table);
        } catch (SQLException ex) {
            Logger.getLogger(SqliteConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ResultSet selectColumnFromConditional(String column, String table, String condition)  {
        try {
            return statement.executeQuery("select * from " + table + " where " + condition);
        } catch (SQLException ex) {
            Logger.getLogger(SqliteConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ResultSet selectColumnFrom(String column, String table) {
        try {
            return statement.executeQuery("select * from " + table);
        } catch (SQLException ex) {
            Logger.getLogger(SqliteConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(SqliteConnector.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
