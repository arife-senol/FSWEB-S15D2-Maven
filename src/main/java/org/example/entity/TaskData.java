package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String value) {
        switch (value) {
            case "ann":
                return annsTasks;

            case "bob":
                return bobsTasks;

            case "carol":
                return carolsTasks;

            case "all":
                Set<Task> allTasks = new HashSet<>();
                allTasks.addAll(annsTasks);
                allTasks.addAll(bobsTasks);
                allTasks.addAll(carolsTasks);
                return allTasks;

            default:
                return unassignedTasks;

        }
    }

    public Set<Task> getUnion(Set<Task>... tasks) {
        Set<Task> unionTasks = new HashSet<>();
        for (Set<Task> task : tasks) {
            unionTasks.addAll(task);
        }
        return unionTasks;
    }

    public Set<Task> getIntersect(Set<Task> task1, Set<Task> task2) {
        Set<Task> intersectionTasks = new HashSet<>();
        intersectionTasks.addAll(task1);
        intersectionTasks.retainAll(task2);
        return intersectionTasks;

    }
    public Set<Task> getDifference(Set<Task> task1, Set<Task> task2){
        Set<Task> removeTasks = new HashSet<>(task1);
        removeTasks.removeAll(task2);
        return removeTasks;

    }
}
