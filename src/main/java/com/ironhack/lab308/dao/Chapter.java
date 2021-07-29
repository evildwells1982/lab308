package com.ironhack.lab308.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;
    @OneToOne
    @JoinColumn(name = "president_id", referencedColumnName = "id")
    private Member president;

    @OneToMany(mappedBy = "chapter")
    private List<Member> members;

}
