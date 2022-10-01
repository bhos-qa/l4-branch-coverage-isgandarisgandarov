package org.example;

enum Sex{
    MALE, FEMALE
}

class Student {
    public String name;
    public int age;
    public String address;
    public String email;

    public Sex sex;

    public String setName(String newName){
        this.name = newName;
        return this.name;
    }

    public int setAge(int newAge){
        this.age = newAge;
        return this.age;
    }

    public String setAddress(String newAddress){
        this.address = newAddress;
        return this.address;
    }

    public String setEmail(String newEmail){
        this.email = newEmail;
        return this.email;
    }

    public Sex setSex (Sex newSex){
        this.sex = newSex;
        return this.sex;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getAddress(){
        return this.address;
    }

    public String getEmail(){
        return this.email;
    }

    public String getSex(){
        return switch (this.sex) {
            case MALE -> "MALE";
            case FEMALE -> "FEMALE";
        };
    }
}
