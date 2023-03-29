/**********************************************************************************************************************
 * A simple Student grading application which is displaying the Student's data , calculating percentages and count of
 * all students using lambda expressions .
 *********************************************************************************************************************/

package io.gradingsystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class Input {
    public static void main(String[] args) {

        List<Student> students =  new ArrayList<>();
        students.add(new Student("Anthony", "Hopkins", 780));
        students.add( new Student("Anne", "Marcia", 894));
        students.add (new Student("Lisa", "James", 783));
        students.add( new Student("Efg", "Wxy", 933));

        //Printing all Student info
        System.out.println("\nStudent's data ");
        printResultSummary(students, a-> true);

        //Printing all students names who got total marks equal and greater than 800
        System.out.println("\nThe names of students who got marks more than 800");
        printResultSummary(students, a-> a.getMarksObtained() >= 800 && a.getMarksObtained() <= 899);

        //Printing all students names who got total marks equal and greater than 700
        System.out.println("\nThe names of students who got marks more than 700");
        printResultSummary(students, a-> a.getMarksObtained() >= 700 && a.getMarksObtained() <= 799);

    }
        public static void  printResultSummary(List<Student> students , Predicate<Student> predicate){
        int count=0;
            for(Student s:students) {

                if (predicate.test(s)) {
                    System.out.println(s);
                    float percentage = s.getMarksObtained()*100/1000 ;
                    System.out.println("Percentage: " + percentage);
                    count++;
                }
            }

        System.out.println("\nTotal Students : "+ count);
       }

}





