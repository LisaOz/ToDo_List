# ToDo_List Task Manager
This Java Program manages a list of tasks allowing users to add tasks, remove them, and print the list of tasks that have been added. 

## Features
The program consists of the following classes:

### 1. ToDoList
The TodoList class is responsible for storing and managing the tasks. It uses the ArrayList<String> to store the tasks.
- **Constructor**: Initialises the *tasks* list with **this.tasks = New ArrayList();**
- **Methods**:
  - add(String task): Adds a task to the list.
  - print(): Prints all tasks with their corresponding numbers.
  - remove(int taskNumber): Removes a task based on the given task number.

### 2. UserInterface
The UserInterface class separates the program functionality from the main logic.
- **Constructor**: Initialises the instances of *TodoList* and *Scanner*.
- **Methods**:
  - start(): Handles user input to determine the program's flow and provides the method calls to the different input commands.

### 3.Main
The Main class contains the entry point of the program. It creates instances pf TodoList and UserInterface and calls the *start()* method to run the program.

## Usage
1. Clone the repository and run the program.
2. Use the following commands during the execution:
   - **add**: Add a new Task to the list
   - **list**: Print the list of tasks
   - **remove**: remove a task by its number
   - **stop**: Exit the program
  
## License
This program is licensed under the MIT License and can be freely copied, modified and used in accordance with the terms of the license.
