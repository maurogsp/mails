package com.maven.tp2.servicio;

import com.maven.tp2.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mauro on 11/06/17.
 */
@Service
public class Servicio {
    @Autowired
    Dao bd;

    @Autowired
    public Servicio()
    {

    }

    public List todos_los_mensajes()
    {
        return bd.todos_los_mensajes();
    }

    public List mensajes_x_usuario (int id)
    {
        return bd.mensajes_x_usuario(id);
    }


}
