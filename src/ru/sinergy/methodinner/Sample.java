package ru.sinergy.methodinner;

import java.util.ArrayList;
import java.util.List;

public class Sample {


    public void createNewPerson(String name) {
        String nameFIO = name;

        class GenericName {
            List<String> names = new ArrayList<String>();

            public GenericName() {
                for(String str: nameFIO.split(" ")) {
                    names.add(str);
                }
            }

            public String getFirstName() {
                return names.get(0);
            }
            public String getLastName() {
                return names.get(names.size() - 1);
            }
        }

        GenericName gName = new GenericName();
        System.out.println("Person: " + gName.getFirstName().charAt(0) + ". " + gName.getLastName());
    }
}
