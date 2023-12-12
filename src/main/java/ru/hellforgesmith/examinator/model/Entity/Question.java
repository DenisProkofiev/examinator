package ru.hellforgesmith.examinator.model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Question extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "text")
    private String text;

    @Column(name = "difficulty")
    private String difficulty;

    @ManyToMany(mappedBy = "questions")
    private List<Tag> tags;

    @OneToOne
    private Answer answer;

}
