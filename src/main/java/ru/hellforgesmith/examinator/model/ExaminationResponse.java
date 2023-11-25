package ru.hellforgesmith.examinator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.hellforgesmith.examinator.model.Entity.Question;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExaminationResponse {
    private List<Question> questions;
}
