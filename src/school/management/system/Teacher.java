package school.management.system;

/**
 * This class keeps track of the Teacher objects
 */
public class Teacher {
    private  int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * This creates a new teacher object
     * @param id the teachers id, unique value
     * @param name the teachers name
     * @param salary the teachers salary
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return the id of the teacher
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the teacher
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the salary of the teacher
     */
    public int getSalary() {
        return salary;
    }

    /**
     *
     * @param salary updates the salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds to salary, the removes from total money earned by school
     * @param salary the teachers salary
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the teacher: " + name
                + " Total salary earned so far $" + salaryEarned;
    }
}
