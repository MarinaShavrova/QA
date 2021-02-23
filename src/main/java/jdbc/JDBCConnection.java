package jdbc;


import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) throws SQLException {

        String userLogin = "root";
        String password = "927854mar";
        String connectionUrl = "jdbc:mysql://127.0.0.1:3306/mysql?useUnicode=true&serverTimezone=UTC&useSSL=false&";

        Connection conn = null;
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn =
                    DriverManager.getConnection(connectionUrl +
                            "user=" +userLogin+ "&password="+password);

            Statement statement = conn.createStatement();
            statement.executeUpdate("insert into testjava.users (idusers, username, firstname, lastname, password, location, gender) value (1,'mylogin','Марина','Шаврова', '123456789','ru','f')");

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }


        }

    }


