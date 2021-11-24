package com.sample.persist.Cascade.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    private int id;
    private String name;
    private int age;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student(int id, String name, int age, Subject subject) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public Student() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
