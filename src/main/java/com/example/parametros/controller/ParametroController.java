package com.example.parametros.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotels")
public class ParametroController {

    private static Logger logger= Logger.getLogger(ParametroController.class);
    @Autowired


    @GetMapping("/aws")
    public ResponseEntity<String> hola(){
        logger.info("buscarParametro desde controlador");
        return ResponseEntity.ok("hola Grupo4 desde aws");
    }

}
