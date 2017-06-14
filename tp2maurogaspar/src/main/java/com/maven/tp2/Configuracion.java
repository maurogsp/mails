package com.maven.tp2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by mauro on 13/06/17.
 */
@Configuration
public class Configuracion {

    @Autowired
    AuthFilter authFilter;

    @Bean(name="conexion")
    public Connection getconnection(@Value("${db.host}") String host, @Value("${db.port}") int port, @Value("${db.name}") String dbname, @Value("${db.username}") String username, @Value("${db.password}") String password)
    {
        Connection conexion = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+dbname+"",username,password);
        }
        catch (Exception e)
        {
        e.printStackTrace();
        }
        return conexion;
    }

    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(authFilter);
        registration.addUrlPatterns("/api/*");
        return registration;
    }

}
