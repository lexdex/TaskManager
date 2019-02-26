package com.company.states;

import com.company.Task;
import com.company.TaskState;

public class Opened extends TaskState {

    public Opened(Task task) {
        super(task);
    }

    @Override
    public void addInProgress() {
        task.DoInProgress();
        task.addInProgress();
    }

    @Override
    public void addToClosed() {
        task.DoToClosed();
        task.addToClosed();
    }

}
