package com.cursos.model;

/**
 * Clase que representa un curso con sus atributos, getters y setters
 */
public class Curso {
    
    private int curso_id;
    private String name;
    private int duracion;
    private int precio;

    public Curso() {
        super();
    }
     /**
     * Constructor de la clase Curso.
     * 
     * @param curso_id El ID del curso.
     * @param name El nombre del curso.
     * @param duracion La duración del curso.
     * @param precio El precio del curso.
     */

    public Curso(int curso_id, String name, int duracion, int precio) {
        super();
        this.curso_id = curso_id;
        this.name = name;
        this.duracion = duracion;
        this.precio = precio;
    }

    public int getCurso_id() {
        return curso_id;
    }

    public String getName() {
        return name;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCurso_id(int curso_id) {
        this.curso_id = curso_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
