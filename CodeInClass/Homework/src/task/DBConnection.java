package task;

import java.sql.*;

public class DBConnection {

    public boolean contains(String username, String password) {
        String dbusername = "root";
        String dbpassword = "123456";
        String url = "jdbc:mysql:///account?useSSL=false&useServerPrepStmts=true";

        String sql = "select * from userinfo where username = ? and password = ?";
        try {
            Connection conn = DriverManager.getConnection(url, dbusername, dbpassword);
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean contains(String username) {
        String dbusername = "root";
        String dbpassword = "123456";
        String url = "jdbc:mysql:///account?useSSL=false&useServerPrepStmts=true";

        String sql = "select * from userinfo where username = ?";
        try {
            Connection conn = DriverManager.getConnection(url, dbusername, dbpassword);
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int register(String username, String password) {
        String dbusername = "root";
        String dbpassword = "123456";
        String url = "jdbc:mysql:///account?useSSL=false&useServerPrepStmts=true";
        String sql = "insert into userinfo values (?,?)";

        try {
            Connection conn = DriverManager.getConnection(url, dbusername, dbpassword);
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
