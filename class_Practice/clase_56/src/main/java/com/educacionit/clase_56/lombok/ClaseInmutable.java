package com.educacionit.clase_56.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@AllArgsConstructor
@Builder
public class ClaseInmutable {
    private int id;
    private String name;
}
