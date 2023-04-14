package CompareExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        List<Student> listStudents1 = new ArrayList<Student>();
        // add students to list
        listStudents1.add(new Student(1, "Vinh", 19, "Hanoi"));
        listStudents1.add(new Student(2, "Hoa", 19, "Hanoi"));
        listStudents1.add(new Student(3, "Phu", 20, "Hanoi"));
        listStudents1.add(new Student(4, "Quy", 22, "Hanoi"));
        // sort list student
        Collections.sort(listStudents1);
        // show list students
        System.out.println("Using Comparable");
        for (Student student : listStudents1) {
            System.out.println(student.toString());
        }
        List<Student> listStudents2 = new ArrayList<Student>();
        // add students to list
        NameComparator nameComparator = new NameComparator();
        listStudents2.add(new Student(1, "Vinh", 19, "Hanoi"));
        listStudents2.add(new Student(2, "Hoa", 19, "Hanoi"));
        listStudents2.add(new Student(3, "Phu", 20, "Hanoi"));
        listStudents2.add(new Student(4, "Quy", 22, "Hanoi"));
        System.out.println("Using Comparator");
        Collections.sort(listStudents2, nameComparator);
        for (Student student : listStudents2) {
            System.out.println(student.toString());
        }
        String a = "30D";
        System.out.println(Double.parseDouble(a));
    }
}
