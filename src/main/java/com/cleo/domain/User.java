package com.cleo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Getter
public class User {
    @Id @GeneratedValue
    private Long id;


    private String userName;

}x1
