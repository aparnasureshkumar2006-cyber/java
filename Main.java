import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserInterface[] userArray = new User[10];
        while (true) {
            System.out.println("---Welcome to Task Manager---");
            System.out.println("UserName: ");
            String name = scan.nextLine();
            UserInterface user = new User();
            for (int i = 0; i < userArray.length; i++) {
                if (userArray[i] == null) {
                    user.setName(name);
                    userArray[i] = user;
                    break;
                }
                if(userArray[i].getName().equals(name)){
                    System.out.print("Welcome back ");
                    System.out.println(userArray[i].getName());
                    continue;
                }
            }
            String choice = " ";
            while (!choice.equals("5")) {
                System.out.println("---Task---");
                System.out.println("1.Add Task.");
                System.out.println("2.List Task.");
                System.out.println("3.Update Task.");
                System.out.println("4.Delete Task.");
                System.out.println("5.Exit.");
                System.out.println("Enter your Choice:");
                choice = scan.nextLine();
                if (choice.equals("1")) {
                    user.addTask();
                }
                else if (choice.equals("2")) {
                    user.listTask();
                }
                else if (choice.equals("3")) {
                    user.updateTask();
                }
                else if (choice.equals("4")) {
                    user.deleteTask();
                }
                else if (choice.equals("5")) {
                    user.existTask();
                }
            }
        }
    }
}