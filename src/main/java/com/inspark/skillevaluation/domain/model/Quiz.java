package com.inspark.skillevaluation.domain.model;

import java.util.List;

public class Quiz {
    private String question;
    private List<Answer> options;
    private String time;
    private String difficulty;

    public Quiz() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getOptions() {
        return options;
    }

    public void setOptions(List<Answer> options) {
        this.options = options;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "question='" + question + '\'' +
                ", options=" + options +
                ", time='" + time + '\'' +
                ", difficulty='" + difficulty + '\'' +
                '}';
    }
}
