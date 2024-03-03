package com.mawule.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.Data;
@Table(name = "question")
@Data
@Entity
public class Question{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "questiontitle")
    private String questionTitle;
    @Column(name = "option1")
    private String option1;
    @Column(name = "option2")
    private String option2;
    @Column(name = "option3")
    private String option3;
    @Column(name = "option4")
    private String option4;
    @Column(name = "rightanswer")
    private String rightAnswer;
    @Column(name = "difficultylevel")
    private String difficultylevel;
    @Column(name = "category")
    private String category;


}
