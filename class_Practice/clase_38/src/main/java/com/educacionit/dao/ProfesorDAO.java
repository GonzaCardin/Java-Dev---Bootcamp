package com.educacionit.dao;

import java.util.List;

import com.educacionit.model.Profesor;

public interface ProfesorDAO {
    public Profesor buscarPorId(Integer id);
    public List<Profesor> buscarTodos();

    public Integer alta(Profesor Profesor);
    public void baja(Integer id);
    public void modificar(Profesor Profesor);
}
