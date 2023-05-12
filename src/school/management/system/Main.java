package school.management.system;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Teacher liz = new Teacher(1, "Liz", 500);
        Teacher mel = new Teacher(2, "Mel", 700);
        Teacher vander = new Teacher(3, "Vander", 600);

        Student tammy = new Student(1, "Tammy", 4);
        Student rak = new Student(2, "Rak", 12);
        Student rob = new Student(3, "Rob", 5);

        ArrayList<Teacher> teacherList = new ArrayList<>();
        teacherList.add(liz);
        teacherList.add(mel);
        teacherList.add(vander);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(tammy);
        studentList.add(rak);
        studentList.add(rob);

        School ghs = new School(teacherList,studentList);

        Teacher meg = new Teacher(6, "Meg", 900);
        ghs.addTeacher(meg);

        tammy.payFees(5000);
        rak.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("Making the school pay the teachers salary");
        liz.receiveSalary(liz.getSalary());
        System.out.println("GHS has spent $" + ghs.getTotalMoneySpent() + " to pay " + liz.getName() +
                " and they now have $" + ghs.getTotalMoneyEarned());
        vander.receiveSalary(vander.getSalary());
        System.out.println("GHS has spent $" + ghs.getTotalMoneySpent() + " to pay " + liz.getName() +
                " and they now have $" + ghs.getTotalMoneyEarned());
        System.out.println(rak);
        mel.receiveSalary(mel.getSalary());
        System.out.println(mel);
    }
}
