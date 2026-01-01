package CourseEnrollmentSystem;

public interface StudentInterface {
    public int getDuration();
    public void setDuration(int duration);
    public String getCourseType();
    public void setCourseType(String courseType);
    public OnlineCourse getOnlineCourse();
    public void setOnlineCourse(OnlineCourse onlineCourse);
    public OfflineCourse getOfflineCourse();
    public void setOfflineCourse(OfflineCourse offlineCourse);
}
