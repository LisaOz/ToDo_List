package todoList;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private TodoList todoList; // List to store tasks
    private Scanner scanner; // scanner for user input

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;

            }
            if (command.equals("add")) {
                System.out.println("To add: ");
                String task = scanner.nextLine();

                this.todoList.add(task); // add the task to the list

            } else if (command.equals("list")) {

                this.todoList.print(); // print the tasks using the print() methof of TodoList class

            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int taskToRemove = Integer.parseInt(scanner.nextLine());
                this.todoList.remove(taskToRemove); // remove the task by index

            } else {
                System.out.println("Unknown command");

            }
        }
    }
}
