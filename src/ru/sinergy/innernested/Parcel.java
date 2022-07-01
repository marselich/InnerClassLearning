package ru.sinergy.innernested;

public class Parcel {
    private String recepient;
    private int mass;

    class Destination {
        private String street;
        private int homeNumber;
        private int roomNumber;
//        enum abc { нельзя
//
//        }

        public void doSmth() {
            System.out.println(mass);
        }
    }
}


