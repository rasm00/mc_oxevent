package net.justcoded.mc_ox.components;

import java.util.Objects;
import java.util.UUID;

public class Question {

    private String question;
    private boolean correct;
    private UUID id;
    public Question(String question, boolean correct) {
        this.question = question;
        this.correct = correct;
        this.id = UUID.randomUUID();
    }

    public Question(String question, boolean correct, UUID id) {
        this.question = question;
        this.correct = correct;
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public boolean isCorrect() {
        return correct;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return Objects.equals(question, question1.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question);
    }
}
