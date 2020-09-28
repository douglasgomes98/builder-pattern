package br.com.estacio.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDTO {

    private Integer id;
    private String name;
    private Integer age;
    private String sex;
}
