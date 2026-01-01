package CourseEnrollmentSystem;

/*
*Assignment: Course Enrollment System*

*3 Entities:* Student, OnlineCourse, OfflineCourse

─────────────────
*VERSION 1: Basic*
─────────────────

*Student*
• Knows: duration, courseType (Constructor with params)
• Unknown: courseId, fee
• Default Constructor (empty)

*OnlineCourse & OfflineCourse*
• Knows: courseId, fee (Constructor with params)
• Unknown: duration
• Default Constructor (empty)

*Method:*
• enroll(int duration)
  - Receives duration as param
  - No return
  - Modifies fee (Online: duration * 500, Offline: duration * 1000)
  - Prints "Enrolled for " + duration + " months"

─────────────────
*Main Logic V1:*
─────────────────
Student1
→ Known student (constructor with duration, courseType)
Student2
→ Empty student
→ set duration
→ set courseType
if (student is ONLINE)
Create Known OnlineCourse
perform enroll with onlineCourse
convey the courseId to student
convey the changed fee to student
if (student is OFFLINE)
Create Empty OfflineCourse
set courseId
set fee
perform enroll with offlineCourse
convey the courseId to student
convey the changed fee to student
print student1 fee and courseId with getter
print student2 fee and courseId with getter


─────────────────
*VERSION 2: Association*
─────────────────

problem:*
Every time: Student → Main → Course to get details and vice versa.

*Solution:*
Mak*Pe Student aware of Course and vice versa by storing addresses!

*Student Changes:*
• Remove: courseId, fee (dependent on Course)
• Add: onlineCourse variable (getter/setter)
• Add: offlineCourse variable (getter/setter)
• Access fee via: onlineCourse.getFee() or offlineCourse.getFee()

*OnlineCourse Changes:*
• Remove: duration (dependent on Student)
• Add: student variable (getter/setter)
• Access duration via: student.getDuration()

*OfflineCourse Changes:*
• Remove: duration (dependent on Student)
• Add: student variable (getter/setter)
• Access duration via: student.getDuration()

─────────────────
*Main Logic V2:*
─────────────────

if (student is ONLINE)
Create Known OnlineCourse
perform enroll with onlineCourse
share address of onlineCourse to student
share address of student to onlineCourse
if (student is OFFLINE)
Create Empty OfflineCourse
set courseId
set fee
perform enroll with offlineCourse
share address of offlineCourse to student
share address of student to offlineCourse
// Now student can directly access fee!
print student1.getOnlineCourse().getFee()
print student2.getOfflineCourse().getFee()
─────────────────*Expected Output:*─────────────────
Enrolled for 3 months
Enrolled for 6 months
Student 1 Fee: 1500 | CourseId: C101
Student 2 Fee: 6000 | CourseId: C202
 */

import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args){
        StudentInterface student=new Student(3,"Online");
        StudentInterface student1=new Student();

        //get input from the terminal
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Duration:");
        BigInteger input=new BigInteger(sc.nextLine());
        System.out.println("Enter the Course type:");
        String inputType= sc.nextLine();
        student1.setDuration(input.intValue());
        student1.setCourseType(inputType);

        if(student.getCourseType()=="Online"){
            CourseInterface oc=new OnlineCourse("AZ1",1000);
            oc.setStudent(student);
            System.out.println("=====STUDENT1=====");
            oc.enroll();
            System.out.println(student.getOnlineCourse().getFees());
        }
        else{
            CourseInterface offc=new OfflineCourse("AZ1",1000);
            offc.setStudent(student);
            System.out.println("=====STUDENT1=====");
            offc.enroll();
            System.out.println(student.getOfflineCourse().getFees());
        }

        if(student1.getCourseType()=="Online"){
            CourseInterface oc=new OnlineCourse("AZ1",1000);
            oc.setStudent(student1);
            System.out.println("=====STUDENT2=====");
            oc.enroll();
            System.out.println(student1.getOnlineCourse().getFees());
        }
        else{
            CourseInterface offc=new OfflineCourse("AZ1",1000);
            offc.setStudent(student1);
            System.out.println("=====STUDENT2=====");
            offc.enroll();
            System.out.println(student1.getOfflineCourse().getFees());
        }
    }
}
