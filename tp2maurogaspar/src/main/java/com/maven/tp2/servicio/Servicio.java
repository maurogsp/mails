package com.maven.tp2.servicio;

import com.maven.tp2.dao.Dao;
import com.maven.tp2.modelo.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
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
        List<Mensaje> lista = new ArrayList<Mensaje>();
        try
        {
            lista =  bd.todos_los_mensajes();
        }
        catch(Exception e)
        {

        }
        return lista;
    }

    public List mensajes_x_usuario (int id)
    {
        List<Mensaje> lista = new ArrayList<Mensaje>();
        try
        {
            lista = bd.mensajes_x_usuario(id);
        }
        catch (Exception e)
        {

        }
        return lista;
    }

    public List mensajes_borrados (int id)
    {
        List<Mensaje> lista = new ArrayList<Mensaje>();
        try
        {
            lista = bd.mensajes_borrados(id);
        }
        catch (Exception e)
        {

        }
        return lista;
    }

    public void enviarMensaje (int user_id_from, int user_id_to, String remitente, String recipiente, String asunto, String cuerpo, boolean trash)
    {
        try
        {
            bd.enviarMail(user_id_from,user_id_to,remitente,recipiente,asunto,cuerpo,trash);
        }
        catch (Exception e)
        {

        }

    }



}
