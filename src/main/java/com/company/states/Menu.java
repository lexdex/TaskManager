package com.company.states;

import com.company.Task;
import com.company.TaskManager;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Menu {

    private LinkedHashMap<String, String> menu;
    private LinkedHashMap<Integer, Printable> methods;
    private LinkedHashMap<String, String> statuses;
    private LinkedHashMap<Integer, Printable> setStatus;
    private TaskManager manager;
    private Scanner scan;

    public Menu() {
        initMenu();
    }

    private void initMenu() {
        menu = new LinkedHashMap<>();
        methods = new LinkedHashMap<>();
        manager = new TaskManager();
        scan = new Scanner(System.in);

        menu.put("1", "Add task");
        menu.put("2", "Remove task");
        menu.put("3", "Show all tasks");
        menu.put("4", "Change task status");
        menu.put("5", "Exit");

        methods.put(1, () -> {
            System.out.println("Name of the task: ");
            manager.addTask(new Task(new Scanner(System.in).nextLine()));
        });

        methods.put(2, () -> {
            System.out.println("Write task to remove: ");
            manager.removeState(new Scanner(System.in).nextLine());
        });

        methods.put(3, () -> manager.showTaskList());

        methods.put(4, () -> {
            System.out.println("Write task and status");
            String [] taskStatus = new Scanner(System.in).nextLine().split(" ");
            manager.changeStatus(taskStatus[0], taskStatus[1]);
        });

        methods.put(5, () -> System.exit(0));
    }


    public void show() {

        while (true) {
            menu.forEach( (k, v) -> {
                System.out.println(k + " - " + v);
            });

            methods.get(scan.nextInt()).print();

        }




    }
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.show();
    }

}
