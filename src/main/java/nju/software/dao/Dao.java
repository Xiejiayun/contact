package nju.software.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by lab on 16-1-12.
 */
public class Dao {

    private static Logger logger = LogManager.getLogger(Dao.class);

    public static void main(String[] args) {
        logger.info("start connect to the database");
        new Dao().connectDB();
        logger.info("finish connect to the database");
    }

    public void connectDB() {
        String driverName = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driverName);
            String serverName = "localhost";
            String database = "contact";
            String url = "jdbc:mysql://" + serverName + "/" + database;

            String username = "root";
            String password = "xiexie";
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.printf("Success");
            logger.info("success connect to the database");
        } catch (ClassNotFoundException e) {
            logger.error("Error occurs", e);
            e.printStackTrace();
        } catch (SQLException e) {
            logger.error("Error occurs", e);
            e.printStackTrace();
        }


    }
}
