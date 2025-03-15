package lab1;

import java.util.Arrays;

public class Teacher extends User{
    private String nickname;
    private String status;
    private String[] subjects = new String[10];
    private int sizeOfSubjects = 0;

    public Teacher(String nickname, String status, String[] subjects, int sizeOfSubjects) {
        this.nickname = nickname;
        this.status = status;
        this.subjects = subjects;
        this.sizeOfSubjects = sizeOfSubjects;
    }

    public Teacher(int id, String login, String password, String name, String lastname, String nickname, String status, String[] subjects, int sizeOfSubjects) {
        super(id, login, password, name, lastname);
        this.nickname = nickname;
        this.status = status;
        this.subjects = subjects;
        this.sizeOfSubjects = sizeOfSubjects;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void setSizeOfSubjects(int sizeOfSubjects) {
        this.sizeOfSubjects = sizeOfSubjects;
    }

    public void addSubject(String subject) {
        if (sizeOfSubjects < subjects.length) {
            subjects[sizeOfSubjects] = subject;
            sizeOfSubjects++;
        }
    }

    public void displaySubjects() {
        for (int i = 0; i < sizeOfSubjects; i++) {
            System.out.println(subjects[i]);
        }
    }

    @Override
    public String getUserData() {
        StringBuilder data = new StringBuilder();
        data.append("ID: ").append(getId())
                .append(" LOGIN: ").append(getLogin())
                .append(" PASSWORD: ").append(getPassword())
                .append(" NICKNAME: ").append(nickname)
                .append(" STATUS: ").append(status)
                .append(" SUBJECTS: ");
        displaySubjects();
        return data.toString();
    }

}
