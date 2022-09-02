package net.justcoded.mc_ox.data;

import net.justcoded.mc_ox.components.Question;

import java.util.Map;
import java.util.UUID;

public interface IQuestionRepository {

    void addQuestion(Question question);

    void removeQuestion(UUID questionId);

    void getQuestion(UUID questionId);

    boolean containsQuestion(UUID questionId);

    Question getAndDeleteRandomQuestion();

    void addQuestions(Map<UUID, Question> questionMap);
}
