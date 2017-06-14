package com.maven.tp2.controladora;

import com.maven.tp2.modelo.Mensaje;
import com.maven.tp2.request.MensajeRequest;
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
@RequestMapping("/api")
public class ControladoraMensajes {
    @Autowired
    Servicio service;

    @RequestMapping(value = "/mails/inbox", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<Mensaje>> getMailsxUsuario(@RequestParam("id") int idu) {
        List<Mensaje> listamails = service.mensajes_x_usuario(idu);
        if (listamails.size() > 0) {
            return new ResponseEntity<List<Mensaje>>(listamails, HttpStatus.OK);
        } else {
            return new ResponseEntity<List<Mensaje>>(HttpStatus.NO_CONTENT);
        }
    }

    @RequestMapping(value = "/mails/papelera", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<Mensaje>> getMailsBorrados(@RequestParam("idb") int id) {
        List<Mensaje> listamails = service.mensajes_borrados(id);
        if (listamails.size() > 0) {
            return new ResponseEntity<List<Mensaje>>(listamails, HttpStatus.OK);
        } else {
            return new ResponseEntity<List<Mensaje>>(HttpStatus.NO_CONTENT);
        }
    }

    @RequestMapping(value = "/mails/nuevo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addMensaje(@RequestBody MensajeRequest request) {
        try {
            service.enviarMensaje(request.getIduf(),request.getIdut(),request.getRemitente(),request.getRecipiente(),request.getAsunto(),request.getCuerpo(),request.isTrash());
            return new ResponseEntity(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
