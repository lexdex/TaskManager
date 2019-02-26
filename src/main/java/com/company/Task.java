package com.company;

import com.company.states.Opened;

public class Task {

    private String name;
    private TaskState state;

    public Task(String name) {
        this.name = name;
        this.state = new Opened(this);
    }

    public void setState(TaskState state) {
        this.state = state;
    }

    public void addInProgress() {
        state.addInProgress();
    }

    public void addToOpen() {
        state.addToOpen();
    }

    public void addToResolved() {
        state.addToResolved();
    }

    public void addToClosed() {
        state.addToClosed();
    }

    public void addToReopen() {
        state.addToReopen();
    }

    // -------------- Information Messages
    public void DoInProgress() {
        System.out.println("Added to In Progress");
    }

    public void DoToOpen() {
        System.out.println("Added to Open");
    }

    public void DoToResolved() {
        System.out.println("Added to Resolved");
    }

    public void DoToClosed() {
        System.out.println("Added to Closed");
    }

    public void DoToReopen() {
        System.out.println("Added to Reopen");
    }

    public String getCurrentState() {
        return state.getClass().getName();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + " --> " + getCurrentState();
    }
}
