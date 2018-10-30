package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int counter;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println("Hello "+ name + " you have got new tasks from students : " + taskQueue.getName() + "\n" + " (total:  " + taskQueue.getTasks().size() + " tasks)");
        counter++;
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }
}
