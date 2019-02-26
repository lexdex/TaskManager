package com.company.states;

import com.company.Task;
import com.company.TaskState;

public class Closed extends TaskState {

    public Closed(Task task) {
        super(task);
    }

    @Override
    public void addToOpen() {
        task.DoToOpen();
        task.addToOpen();
    }
}
