package com.company;

import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> taskList;
    private ArrayList<String> statusList;

    public TaskManager() {
        taskList = new ArrayList<>();
        statusList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void removeState(String name) {
        taskList.stream().forEach((s) -> {
            if (s.getName().equals(name)) {
                taskList.remove(s);
            } else {
                System.out.println("No such task");
            }
        });
    }

    public void changeStatus(String name, String status) {
        taskList.stream().forEach((s) -> {
            if (s.getName().equals(name)) {

                if (status.equals("opened")) {
                    s.addToOpen();
                } else if (status.equals("progress")) {
                    s.addInProgress();
                } else if (status.equals("reopened")) {
                    s.addToReopen();
                } else if (status.equals("resolved")) {
                    s.addToResolved();
                } else if (status.equals("closed")) {
                    s.addToClosed();
                }
            }
        });
    }

    public void showTaskList() {
        System.out.println("\nAll tasks: ");
        taskList.forEach(System.out::println);
        System.out.println("\n");
    }

}
