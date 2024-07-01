package com.educacionit.clase_56.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductoMain {
    public static void main(String[] args) {

        Producto p;
        p = Producto.builder()
                .nombre("Galletas")
                .tipo("Dulces")
                .stock(20)
                .precio(Double.valueOf(50))
                .build();
        log.info("{}",p);        
    }

}
