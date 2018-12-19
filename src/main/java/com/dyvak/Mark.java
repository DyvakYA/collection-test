package com.dyvak;

import java.util.Objects;

public class Mark {
    private Student student;
    private Subject subject;
    private int rank;

    public Mark() {
    }

    public Mark(Student student, Subject subject, int rank) {
        this.student = student;
        this.subject = subject;
        this.rank = rank;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark mark = (Mark) o;
        return rank == mark.rank &&
                Objects.equals(student, mark.student) &&
                Objects.equals(subject, mark.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, subject, rank);
    }

    @Override
    public String toString() {
        return "Mark{" +
                "student=" + student +
                ", subject=" + subject +
                ", rank=" + rank +
                '}';
    }
}
