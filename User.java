import java.util.Scanner;

public class User implements UserInterface{
    private String name;
    private TaskInterface[] taskArray = new Task[10];

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    Scanner scan = new Scanner(System.in);
    public void addTask() {
        String useChoice = " ";
        while (!useChoice.equals("no")) {
            TaskInterface task = new Task();
            System.out.println("Enter the Title:");
            String title = scan.nextLine();
            task.setTitle(title);
            System.out.println("Do you want Description?(yes/no):");
            String des = scan.nextLine();
            if (des.equals("yes")) {
                System.out.println("Enter the Description:");
                String description = scan.nextLine();
                task.setDescription(description);
            }
            for (int i = 0; i < this.taskArray.length; i++) {
                if (this.taskArray[i] == null) {
                    this.taskArray[i] = task;
                    break;
                }
            }
            System.out.println("Do you want to Continue?(yes/no)");
            useChoice = scan.nextLine();
        }
        System.out.println("---Create Task Successfully---");
    }

    public void listTask(){
        String userChoice ="";
        while(!userChoice.equals("5")){
            System.out.println("---Task---");
            System.out.println("1.List All Task.");
            System.out.println("2.List To-Do Task.");
            System.out.println("3.List In-Progress Task.");
            System.out.println("4.List Done Task.");
            System.out.println("5.Exit");
            System.out.println("Enter the Choice:");
            userChoice = scan.nextLine();
            for (int i = 0; i < this.taskArray.length; i++) {
                if (this.taskArray[i] != null) {
                    if (userChoice.equals("1")) {
                        System.out.print("*)");
                        System.out.print("Title:");
                        System.out.println(this.taskArray[i].getTitle());
                        System.out.print("Description:");
                        System.out.println(this.taskArray[i].getDescription());
                        System.out.print("Status:");
                        System.out.println(this.taskArray[i].getStatus());
                        System.out.println("--------------------------");
                    }
                    if (userChoice.equals("2") && this.taskArray[i].getStatus().equals("To-Do")) {
                        System.out.print("*)");
                        System.out.print("Title:");
                        System.out.println(this.taskArray[i].getTitle());
                        System.out.print("Description:");
                        System.out.println(this.taskArray[i].getDescription());
                        System.out.print("Status:");
                        System.out.println(this.taskArray[i].getStatus());
                        System.out.println("--------------------------");
                    }
                    if (userChoice.equals("3") && this.taskArray[i].getStatus().equals("In-Progress")) {
                        System.out.print("*)");
                        System.out.print("Title:");
                        System.out.println(this.taskArray[i].getTitle());
                        System.out.print("Description:");
                        System.out.println(this.taskArray[i].getDescription());
                        System.out.print("Status:");
                        System.out.println(this.taskArray[i].getStatus());
                        System.out.println("--------------------------");
                    }
                    if (userChoice.equals("4") && this.taskArray[i].getStatus().equals("Done")) {
                        System.out.print("*)");
                        System.out.print("Title:");
                        System.out.println(this.taskArray[i].getTitle());
                        System.out.print("Description:");
                        System.out.println(this.taskArray[i].getDescription());
                        System.out.print("Status:");
                        System.out.println(this.taskArray[i].getStatus());
                        System.out.println("--------------------------");
                    }
                    if (userChoice.equals("5")) {
                        break;
                    }
                }
            }
        }
        System.out.println("---Task Listed Successfully---");
    }

    public void updateTask(){
        String userChoice = " ";
        while (!userChoice.equals("no")) {
        for (int i = 0; i < this.taskArray.length; i++) {
            if (this.taskArray[i] != null) {
                System.out.print(i + 1);
                System.out.print(".");
                System.out.print("Title:");
                System.out.println(this.taskArray[i].getTitle());
                System.out.print("Description:");
                System.out.println(this.taskArray[i].getDescription());
                System.out.print("Status:");
                System.out.println(this.taskArray[i].getStatus());
                System.out.println("--------------------------");
            }
        }
            System.out.println("---Update Task---");
            System.out.println("1.Title.");
            System.out.println("2.Description.");
            System.out.println("3.Status.");
            System.out.println("Enter the Option:");
            String option = scan.nextLine();
            int updateTask = 0;
            try {
                System.out.println("Enter the number you want to update:");
                updateTask = new Integer(scan.nextLine());
            }
            catch(Exception e){
                System.out.println("Please enter the Correct");
                continue;
            }
            if (option.equals("1")) {
                System.out.println("Enter the Title:");
                String title = scan.nextLine();
                this.taskArray[updateTask - 1].setTitle(title);
            }
            if (option.equals("2")) {
                System.out.println("Enter the Description:");
                String description = scan.nextLine();
                this.taskArray[updateTask - 1].setDescription(description);
            }
            if (option.equals("3")) {
                System.out.println("---Status---");
                System.out.println("1.To-Do.");
                System.out.println("2.In-Progress.");
                System.out.println("3.Done.");
                System.out.println("Enter your Option:");
                String option1 = scan.nextLine();
                if (option1.equals("1")) {
                    this.taskArray[updateTask - 1].setStatus("To-Do");
                }
                if (option1.equals("2")) {
                    this.taskArray[updateTask - 1].setStatus("In-Progress");
                }
                if (option1.equals("3")) {
                    this.taskArray[updateTask - 1].setStatus("Done");
                }
            }
            System.out.println("Do you want to Continue?(yes/no)");
            userChoice = scan.nextLine();
        }
        System.out.println("---Task Updated Successfully---");
    }

    public void deleteTask(){
        String userChoice = "";
        while (!userChoice.equals("no")) {
        System.out.println("---Task---");
        for (int i = 0; i < this.taskArray.length; i++) {
            if (this.taskArray[i] != null) {
                System.out.print(i + 1);
                System.out.print(".");
                System.out.print("Title:");
                System.out.println(this.taskArray[i].getTitle());
                System.out.print("Description:");
                System.out.println(this.taskArray[i].getDescription());
                System.out.print("Status:");
                System.out.println(this.taskArray[i].getStatus());
                System.out.println("--------------------------");
            }
        }
            int deleteTask = 0;
            try {
                System.out.println("Enter the Task Number you want to Delete:");
                deleteTask = new Integer(scan.nextLine());
            }
            catch(Exception e){
                System.out.println("Please enter the Correct");
                continue;
            }
            this.taskArray[deleteTask - 1] = null;
            for (int i = 0; i < this.taskArray.length; i++) {
                if (this.taskArray[i] == null) {
                    for (int j = i; j < this.taskArray.length; j++) {
                        if (this.taskArray[j] != null) {
                            this.taskArray[i] = this.taskArray[j];
                            this.taskArray[j] = null;
                            break;
                        }
                    }
                }
            }
            System.out.println("Do you want to Continue?(yes/no)");
            userChoice = scan.nextLine();
            System.out.println("---Deleted Successfully---");
        }
    }

    public void existTask(){
        System.out.println("---Thank you for Using Task Manager Come Again---");
    }
}