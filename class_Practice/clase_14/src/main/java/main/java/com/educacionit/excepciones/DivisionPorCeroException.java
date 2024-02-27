package main.java.com.educacionit.excepciones;

public class DivisionPorCeroException extends Exception{
   ///Por lo general, se dejan los primeros 3 constructores
    public DivisionPorCeroException(String message){
    super(message);
   }
   public DivisionPorCeroException(Throwable cause){    
    super(cause);
   }
   public DivisionPorCeroException(String message,Throwable cause){
    super(message,cause);
   }
    public DivisionPorCeroException(String message,Throwable cause,boolean enableSuppression,boolean writableStackTrace){
        super(message,cause,enableSuppression,writableStackTrace);
    }
}
