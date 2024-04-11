package com.educacionit.dao;

import java.util.List;

import com.educacionit.model.Especialidad;

public interface EspecialidadDAO {
    public Especialidad buscarPorId(Integer id);
    public List<Especialidad> buscarTodos();

    public Integer alta(Especialidad Especialidad);
    public void baja(Integer id);
    public void modificar(Especialidad Especialidad);
}
