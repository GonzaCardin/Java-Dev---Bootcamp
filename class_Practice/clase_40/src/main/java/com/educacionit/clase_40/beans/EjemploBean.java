package com.educacionit.clase_40.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") // Default -- Una única instancia por Bean
public class EjemploBean {
    private Long currentTimestamp;

    public EjemploBean() {
        this.currentTimestamp = System.currentTimeMillis();
        System.out.println("Soy el constructor del bean EjemploBean: " + currentTimestamp);
    }

    public Long getCurrentTimestamp() {
        return currentTimestamp;
    }

    public void setCurrentTimestamp(Long currentTimestamp) {
        this.currentTimestamp = currentTimestamp;
    }
    

    

}
