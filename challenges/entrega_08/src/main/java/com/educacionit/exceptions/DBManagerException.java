package com.educacionit.exceptions;

public class DBManagerException extends Exception {
    private Integer error;

    public static final int ERROR_1 = 1; // Abrir Conexion
    public static final int ERROR_2 = 2; // Mostrar provincias
    public static final int ERROR_3 = 3; // Buscar Provincias
    public static final int ERROR_4 = 4; // Agregar Provincias
    public static final int ERROR_5 = 5; // Modificar Provincias
    public static final int ERROR_6 = 6; // Eliminar Provincias
    public static final int ERROR_7 = 7; // Cerrar Conexion

    public DBManagerException(Integer error) {
        this.error = error;
    }

    public DBManagerException(String message, Integer error) {
        super(message);
        this.error = error;
    }

    public DBManagerException(Throwable cause, Integer error) {
        super(cause);
        this.error = error;
    }

    public DBManagerException(String message, Throwable cause, Integer error) {
        super(message, cause);
        this.error = error;
    }

    public DBManagerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace,
            Integer error) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.error = error;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    @Override
    public String getMessage() {
        switch (error) {
            case ERROR_1:
                return "Se produjo un error conectando con la base de datos. Error: " + super.getMessage();
            case ERROR_2:
                return "Se produjo un error al mostrar las provincias. Error: " + super.getMessage();
            case ERROR_3:
                return "Se produjo un error al buscar la provincia. Error: " + super.getMessage();
            case ERROR_4:
                return "Se produjo un error al agregar la provincia. Error: " + super.getMessage();
            case ERROR_5:
                return "Se produjo un error al modificar la provincia. Error: " + super.getMessage();
            case ERROR_6:
                return "Se produjo un error al eliminar la provincia. Error: " + super.getMessage();
            case ERROR_7:
                return "Se produjo un error al cerrar la conexión. Error: " + super.getMessage();
            default:
                return super.getMessage();
        }
    }

}
