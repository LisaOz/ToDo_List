package todoList;
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks; // store tasks in a list

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        if (task != null) {
            this.tasks.add(task);
        }
    }

    public void print() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks on the list");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ": " + tasks.get(i));
            }
        }
    }

    public void remove(int taskNumber) {
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            this.tasks.remove(taskNumber - 1);

        } else {
            System.out.println("Invalid tas number");
        }
    }
}
