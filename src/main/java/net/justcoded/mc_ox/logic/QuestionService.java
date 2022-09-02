package net.justcoded.mc_ox.logic;

import net.justcoded.mc_ox.components.Question;
import net.justcoded.mc_ox.data.IQuestionRepository;

public class QuestionService {

    private IQuestionRepository questionRepository;

    public QuestionService(IQuestionRepository repository) {

    }

    public Question getQuestionFromList() {
        return questionRepository.getAndDeleteRandomQuestion();
    }
}
