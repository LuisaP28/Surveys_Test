package com.riwi.surveys.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "question")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    @Column(columnDefinition = "TEXT")
    private String text;
    @Column(length = 50, nullable = false)
    private String type;
    private Long surveyId;
    @Column(nullable = false)
    private Double active;

    @ManyToOne(fetch = FetchType.LAZY)
    private SurveyEntity surveyEntity;

    @OneToMany(fetch = FetchType.LAZY)
    private Optionquestion optionquestion;
}
