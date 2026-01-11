package TaskTrackerSystem;

public class User {
    private String name;
    private Task[] taskArray = new Task[50];

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public Task[] getTaskArray(){
        return this.taskArray;
    }
}
