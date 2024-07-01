package com.educacionit.clase_56.lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor //Genera los constructores con los atributos de la clase
@NoArgsConstructor  
@EqualsAndHashCode
public class LombokClass {
    private String name;
    private Integer edad;
}
