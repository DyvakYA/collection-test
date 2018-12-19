package com.dyvak;

import java.util.Objects;

public class Subject {
    private String name;
    private boolean isMandatory;

    public Subject() {
    }

    public Subject(String name, boolean isMandatory) {
        this.name = name;
        this.isMandatory = isMandatory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMandatory() {
        return isMandatory;
    }

    public void setMandatory(boolean mandatory) {
        isMandatory = mandatory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return isMandatory == subject.isMandatory &&
                Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isMandatory);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", isMandatory=" + isMandatory +
                '}';
    }
}
