package com.SystemyInformacyjne.TrainApplication.RelationsTrain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/connection")
public class ConnectionController {
    @Autowired
    private ConnectionRepositoryImpl connectionRepositoryImpl;

    //get all connect
    @GetMapping("/view")
    public List<Connection> getAllConnection(){
        return connectionRepositoryImpl.findAll();
    }

    /*
    // get employee by id rest api
    @GetMapping("/view/{id}")
    public ResponseEntity<Connection> getConnectionById(@PathVariable String from) {

        Connection connection = connectionRepositoryImpl.findByName(from);

        return ResponseEntity.ok(connection);
    }

     */
}
