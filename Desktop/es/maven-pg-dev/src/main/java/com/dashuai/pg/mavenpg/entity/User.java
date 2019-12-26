package com.dashuai.pg.mavenpg.entity;

import javax.persistence.*;
import javax.xml.soap.Name;
import java.io.Serializable;

@Entity
@Table(name = "test_user")
public class User implements Serializable {
    private static final long serialVersionUID = -3206904502456377352L;

    private String id;
    private String name;
    private String sex;

    @Id
    @Basic
    @Column(name = "ID")
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SEX")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
