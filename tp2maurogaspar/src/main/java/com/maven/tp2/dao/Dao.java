package com.maven.tp2.dao;

import com.maven.tp2.modelo.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauro on 11/06/17.
 */
@Repository
public class Dao {
    private Connection conex;

    @Autowired
    private Dao (@Value("${db.host}") String host, @Value("${db.port}") int port, @Value("${db.name}") String dbname, @Value("${db.username}") String username, @Value("${db.password}") String password)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+dbname+"",username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public List todos_los_mensajes() {
        List<Mensaje> lista = new ArrayList<Mensaje>();

        try {
            String cmd = "select * from mensajes";
            //Statement st = Dao.getinstance().conex.createStatement();
            Statement st = conex.createStatement();
            ResultSet rs = st.executeQuery(cmd);

            while (rs.next()) {
                Mensaje local = new Mensaje(rs.getInt("id"), rs.getInt("user_id_from"), rs.getInt("user_id_to"), rs.getString("remitente"), rs.getString("recipiente"), rs.getDate("fecha"), rs.getString("asunto"), rs.getString("cuerpo"), rs.getBoolean("trash"));
                lista.add(local);
            }


        } catch (Exception e) {

        }
        return lista;
    }

    public List mensajes_x_usuario(int id) {
        List<Mensaje> lista = new ArrayList<Mensaje>();

        try {
            String cmd = "select * from mensajes where user_id_to ="+id;
            //Statement st = Dao.getinstance().conex.createStatement();
            Statement st = conex.createStatement();
            ResultSet rs = st.executeQuery(cmd);

            while (rs.next()) {
                Mensaje local = new Mensaje(rs.getInt("id"), rs.getInt("user_id_from"), rs.getInt("user_id_to"), rs.getString("remitente"), rs.getString("recipiente"), rs.getDate("fecha"), rs.getString("asunto"), rs.getString("cuerpo"), rs.getBoolean("trash"));
                lista.add(local);
            }

        } catch (Exception e) {

        }
        return lista;
    }
}
