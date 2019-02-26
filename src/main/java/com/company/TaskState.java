package com.company;

public class TaskState {

    public Task task;

    public TaskState(Task task) {
        this.task = task;
    }

    public void addInProgress() {
        OperationIsNotAllowed("Add in Progress");
    }

    public void addToOpen() {
        OperationIsNotAllowed("Add to Open");
    }

    public void addToResolved() {
        OperationIsNotAllowed("Add to Resolved");
    }

    public void addToClosed() {
        OperationIsNotAllowed("Add to Closed");
    }

    public void addToReopen() {
        OperationIsNotAllowed("Add to Reopen");
    }

    // --------------
    private void OperationIsNotAllowed(String operation) {
        System.out.println("Operation <" + operation + "> is not allowed");
    }

}
