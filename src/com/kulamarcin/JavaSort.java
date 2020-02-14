package com.kulamarcin;

import java.util.*;

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;

    Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    String getFname() {
        return fname;
    }

    double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student student) {
        if(getCgpa() > student.getCgpa())
            return -1;
        else if (getCgpa() < student.getCgpa())
            return 1;
        else
            return getFname().compareTo(student.getFname());
    }
}

public class JavaSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }

}
