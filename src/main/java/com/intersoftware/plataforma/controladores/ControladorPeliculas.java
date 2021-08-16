/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intersoftware.plataforma.controladores;

import com.intersoftware.plataforma.modelos.Pelicula;
import com.intersoftware.plataforma.servicios.ServicioPeliculas;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Juan
 */

@Controller
public class ControladorPeliculas {
    
    private ServicioPeliculas servicio;

    public ControladorPeliculas(ServicioPeliculas servicio) {
        this.servicio = servicio;
    }
    
    
    
    @RequestMapping("/")
    public String llamarVista(Model modelo){
        
        List<Pelicula> peliculas = servicio.buscarPeliculas();
        modelo.addAttribute("peliculas",peliculas);
        
        return("saludo");
        
    }
    
}
