package main.java.com.educacionit.Execption;

public class DBManagerException extends Exception {
    private Integer error;
    /*
     * Error 1: Open Connection
     * Error 2: showStudent
     * Error 3: showStudents
     * Error 4: showTheStudent
     * Error 5: addStudent
     * Error 6: modifyStudent
     * Error 7: deleteLegajo
     * Error 8: closeConnection
     */
    public static final int ERROR_1 = 1;
    public static final int ERROR_2 = 2;
    public static final int ERROR_3 = 3;
    public static final int ERROR_4 = 4;
    public static final int ERROR_5 = 5;
    public static final int ERROR_6 = 6;
    public static final int ERROR_7 = 7;
    public static final int ERROR_8 = 8;

    public DBManagerException(Integer error, String message) {
        super(message);
        this.error = error;
    }

    public DBManagerException(Integer error, Throwable cause) {
        super(cause);
        this.error = error;
    }

    public DBManagerException(Integer error, String message, Throwable cause) {
        /*
         * Se usa cuando queremos lanzar una exception si no se puedo insertar nada, es
         * decir una excepción raiz
         */
        super(message, cause);
        this.error = error;
    }

    public DBManagerException(Integer error, String message, Throwable cause, boolean enableSupression,
            boolean writableStackTrace) {
        super(message, cause, enableSupression, writableStackTrace);
        this.error = error;
    }

    @Override
    public String getMessage() {
        switch (error) {
            case ERROR_1:
                return "Se produjo un error conectando con la DB. Error: " + super.getMessage();
            case ERROR_2:
                return "Se produjo un error al mostrar los alumnos. Error: " + super.getMessage();
            case ERROR_3:
                return "Se produjo un error al mostrar la coleccion de alumnos. Error: " + super.getMessage();
            case ERROR_4:
                return "Se produjo un error al mostrar al alumno. Error: " + super.getMessage();
            case ERROR_5:
                return "Se produjo un error al agregar al alumno. Error: " + super.getMessage();
            case ERROR_6:
                return "Se produjo un error al modificar al alumno. Error: " + super.getMessage();
            case ERROR_7:
                return "Se produjo un error al eliminar al alumno. Error: " + super.getMessage();
            case ERROR_8:
                return "Se produjo un error al desconectarse con la DB. Error: " + super.getMessage();
            default:
                return super.getMessage();
        }
        /// return super.getMessage();
    }

}
