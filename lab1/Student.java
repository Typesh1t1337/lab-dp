package lab1;

public class Student extends User {
    private double gpa;
    private String courses[] = new String[100];
    private int courseIndex = 0;

    public Student(double gpa, String[] courses, int courseIndex) {
        this.gpa = gpa;
        this.courses = courses;
        this.courseIndex = courseIndex;
    }

    public Student(int id, String login, String password, String name, String lastname, double gpa, String[] courses, int courseIndex) {
        super(id, login, password, name, lastname);
        this.gpa = gpa;
        this.courses = courses;
        this.courseIndex = courseIndex;
    }

    public void addCourse(String course) {
        if (courseIndex < courses.length) {
            courses[courseIndex] = course;
            courseIndex++;
        }
    }

    public void displayCourses() {
        for (int i = 0; i < courseIndex; i++) {
            System.out.println(courses[i]);
        }
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setCourseIndex(int courseIndex) {
        this.courseIndex = courseIndex;
    }

    public double getGpa() {
        return gpa;
    }

    public String[] getCourses() {
        return courses;
    }

    public int getCourseIndex() {
        return courseIndex;
    }

    @Override
    public String getUserData(){
        StringBuilder data = new StringBuilder();
        data.append("ID: ").append(getId())
                .append(" LOGIN: ").append(getLogin())
                .append(" PASSWORD: ").append(getPassword())
                .append(" FULL NAME: ").append(getLogin())
                .append(" SUBJECTS: ");
        displayCourses();
        return data.toString();
    }

}
