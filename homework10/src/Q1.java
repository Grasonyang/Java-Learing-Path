import java.sql.*;

public class Q1 {

    public static void main(String[] args) {

        String databaseURL = "jdbc:ucanaccess://src/DB/db2.mdb";
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            try (Connection connection = DriverManager.getConnection(databaseURL)) {
                insertStudent(connection, "94610060", "新同學", "M", "彰化");
                selectStudent(connection);
            } catch (SQLException e) {
                System.err.println("Wrong: " + e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            System.err.println("UCanAccess Driver not found.");
        }
    }

    private static void insertStudent(
            Connection connection,
            String a,
            String b,
            String c,
            String d) {
        String sql = "INSERT INTO `students` (`stud_no`,`stud_name`,`stud_sex`,`stud_addr`) VALUES (?,?,?,?)";
        try (PreparedStatement presql = connection.prepareStatement(sql)) {
            presql.setString(1, a);
            presql.setString(2, b);
            presql.setString(3, c);
            presql.setString(4, d);
            presql.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Wrong: " + e.getMessage());
        }
    }

    private static void selectStudent(Connection connection) {
        String sql = "SELECT * FROM `students` WHERE `stud_addr` = ? AND `stud_sex` = ?";
        try (PreparedStatement presql = connection.prepareStatement(sql)) {
            presql.setString(1, "彰化");
            presql.setString(2, "M");
            ResultSet rs = presql.executeQuery();
            while (rs.next()) {
                System.out.println(
                        rs.getString("stud_no") + " " +
                                rs.getString("stud_name"));
            }
        } catch (SQLException e) {
            System.err.println("Wrong: " + e.getMessage());
        }

    }
}