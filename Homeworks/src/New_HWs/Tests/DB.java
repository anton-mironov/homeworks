package New_HWs.Tests;

import java.sql.*;

public class DB {
    static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static String DB_URL = "jdbc:mysql://localhost:3306/azart_player";
    static String USER = "root";
    static String PASS = "root";
    static String PERSON_BY_NAME = "select * from Person where name = ?";
    static String PERSON_BY_ID = "select * from Person where id = ?";

    public Person getById(Integer id) {
        return getPersonByQuery(PERSON_BY_ID, id);
    }

    public Person getByName(String name) {
        return getPersonByQuery(PERSON_BY_NAME, name);
    }

    private Person resultSetToPerson(ResultSet rs) throws SQLException {
        if (rs.next()) {
            Person result = new Person();
            result.setId(rs.getInt("id"));
            result.setName(rs.getString("name"));
            result.setNumberOfWins(rs.getInt("NumberOfWins"));
            result.setGamePlayed(rs.getInt("GamePlayed"));
            return result;
        } else {
            return null;
        }
    }

    public Person getPersonByQuery(String query, Object param) {
        try {
            PreparedStatement stmt = getConnection().prepareStatement(query);
            stmt.setObject(1, param);
            return resultSetToPerson(stmt.executeQuery());
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}