package me.sample.javatinyormbaset.javatinyormbase.controller;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import me.geso.tinyorm.TinyORM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {
    private final TinyORM db;

    @GetMapping("/hello")
    public String hello() {
        String queryResult = db.executeQuery("SELECT 1+1", t -> t.toString());
        return "hello world! " + queryResult;
    }
}
