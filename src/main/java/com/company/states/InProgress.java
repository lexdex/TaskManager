package com.company.states;

import com.company.Task;
import com.company.TaskState;

public class InProgress extends TaskState {

    public InProgress(Task task) {
        super(task);
    }

    @Override
    public void addToResolved() {
        task.DoToResolved();
        task.addToResolved();
    }

    @Override
    public void addToOpen() {
        task.DoToOpen();
        task.addToOpen();
    }
}
