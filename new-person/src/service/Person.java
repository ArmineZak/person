package service;

public class Person {
    private String name;
    private String designation;


    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void setName(String name) {
        if (!"".equals(name)) {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setDesignation(String designation) {
        if (!"".equals(designation)) {
            this.designation = designation;
        }
    }

    public String getDesignation() {
        return this.designation;
    }

    public void eat() {
        System.out.println("I can eat.");
    }

    public void walk() {
        System.out.println("I can walk");
    }

    public void learn() {
        System.out.println("I can learn");
    }


}



