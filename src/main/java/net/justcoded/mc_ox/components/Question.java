package net.justcoded.mc_ox.components;

import java.util.Objects;

public class Question {

    private String question;
    private boolean correct;

    /**
     *
     * @param question - displaying message.
     * @param correct
     */
    public Question(String question, boolean correct) {
        this.question = question;
        this.correct = correct;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
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
