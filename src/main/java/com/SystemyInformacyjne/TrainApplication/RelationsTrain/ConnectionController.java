package com.SystemyInformacyjne.TrainApplication.RelationsTrain;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/connection")
public class ConnectionController {

    @Autowired
    private ConnectionRepositoryImpl connectionRepositoryImpl;

//    public ConnectionController(ConnectionRepositoryImpl connectionRepositoryImpl) {
//        this.connectionRepositoryImpl = connectionRepositoryImpl;
//    }

    //get all connect
    @GetMapping("/view")
    public List<Connection> getAllConnection() {
        return connectionRepositoryImpl.findAll();
    }

    //get all connect
    @GetMapping("/view/{date}/{from}/{to}")
    public List<Connection> getOneConnection(@PathParam("date") String date, @PathParam("from") String from, @PathParam("to") String to) {

//        List<Connection> list = connectionRepositoryImpl.findAllByDateAndFromAndTo(date, from, to);
//        return list;
        return null;
    }

    @PostMapping("/add")
    public Connection createConnection(@RequestBody Connection connection) {
        return connectionRepositoryImpl.save(connection);
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
