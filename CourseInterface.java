package CourseEnrollmentSystem;

public interface CourseInterface {
    public String getCourseId();
    public void setCourseId(String courseId);
    public int getFees();
    public void setFees(int fees);
    public void enroll();
    public StudentInterface getStudent();
    public void setStudent(StudentInterface student);
}
