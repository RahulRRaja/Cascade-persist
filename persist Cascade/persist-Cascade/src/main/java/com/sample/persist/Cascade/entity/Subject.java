package com.sample.persist.Cascade.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {
    private String s_name;
    private int s_marks;
    @Id
    private int id;

    public Subject(String s_name, int s_marks, int id) {
        super();
        this.s_name = s_name;
        this.s_marks = s_marks;
        this.id = id;
    }

    public Subject() {
        super();
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getS_marks() {
        return s_marks;
    }

    public void setS_marks(int s_marks) {
        this.s_marks = s_marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
