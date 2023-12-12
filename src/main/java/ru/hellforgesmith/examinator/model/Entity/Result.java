package ru.hellforgesmith.examinator.model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Result extends BaseEntity{
    @Column(name = "number_of_questions")
    private Long numberOfQuestions;
    @Column(name = "number_of_correct_questions")
    private Long numberOfCorrectQuestions;
    @Column(name = "number_of_incorrect_questions")
    private Long numberOfIncorrectQuestions;
    @Column(name = "percentage_of_correct_questions")
    private Double percentageOfCorrectQuestions;
}