package ru.hellforgesmith.examinator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.hellforgesmith.examinator.model.Entity.Answer;
import ru.hellforgesmith.examinator.repository.AnswerRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnswerService {
    private AnswerRepository answerRepository;

    public List<Answer> getAllAnswer() {
        return answerRepository.findAll();
    }

    public Answer saveAnswer(Answer answer) {
        return answerRepository.save(answer);
    }

    public void deleteAnswer(Answer answer) {
        answerRepository.delete(answer);
    }
}