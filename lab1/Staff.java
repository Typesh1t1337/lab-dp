package lab1;


public class Staff extends User {
    private double salary;
    private String[] subjects = new String[100];
    private int indexOfSubject = 0;

    public Staff(double salary, String[] subjects, int indexOfSubject) {
        this.salary = salary;
        this.subjects = subjects;
        this.indexOfSubject = indexOfSubject;
    }

    public Staff(int id, String login, String password, String name, String lastname, double salary, String[] subjects, int indexOfSubject) {
        super(id, login, password, name, lastname);
        this.salary = salary;
        this.subjects = subjects;
        this.indexOfSubject = indexOfSubject;
    }

    // Constructor


    // Getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void addSubject(String subject) {
        if (indexOfSubject < subjects.length) {
            subjects[indexOfSubject] = subject;
            indexOfSubject++;
        }
    }

    public void displaySubjects() {
        for (int i = 0; i < indexOfSubject; i++) {
            System.out.println(subjects[i]);
        }
    }

    @Override
    public String getUserData() {
        StringBuilder data = new StringBuilder();
        data.append("ID: ").append(getId())
                .append(" LOGIN: ").append(getLogin())
                .append(" PASSWORD: ").append(getPassword())
                .append(" FULL NAME: ").append(getLogin())
                .append(" SALARY: ").append(salary)
                .append(" SUBJECTS: ");
        displaySubjects();
        return data.toString();
    }
}


