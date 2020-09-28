package br.com.estacio;

import br.com.estacio.entity.Person;
import br.com.estacio.entity.PersonDTO;

public class main {

    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person(1, "Douglas", 22, "Masculino");
        Person person2 = new Person.Builder().id(2).name("Matheus").build();

        PersonDTO personDTO = new PersonDTO();
        PersonDTO personDTO1 = new PersonDTO(1, "Douglas", 22, "Masculino");
        PersonDTO personDTO2 = PersonDTO.builder().id(2).name("Matheus").build();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(personDTO1);
        System.out.println(personDTO2);
    }
}
