package PT6;

import java.sql.*;

public class DBConnection {
    public String search(String english) {
        String dbusername = "root";
        String dbpassword = "123456";
        String url = "jdbc:mysql:///translation?useSSL=false&useServerPrepStmts=true";

        String sql = "select chinese from word where english = ?";

        try {
            Connection conn = DriverManager.getConnection(url, dbusername, dbpassword);
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, english);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String chinese = resultSet.getString("chinese");
                return chinese;
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
