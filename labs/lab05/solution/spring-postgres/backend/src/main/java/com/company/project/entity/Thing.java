package com.company.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "THINGS")
public class Thing {

    @Id
    private int id;
    private String name;
    private String description;

    public Thing() {
    }

    public Thing(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Thing(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Thing thing = (Thing) o;

        return name.equals(thing.name) && description.equals(thing.description);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
