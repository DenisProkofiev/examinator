package ru.hellforgesmith.examinator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hellforgesmith.examinator.model.Entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
}
