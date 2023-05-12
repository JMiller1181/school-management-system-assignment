package school.management.system;

/**
 * This class keeps track of student objects and their properties
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * feesTotal will be 30000/year for every student
     * feesPaid will initially be 0
     * @param id the id for the student, unique value
     * @param name the name of the student
     * @param grade the grade the student is in
     */
    public Student(int id, String name, int grade){
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     * This updates the students grade
     * @param grade will be the new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Adds fees to the fees paid
     * @param fees the amount of fees the student paid
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return the id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade the student is in
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return the fees the student has paid
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * gets the amount of fees that still need to be paid
     * @return to total fees remaining
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }
    @Override
    public String toString(){
        return "Student's name: " + name + ", Total fees paid so far: $" + feesPaid;
    }
}
