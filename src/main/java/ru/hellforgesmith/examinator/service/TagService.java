package ru.hellforgesmith.examinator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.hellforgesmith.examinator.model.Entity.Tag;
import ru.hellforgesmith.examinator.repository.TagRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagService {
    private TagRepository tagRepository;

    public List<Tag> getAllTag() {
        return tagRepository.findAll();
    }

    public Tag saveTag(Tag Tag) {
        return tagRepository.save(Tag);
    }

    public void deleteTag(Tag tag) {
        tagRepository.delete(tag);
    }
}
