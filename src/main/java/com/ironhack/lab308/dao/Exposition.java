package com.ironhack.lab308.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
@Getter
@AllArgsConstructor
@Setter
@PrimaryKeyJoinColumn(name = "id")
public class Exposition extends Event{
}
