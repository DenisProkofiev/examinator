package ru.hellforgesmith.examinator.model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity{
    @Column(name = "userName")
    private String userName;
}
