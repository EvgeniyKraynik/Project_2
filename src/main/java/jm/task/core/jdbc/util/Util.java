package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/my_db";
    private static final String USER = "user";
    private static final String PASSWORD = "user";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            return connection = DriverManager.getConnection(URL, "user", "user");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
