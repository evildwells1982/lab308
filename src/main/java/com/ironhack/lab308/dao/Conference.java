package com.ironhack.lab308.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
public class Conference extends Event{

    @OneToMany(mappedBy = "conference")
    private List<Speaker> speaker;

}
