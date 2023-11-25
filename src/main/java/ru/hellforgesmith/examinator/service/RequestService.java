package ru.hellforgesmith.examinator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.hellforgesmith.examinator.model.Entity.Question;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class RequestService {
    private QuestionService questionService;
    public Question getQuestions() {
        List<Question> questions = questionService.getAllQuestion();

        Random random = new Random();
        return questions.get(random.nextInt(questions.size(), 0));

    }
}
