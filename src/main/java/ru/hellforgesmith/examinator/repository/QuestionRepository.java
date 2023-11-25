package ru.hellforgesmith.examinator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hellforgesmith.examinator.model.Entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
