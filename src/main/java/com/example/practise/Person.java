package com.example.practise;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String firstName, lastName, address;
    private LocalDate birthday;

    public Person(String firstName, String lastName, String address, LocalDate birthday) {
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setBirthday(birthday);
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
        if (birthday.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("Birthday cant be in future");
        else
            this.birthday = birthday;
    }

    public int getAge() {
        return Period.between(birthday,LocalDate.now()).getYears();
    }

    /**
     * this method will retuen persons name and age
     * @return
     */
    public String toString(){
        return String.format("%s %s is %d years old", firstName, lastName, getAge());
    }
}
