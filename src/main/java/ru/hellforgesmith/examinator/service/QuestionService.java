package ru.hellforgesmith.examinator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.hellforgesmith.examinator.model.Entity.Question;
import ru.hellforgesmith.examinator.repository.QuestionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private QuestionRepository questionRepository;

    public List<Question> getAllQuestion() {
        return questionRepository.findAll();
    }

    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    public void deleteQuestion(Question question) {
        questionRepository.delete(question);
    }

}