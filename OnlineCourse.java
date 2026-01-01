package CourseEnrollmentSystem;

public class OnlineCourse extends Course implements CourseInterface{

    //user define constructor
    public OnlineCourse(String courseId,int fees){
        this.setCourseId(courseId);
        this.setFees(fees);
    }

    //default constructor
    public OnlineCourse(){

    }


}
