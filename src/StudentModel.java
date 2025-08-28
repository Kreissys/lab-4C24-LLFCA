public class StudentModel {
    private int id;
    private String name;
    private String email;
    private int age;
    private String course;
    private double grade;
    
    // Constructor vacío
    public StudentModel() {
    }
    
    // Constructor con parámetros
    public StudentModel(int id, String name, String email, int age, String course, double grade) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getCourse() {
        return course;
    }
    
    public double getGrade() {
        return grade;
    }
    
    // Setters
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    // Método toString para mostrar información del estudiante
    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", Age=" + age +
                ", Course='" + course + '\'' +
                ", Grade=" + grade +
                '}';
    }
}