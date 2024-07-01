package com.educacionit.clase_56.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class BuilderDTO {
    private final Integer id;
    private final String name;
}
