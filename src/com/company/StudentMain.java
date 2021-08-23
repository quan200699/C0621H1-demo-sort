package com.company;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("001", 20, "Hoàng Anh"));
        students.add(new Student("002", 23, "Quân"));
        students.add(new Student("003", 19, "Hợp"));
        students.add(new Student("004", 21, "Thảo"));
        students.add(new Student("005", 29, "Vũ"));
        students.add(new Student("006", 30, "Chính"));
        students.add(new Student("007", 26, "Toàn"));
        students.add(new Student("008", 24, "Hưởng"));
        students.add(new Student("009", 22, "Dạt"));
        System.out.println("Mảng sinh viên trước khi sắp xếp");
        showStudentList(students);
        System.out.println("Mảng sinh viên sau khi sắp xếp");
        bubbleSort(students);
        showStudentList(students);
    }

    private static void showStudentList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void bubbleSort(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = students.size() - 1; j > i; j--) {
                String studentName1 = students.get(j).getName();
                String studentName2 = students.get(j-1).getName();
                if (studentName1.compareTo(studentName2) < 0) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j - 1));
                    students.set(j - 1, temp);
                }
            }
        }
    }
}
