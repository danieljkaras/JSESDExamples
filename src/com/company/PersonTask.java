package com.company;

import java.util.Arrays;
import java.util.List;

public class PersonTask {

    String firstName;
    String lastName;
    String nickName;

    PersonTask(String firstName, String lastName, String nickName) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;

    }


    public List<PersonTask> addPeople (){

        PersonTask person1 = new PersonTask("Daniel", "Karaś", "ryba");
        PersonTask person2 = new PersonTask("Anna", "Karaś", "Moszczyna");
        PersonTask person3 = new PersonTask("Łukasz", "Moszczyński", "Moszczu");
        return Arrays.asList(person1, person2, person3)
    }

    public void comparePeople (){

        addPeople().get()

    }


}
