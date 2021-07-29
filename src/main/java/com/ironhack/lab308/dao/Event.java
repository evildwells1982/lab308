package com.ironhack.lab308.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED) //Needed for inheriting, using Joined strategy
public abstract class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    private Long duration;
    private String location;
    private String title;

    @ManyToMany
    @JoinTable(
            name = "events_has_guests" ,
            joinColumns =  {@JoinColumn(name = "event_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "guest_id", referencedColumnName = "id")}
    )
    private List<Guest> guests;

}
