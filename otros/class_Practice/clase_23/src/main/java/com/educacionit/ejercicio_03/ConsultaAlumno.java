package com.educacionit.ejercicio_03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ConsultaAlumno {
    private BufferedReader reader;
    /// Estructura en memoria que guarda Alumnos.
    HashMap<Integer, Alumno> mapaAlumnos = new HashMap<>();

    public ConsultaAlumno(String file) {
        super();
        pre_Procesamiento(file);
    }

    public Alumno consultar(Integer legajo) {
        Alumno alumnoConsultado = mapaAlumnos.get(legajo);
        return alumnoConsultado;
    }

    private void pre_Procesamiento(String file) {

        try {
            reader = new BufferedReader(new FileReader(file));
            try {
                /// Estructura en memoria que guarda Alumnos.
                HashMap<Integer, Alumno> mapaAlumnos = new HashMap<>();
                String str;
                while ((str = reader.readLine()) != null) { /// str = 1000,Gonzalo,Cardin,22

                    /// Corta el registro en campos
                    String[] campos = str.split(",");

                    /// Creación de alumno.
                    Alumno uAlumno = new Alumno();
                    uAlumno.setLegajo(Integer.valueOf(campos[0]));
                    uAlumno.setNombre(campos[1]);
                    uAlumno.setApellido(campos[2]);
                    uAlumno.setEdad(Integer.valueOf(campos[3]));

                    /// Guarda el alumno en memoria
                    mapaAlumnos.put(uAlumno.getLegajo(), uAlumno);
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
