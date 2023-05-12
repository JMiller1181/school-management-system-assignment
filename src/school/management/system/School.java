package school.management.system;
import java.util.ArrayList;

/**
 * This class will account for multiple students and teachers using an ArrayList
 * It will also keep track of money earned and money spent
 */
public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * Creates a new school object
     * @param teachers a list of teachers in the school
     * @param students a list of students in the school
     */
    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school
     * @param student The student to be added
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money the school has earned
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * updates the total money the school has earned
     * @param moneyEarned the money earned
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return the total money the school has spent
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * updates the total money the school has spent
     * @param moneySpent the money spent
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
