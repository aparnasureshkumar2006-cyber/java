package CourseEnrollmentSystem;

public class OfflineCourse extends Course implements CourseInterface{

    //user define constructor
    public OfflineCourse(String courseId,int fees){
        this.setCourseId(courseId);
        this.setFees(fees);
    }

    //default constructor
    public OfflineCourse() {

    }

}
