package com.sql.sql;

import java.util.Optional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication

@RestController

public class DBServer {

    @Autowired
    ProjectRepository projectsRepo;

    @Autowired
    StudentRepository studentsRepo;

    public static void main(String[] args) {
        SpringApplication.run(DBServer.class, args);
    }

}