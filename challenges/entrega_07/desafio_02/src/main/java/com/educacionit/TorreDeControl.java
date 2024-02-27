package com.educacionit;

public class TorreDeControl {
    private Operario operario;
    
    public TorreDeControl(Operario operario) {
        this.operario = operario;
    }

   

    public Operario getOperario() {
        return operario;
    }

    public void setOperario(Operario operario) {
        this.operario = operario;
    }
}
