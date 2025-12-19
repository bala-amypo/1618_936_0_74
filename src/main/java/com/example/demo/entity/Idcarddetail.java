package com.example.demo.entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
public class Idcarddetail{
    private Integer id;
    private String card_no;
    private String email;
    private Integer 

    @OneToOne
    @JoinColumn(name = "student_id")

    private  Studentdetails student;
}