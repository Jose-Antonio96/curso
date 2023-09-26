package com.cursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cursos.model.Curso;
import com.cursos.service.CursosServiceImpl;

/**
 * Controlador que se encarga de hacer funcionar las funciones proveidas por el
 * servicio
 */

@RestController
public class CursosController {
    @Autowired
    CursosServiceImpl service;

    /**
     * Obtiene una lista de todos los cursos.
     *
     * @return la lista de cursos
     */
    @GetMapping(value = "cursos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> cursos() {
        return service.cursos();
    }

    /**
     * Busca un curso por su ID.
     *
     * @param curso_id el ID del curso a buscar
     * @return el curso encontrado
     */
    @GetMapping(value = "curso/show/{curso_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso buscarCurso(@PathVariable("curso_id") int curso_id) {
        return service.buscarCurso(curso_id);
    }

    /**
     * Agrega un nuevo curso a la base de datos.
     *
     * @param curso_id el ID del curso a agregar
     * @param name     el nombre del curso
     * @param duracion la duración del curso
     * @param precio   el precio del curso
     */
    @PostMapping(value = "curso/add/{curso_id}/{name}/{duracion}/{precio}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void agregarCurso(@PathVariable("curso_id") int curso_id,
            @PathVariable("name") String name,
            @PathVariable("duracion") int duracion,
            @PathVariable("precio") int precio) {
        Curso curso = new Curso(curso_id, name, duracion, precio);
        service.crearCurso(curso);
    }

    /**
     * Actualiza un objeto curso en la base de datos.
     *
     * @param curso el objeto curso a actualizar
     */
    @PutMapping(value = "curso", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarcurso(
            @RequestBody Curso curso) {

        service.actualizarCurso(curso);

    }

    /**
     * Elimina un curso de la base de datos.
     *
     * @param curso_id el ID del curso a eliminar
     * @return la lista actualizada de cursos
     */
    @DeleteMapping(value = "curso/{curso_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> eliminarCurso(@PathVariable("curso_id") int curso_id) {
        return service.eliminarCurso(curso_id);
    }

}
