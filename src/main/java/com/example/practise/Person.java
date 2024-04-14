package com.example.practise;

import java.time.LocalDate;

public class Person {
    private String firstName, lastName, address;
    private LocalDate birthday;

    public Person(String firstName, String lastName, String address, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthday = birthday;
    }

    private String formatName(String name){
        name = name.trim();
        if(name.length() > 1)
            return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        return name.substring(0,1).toUpperCase();
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
       firstName = formatName(firstName);
       if (firstName.length() >= 2)
           this.firstName = firstName;
       else
           throw new IllegalArgumentException("Name is too short");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = formatName(lastName);
        if (lastName.length()>=2)
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("Last name too short");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
