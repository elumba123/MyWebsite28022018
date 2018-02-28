/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.palogi.persistence.model;

/**
 *
 * @author gino
 */
public class Person {

    private String name;
    private String lastName;
    private int age;
    
    
    

    public Person(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    

}
