package com.riwi.surveys.domain.entities;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SurveyEntity {
    private Long id;
    private String title;
    private String description;
    private Timestamp creationDate;
    private Long creatorId;
    private Double active;

}
