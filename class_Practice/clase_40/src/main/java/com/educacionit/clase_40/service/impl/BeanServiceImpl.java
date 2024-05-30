package com.educacionit.clase_40.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educacionit.clase_40.beans.EjemploBean;
import com.educacionit.clase_40.service.BeanService;

@Service
public class BeanServiceImpl implements BeanService{

    @Autowired
    private EjemploBean ejemploBean1;

    @Autowired
    private EjemploBean ejemploBean2;

    
    public BeanServiceImpl() {
        System.out.println("Capa Service. Constructor: ejemploBean1: " + ejemploBean1);
        System.out.println("Capa Service. Constructor: ejemploBean2: " + ejemploBean2);
    }


    @Override
    public void imprimirBean() {
        System.out.println("Capa Service. imprimirBean: ejemploBean1: "+ejemploBean1.getCurrentTimestamp());
        System.out.println("Capa Service. imprimirBean: ejemploBean2: "+ejemploBean2.getCurrentTimestamp());
    }

}
