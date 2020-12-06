package me.sample.javatinyormbaset.javatinyormbase.config;

import me.geso.tinyorm.TinyORM;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class TinyOrmDb {
    @Bean
    public TinyORM db() throws SQLException {
        String dburl = "jdbc:mysql://localhost:3306/sampledb2";
        String dbuser = "root";
        String dbpassword = "";
        Connection connection = DriverManager.getConnection(dburl, dbuser, dbpassword);
        TinyORM db = new TinyORM(connection);
        return db;
    }
}
