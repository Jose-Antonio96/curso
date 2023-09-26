package com.cursos.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;

import com.cursos.model.Curso;

/**
 * CRUD completo con funciones de la interfaz CursosService, que serán usados
 * por el controlador
 */
@Service
public class CursosServiceImpl {

    List<Curso> cursos;

    public CursosServiceImpl() {
        cursos = new ArrayList<>();
        cursos.add(new Curso(1, "Spring", 400, 3000));
        cursos.add(new Curso(2, "PHP", 200, 2000));
        cursos.add(new Curso(3, "Java", 300, 5000));
        cursos.add(new Curso(4, "Angular", 100, 2000));

    }

    public List<Curso> cursos() {
        return cursos;
    }

    
    public Curso buscarCurso(int curso_id) {
        Stream<Curso> cursosStream = cursos.stream();
        Stream<Curso> cursosFiltrados = cursosStream.filter(curso -> curso.getCurso_id() == curso_id);
        return cursosFiltrados.findAny().orElse(null);
    }

    
    public List<Curso> eliminarCurso(int curso_id) {
        cursos.removeIf(curso -> curso.getCurso_id() == curso_id);
        return cursos;
    }

    
    public void crearCurso(Curso curso) {
        Curso nuevoCurso = new Curso(curso.getCurso_id(), curso.getName(), curso.getDuracion(), curso.getPrecio());
        cursos.add(nuevoCurso);
    }

    
    public void actualizarCurso(Curso curso) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCurso_id() == curso.getCurso_id()) {
                cursos.set(i, curso);
                break;
            }
        }
    }

}
