package CourseEnrollmentSystem;

public class Student implements StudentInterface{
    private int duration; //known
    private String courseType; //known
    private OnlineCourse onlineCourse;
    private OfflineCourse OfflineCourse;

    //user define constructor
    public Student(int duration,String courseType){
        this.duration=duration;
        this.courseType=courseType;
    }
    //default constructor
    public Student(){

    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getCourseType() {
        return courseType;
    }
    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }
    public OnlineCourse getOnlineCourse() {
        return onlineCourse;
    }
    public void setOnlineCourse(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }
    public OfflineCourse getOfflineCourse() {
        return OfflineCourse;
    }
    public void setOfflineCourse(OfflineCourse offlineCourse) {
        OfflineCourse = offlineCourse;
    }
}
