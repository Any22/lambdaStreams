/**********************************************************************************************************************
 * A simple Student grading application which is displaying the Student's data , calculating percentages and count of
 * all students using Stream APIs .
 *********************************************************************************************************************/
package io.gradingsystem;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class UsingStreams {
    public static void main(String[] args) {
        List<Student> students =  new ArrayList<>();
        students.add(new Student("Anthony", "Hopkins", 780));
        students.add( new Student("Anne", "Marcia", 894));
        students.add (new Student("Lisa", "James", 783));
        students.add( new Student("Efg", "Wxy", 933));

        //Printing all Student info
        System.out.println("\nStudent's data ");
        printConditionallyWithStreams(students, p-> true , System.out::println);

        //Printing all students names who got total marks equal and greater than 800
        System.out.println("\nThe names of students who got marks more than 800 and less than 900");
        printConditionallyWithStreams(students,a-> a.getMarksObtained() >= 800 && a.getMarksObtained() <= 899,System.out::println);

        //Printing all students names who got total marks equal and greater than 700
        System.out.println("\nThe names of students who got marks more than 700");
        printConditionallyWithStreams(students, a-> a.getMarksObtained() >= 700 && a.getMarksObtained() <= 799,System.out::println);

    }

    public static void  printConditionallyWithStreams(List<Student> st ,Predicate<Student> predicate, Consumer<Student> consumer){

        long count = st.stream().filter(predicate).count();

        st.stream().filter(predicate).forEach(consumer);

        System.out.println("\nTotal Students : "+ count);

    }
}
