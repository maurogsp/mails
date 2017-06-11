package com.maven.tp2.controladora;

import com.maven.tp2.modelo.Mensaje;
import com.maven.tp2.servicio.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mauro on 11/06/17.
 */
@RestController
@RequestMapping("/")
public class Controladora {
    @Autowired
    Servicio service;

    @RequestMapping(value = "/mails/", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<List<Mensaje>> getMails() {
        List<Mensaje> listamails = service.todos_los_mensajes();
        if (listamails.size() > 0) {
            return new ResponseEntity<List<Mensaje>>(listamails, HttpStatus.OK);
        } else {
            return new ResponseEntity<List<Mensaje>>(HttpStatus.NO_CONTENT);
        }
    }

    @RequestMapping(value = "/mails", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<Mensaje>> getMailsxUsuario(@RequestParam("id") int idu) {
        List<Mensaje> listamails = service.mensajes_x_usuario(idu);
        if (listamails.size() > 0) {
            return new ResponseEntity<List<Mensaje>>(listamails, HttpStatus.OK);
        } else {
            return new ResponseEntity<List<Mensaje>>(HttpStatus.NO_CONTENT);
        }
    }
}
