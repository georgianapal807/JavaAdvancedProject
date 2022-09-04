import java.util.*;

public class Catalog {
    Map<Student, Map<Course, List<Grade>>> studentGrades;

    public Catalog(Map<Student, Map<Course, List<Grade>>> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public Catalog() {
        this.studentGrades = new HashMap<>();
    }

    public Catalog addGrade(Student student, Grade grade) {
        if (studentGrades.get(student) == null) {
            studentGrades.put(student, new HashMap<>() {{
                put(grade.getCourse(), new ArrayList<>(Arrays.asList(grade)));
            }});
        } else {
            if (studentGrades.get(student).get(grade.getCourse()) == null) {
                studentGrades.get(student).put(grade.getCourse(), new ArrayList<>(Arrays.asList(grade)));
            } else {
                studentGrades.get(student).get(grade.getCourse()).add(grade);
            }
        }
        return this;
    }

    public void printGrades(Student student) {
        System.out.println("\n" + student);
        Map<Course, List<Grade>> studentGrade = studentGrades.get(student);
        for (Course course : studentGrade.keySet()) {
            List<Grade> grades = studentGrade.get(course);
            System.out.println(course);
            for (int i = 0; i < grades.size(); i++) {
                System.out.print(grades.get(i).getValue() + " ");
            }
            System.out.println();
        }
    }

    public void printAverage(Student student) {
        System.out.println("\n" + student);
        Map<Course, List<Grade>> studentGrade = studentGrades.get(student);
        for (Course course : studentGrade.keySet()) {
            List<Grade> grades = studentGrade.get(course);
            System.out.println(course);
            int sum = 0;
            for (int i = 0; i < grades.size(); i++) {
                sum += grades.get(i).getValue();
            }
            System.out.println("Average is: " + sum / grades.size());
        }
    }
}
