package ivysaur.persistance;

import java.sql.ResultSet;

public interface DBConnector {

    public void connect(String dbFile);
    public void createTable(String table, String[] columns);
    public void insert(String table, String[] values);
    public ResultSet selectAllFromConditional(String table, String condition);
    public ResultSet selectAllFrom(String table);
    public ResultSet selectColumnFromConditional(String column, String table, String condition);
    public ResultSet selectColumnFrom(String column, String table);
    public void closeConnection();
}
