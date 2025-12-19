package com.example.demo.entity;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NotArgsConstructor

public class Timestamp{
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;



}