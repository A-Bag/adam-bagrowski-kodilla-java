package com.kodilla.patterns2.observer.homework;

public class Task {
    private String name;
    private String gitHubLink;

    public Task(String name, String gitHubLink) {
        this.name = name;
        this.gitHubLink = gitHubLink;
    }

    public String getName() {
        return name;
    }

    public String getGitHubLink() {
        return gitHubLink;
    }
}
