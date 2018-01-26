package com.company;

import java.util.*;

public class PersonTask {

    String firstName;
    String lastName;
    String nickName;

    PersonTask(String firstName, String lastName, String nickName) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;

    }



    public void comparePeople() {

        ArrayList Person = new ArrayList();
        PersonTask person1 = new PersonTask("Daniel", "Karaś", "ryba");
        PersonTask person2 = new PersonTask("Anna", "Karaś", "Moszczyna");
        PersonTask person3 = new PersonTask("Łukasz", "Moszczyński", "Moszczu");

        Person.add(person1);
        Person.add(person2);
        Person.add(person3);




    }

}
