package com.example.demo;

import net.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @NotNull
    @Min(1)
    private long id;

    @NotNull
    @Size(min=3 , max=11)
    private String name;

    @NotNull
    @Min(1)
    private  Integer age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
