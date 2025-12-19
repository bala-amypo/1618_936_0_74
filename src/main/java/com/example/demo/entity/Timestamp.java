package com.example.demo.entity;

import jakarta.persistence.Entity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NotArgsConstructor

public class Timestamp{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;



}