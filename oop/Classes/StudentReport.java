package oop.Classes;

public class StudentReport {
    public static class Student{
        String name;
        int grade;

        public Student(String name, int grade){
            this.name = name;
            this.grade = grade;
        }

        public void displayReport(){
            System.out.println(name + " has a grade of " + grade);
        }
    }

    public static void main(String[] args){
        Student student = new Student("Hugo", 90);

        student.displayReport();
    }
}
