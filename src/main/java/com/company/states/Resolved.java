package com.company.states;

import com.company.Task;
import com.company.TaskState;

public class Resolved extends TaskState {

    public Resolved(Task task) {
        super(task);
    }

    @Override
    public void addToClosed() {
        task.DoToClosed();
        task.addToClosed();
    }

    @Override
    public void addToReopen() {
        task.DoToReopen();
        task.addToReopen();
    }
}
