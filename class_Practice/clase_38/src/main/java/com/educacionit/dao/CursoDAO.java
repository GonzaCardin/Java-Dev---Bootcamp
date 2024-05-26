package com.educacionit.dao;

import java.util.List;

import com.educacionit.model.Curso;

public interface CursoDAO {
    public Curso buscarPorId(Integer id);
    public List<Curso> buscarTodos();

    public Integer alta(Curso Curso);
    public void baja(Integer id);
    public void modificar(Curso Curso);
}
