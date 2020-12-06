package me.sample.javatinyormbaset.javatinyormbase.config;

import me.geso.tinyorm.TinyORM;
import me.sample.javatinyormbaset.javatinyormbase.property.DbProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
@EnableConfigurationProperties(DbProperties.class)
public class TinyOrmDb {
    @Bean
    public TinyORM db(DbProperties dbproperties) throws SQLException {
//        String dburl = "jdbc:mysql://localhost:3306/sampledb2";
//        String dbuser = "root";
//        String dbpassword = "";
        Connection connection = DriverManager.getConnection(
                dbproperties.getUrl(),
                dbproperties.getUsername(),
                dbproperties.getPassword()
        );
        TinyORM db = new TinyORM(connection);
        return db;
    }
}
