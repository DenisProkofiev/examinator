package ru.hellforgesmith.examinator.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExaminationRequest {
    private Long questionNumber;
}
