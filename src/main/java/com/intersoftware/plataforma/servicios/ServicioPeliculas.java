/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intersoftware.plataforma.servicios;

import com.intersoftware.plataforma.modelos.Pelicula;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan
 */

@Service
public class ServicioPeliculas {
    
    Pelicula pelicula= new Pelicula();
    
    public List<Pelicula> buscarPeliculas(){
        
        List<Pelicula> peliculas = new ArrayList<>();
        pelicula= new Pelicula();
        pelicula.setTitulo("uno");
        pelicula.setSinopsis("descripcion 1");
        pelicula.setFoto("https://github.com/jjosegallegocesde/poster/blob/main/p1.jpg?raw=true");
        peliculas.add(pelicula);

        pelicula= new Pelicula();
        pelicula.setTitulo("dos");
        pelicula.setSinopsis("descripcion 2");
        pelicula.setFoto("https://github.com/jjosegallegocesde/poster/blob/main/p2.jpg?raw=true");
        peliculas.add(pelicula);
        
        return peliculas;
        
    }
    
}
