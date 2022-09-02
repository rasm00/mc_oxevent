package net.justcoded.mc_ox.data;

import net.justcoded.mc_ox.components.Question;

import java.util.*;

public class QuestionRepository implements IQuestionRepository {

    private final HashMap<UUID, Question> questions = new HashMap<>();

    @Override
    public void addQuestion(Question question) {
        this.questions.put(question.getId(), question);
    }

    @Override
    public void removeQuestion(UUID questionId) {
        this.questions.remove(questionId);
    }

    @Override
    public void getQuestion(UUID questionId) {
        this.questions.get(questionId);
    }

    @Override
    public boolean containsQuestion(UUID questionId) {
        return this.questions.containsKey(questionId);
    }

    @Override
    public Question getAndDeleteRandomQuestion() {
        var i = new Random().nextInt(this.questions.size());
        var uuids = questions.keySet().stream().toList();
        var uuid = uuids.get(i);
        var question = this.questions.get(uuid);
        this.questions.remove(uuid);

        return question;
    }

    @Override
    public void addQuestions(Map<UUID, Question> questionMap) {
        this.questions.clear();
        this.questions.putAll(questionMap);
    }
}
