package model;

public class Student {
    private int id;
    private String name, rollNumber, course, semester, email, phone;

    public Student(int id, String name, String rollNumber, String course, String semester, String email, String phone) {
        this.id = id;
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.semester = semester;
        this.email = email;
        this.phone = phone;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getRollNumber() { return rollNumber; }
    public String getCourse() { return course; }
    public String getSemester() { return semester; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}
