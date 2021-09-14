package Week2.Access_modifier.student_ex;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student student = new Student() ;
        String name, classes ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Input name : ");
        name = scanner.nextLine();
        System.out.print("Input classes : ");
        classes = scanner.nextLine();
        student.setName(name);

        student.setClasses(classes);
        System.out.println(student.toString() );

        Student student1 = new Student();
        System.out.println(student1.toString() );

    }
}
