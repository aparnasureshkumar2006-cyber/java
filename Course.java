package CourseEnrollmentSystem;

public abstract class Course implements CourseInterface{
    private String courseId;//known
    private int fees;//known
    private StudentInterface student;


    public String getCourseId() {
        return courseId;
    }
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    public int getFees() {
        return fees;
    }
    public void setFees(int fees) {
        this.fees = fees;
    }
    public StudentInterface getStudent() {
        return student;
    }
    public void setStudent(StudentInterface student) {
        this.student = student;
    }
    public void enroll(){
        this.setFees(this.getFees()*this.getStudent().getDuration()*1000);
        System.out.println("Enrolled");
        System.out.println(this.getFees());
    }
}
