package com.cursos.service;

import com.cursos.model.Curso;
import java.util.List;

/**
 *  Interfaz con el CRUD de los cursos que se usará en CursosServiceImpl
 */

public interface CursosService {

    
    List<Curso> cursos();

    Curso buscarCurso(int curso_id);

    List<Curso> eliminarCurso(int curso_id);

    void crearCurso(Curso curso);

    void actualizarCurso(Curso curso);


    

}
