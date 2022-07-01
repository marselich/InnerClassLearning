package ru.sinergy.innernested;

public class Main {
    static public void main(String[] args){
        Parcel parcel = new Parcel();
        Parcel.Destination destination = parcel.new Destination();
        destination.doSmth();
    }
}
