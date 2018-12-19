package com.dyvak;// Please, do not use internet or any other sources of information during the test
// tast shouldn’t take more than 30 minutes
// There are 3 classes: Student, Subject and Mark
// - Fill the data according to the following conditions (use lists)
// 1. It is known that there are such students in the group: Valery Popov, Semyon Korzhev, Peter Ivanov, Maria Semenova and Kolya Nesterenko
// 2. Mathematics, Physics, Astronomy, History and Ethics are learned by this group and all subjects are mandatory excluding Ethics. It is optional.
// 3. Fill the data about marks if it is known that students have mark 3 for mandatory subjects and Maria has mark 5 for History and Ethics.
// 4. Please print results in a such way:
//   Popova Valeria Mathematics-1 Physics-2 Astronomy-0 History-1 Ethics-3 (do not display the subject info if there is no data about it)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        // 1
        List<Student> group = new ArrayList<>();
        group.add(new Student("Valery", "Popov"));
        group.add(new Student("Semyon", "Korzhev"));
        group.add(new Student("Peter", "Ivanov"));
        group.add(new Student("Maria", "Semenova"));
        group.add(new Student("Kolya", "Nesterenko"));

        // 2
        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("Mathematics", true));
        subjects.add(new Subject("Physics", true));
        subjects.add(new Subject("Astronomy", true));
        subjects.add(new Subject("History", true));
        subjects.add(new Subject("Ethics", false));

        // 3
        Map<Student, List<Mark>> marksMap = new HashMap<>();

        for (Student student : group) {
            List<Mark> marks = new ArrayList<>();
            for (Subject subject : subjects) {
                if (subject.isMandatory() && !"Maria".equals(student.getFirstName())) {
                    marks.add(new Mark(student, subject, 3));
                } else if ("Maria".equals(student.getFirstName())) {
                    if ("History".equals(subject.getName()) || "Ethics".equals(subject.getName())) {
                        marks.add(new Mark(student, subject, 5));
                    }
                }
            }
            marksMap.put(student, marks);
        }

        // 4
        for (Map.Entry<Student, List<Mark>> item : marksMap.entrySet()) {
            System.out.print(item.getKey().getLastName() + " " + item.getKey().getFirstName());
            for (Mark mark : item.getValue()) {
                System.out.print(" " + mark.getSubject().getName() + "-" + mark.getRank() + " ");
            }
            System.out.println();
        }
    }
}

