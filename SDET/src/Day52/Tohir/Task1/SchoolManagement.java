package Day52.Tohir.Task1;

import java.util.ArrayList;
import java.util.List;

public class SchoolManagement {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("Mike","Shaun");
        Student student2 = new Student("Mike","Shauwn");
        Student student3 = new Student("Mike","Shawn");
        Student student4 = new Student("Nike","Shawn");
        Student student5 = new Student("Nike","Shann");
        School school = new School("HKL",4,06060505,"hkl@edu.tj",
                "May21", list);
        school.setListofStudent(student1);
        System.out.println(school);
        school.setListofStudent(student2);
        System.out.println(school);
        school.setListofStudent(student3);
        System.out.println(school);
        school.setListofStudent(student4);
        System.out.println(school);
        /*school.setListofStudent(student5);
        System.out.println(school);*/

    }
}
