/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author mensi
 */
public class DbProvider {

    private String url;
    private String login;
    private String password;
    private Connection connection;
    private Properties properties;
    private static DbProvider instance;

    private DbProvider() throws IOException, SQLException {
        this.properties = new Properties();
        this.properties.load(new FileInputStream(new File("configuration.Proprieties")));
        this.url = this.properties.getProperty("url");
        this.login = this.properties.getProperty("login");
        this.password = this.properties.getProperty("password");
        this.connection = DriverManager.getConnection(this.url, this.login, this.password);
    }

    public static DbProvider GetInstance() throws IOException, SQLException {
        if (instance == null) {
            instance = new DbProvider();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
