package New_HWs;

import java.sql.*;

public class DB_connecting_IDE {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/traffic_police";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

//SELECTING
            String sql = "SELECT id, vendor, model, plate_number FROM car";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("Result set:");
            printRs(rs);

//INSERTING
            rs.moveToInsertRow();
            rs.updateInt("id", 9);
            rs.updateString("vendor", "Jeep");
            rs.updateString("model", "Cherokee");
            rs.updateInt("plate_number", 98765);
            rs.insertRow();
            System.out.println("New result set:");
            printRs(rs);

//DELETING
            rs.absolute(7);
            rs.deleteRow();
            System.out.println("Result set after deleting last row:");
            printRs(rs);

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    private static void printRs(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        while (rs.next()) {
            int id = rs.getInt("id");
            String vendor = rs.getString("vendor");
            String model = rs.getString("model");
            int plate_number = rs.getInt("plate_number");

            System.out.print("ID: " + id);
            System.out.print(", \t\tVendor: " + vendor);
            System.out.print(", \t\tModel: " + model);
            System.out.println(", \t\tPlate number:" + plate_number);
        }
    }
}