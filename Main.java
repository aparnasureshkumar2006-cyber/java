package TaskTrackerSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User[] userArray = new User[50];
        while(true) {
            System.out.println("Welcome To TaskManager!");
            System.out.println("Username:");
            boolean isExistingUser = false;
            int userPosition = 0;
            String name = scan.nextLine();
            for(int counter = 0;counter < userArray.length;counter++ ){
                if(userArray[counter] == null){
                    continue;
                }
                if(userArray[counter].getName() .equals(name)){
                    isExistingUser = true;
                    userPosition = counter;
                    break;
                }
            }
            User user;
            if(! isExistingUser) {
                 user = new User(name);
                 userArray[0] = user;
            }
            else{
                 user = userArray[userPosition];
            }
            Integer choice = 0;
            Task userTask = null;
            while (choice != 3) {
                System.out.print("Hi ");
                System.out.println(user.getName());
                System.out.println("====DESCRIPTION====");
                System.out.println("1.Add Task");
                System.out.println("2.List of Task");
                System.out.println("3.Exit");
                System.out.println("Enter your Choice:");
                choice = new Integer(scan.nextLine());
                if (choice == 1) {
                    System.out.println("Enter your Description:");
                    String taskDescription = scan.nextLine();
                    userTask = new Task(taskDescription);
                    user.getTaskArray()[0] = userTask;
                    System.out.println("Task Created Successfully...");
                }
                else if(choice == 2){
                    System.out.println("***Your Task***");
                    String task = userTask.getTaskDescription();
                    System.out.print("* ");
                    System.out.println(task);
                }
                else if (choice == 3) {
                    System.out.println("Thank you for Using TaskManager!");
                }
            }
        }
    }
}