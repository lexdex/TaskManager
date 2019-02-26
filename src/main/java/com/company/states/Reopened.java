package com.company.states;

import com.company.Task;
import com.company.TaskState;

public class Reopened extends TaskState {

    public Reopened(Task task) {
        super(task);
    }

    @Override
    public void addInProgress() {
        task.DoInProgress();
        task.addInProgress();
    }
}
