package ru.hellforgesmith.examinator.model.Entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "create_time")
    @DateTimeFormat(pattern = "HH:MM:ss yyyy-MM-DD")
    private LocalDateTime createTime;
}
