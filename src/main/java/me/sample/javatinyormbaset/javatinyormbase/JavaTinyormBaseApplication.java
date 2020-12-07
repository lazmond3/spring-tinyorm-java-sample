package me.sample.javatinyormbaset.javatinyormbase;

import me.geso.tinyorm.TinyORM;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootApplication
public class JavaTinyormBaseApplication {
    // main メソッドで代入する
    private static TinyORM db;

    // テーブル作成関数
    protected static void createTable(String name, String... columns) {
        db.updateBySQL("DROP TABLE IF EXISTS `" + name + "`");
        db.updateBySQL("CREATE TABLE `" + name + "` ("
                + Arrays.stream(columns).collect(Collectors.joining(","))
                + ")");
    }

    public static void main(String[] args) throws SQLException {
        // DBへのコネクション取得(application.ymlを読ませたほがいい)
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sampledb",
                "root",
                ""
        );
        db = new TinyORM(connection);
        // tiny ORMのテストコードを参考に
        // https://github.com/tokuhirom/tinyorm/blob/master/tinyorm/src/test/java/me/geso/tinyorm/ListSelectStatementTest.java
        createTable("member",
                "id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY",
                "name VARCHAR(255) NOT NULL");

        SpringApplication.run(JavaTinyormBaseApplication.class, args);
    }

}
