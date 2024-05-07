package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import interfaces.ConnectionFactory;

public class MysqlConnectionFactory implements ConnectionFactory{

	private String url;
    private String username;
    private String password;

    public MysqlConnectionFactory(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

}
