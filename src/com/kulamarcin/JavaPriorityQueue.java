package com.kulamarcin;

import java.util.*;

class Student2 {
    private final int id;
    private final String name;
    private final double cgpa;

    Student2(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {
    private final PriorityQueue<Student2> queue = new PriorityQueue<>(
            Comparator.comparing(Student2::getCGPA).reversed()
                    .thenComparing(Student2::getName)
                    .thenComparing(Student2::getID));

    public List<Student2> getStudents(List<String> events) {
        events.forEach((event) -> {
            if (event.equals("SERVED")) {
                queue.poll();
            } else {
                String[] details = event.split(" ");

                queue.add(new Student2(Integer.parseInt(details[3]), details[1], Double.parseDouble(details[2])));
            }
        });

        List<Student2> students = new ArrayList<>();
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }

        return students;
    }
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student2> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student2 st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
