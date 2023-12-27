package com.api.crud.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "opinions")
public class OpinionModel {

    @Id
    @Getter
    @Setter
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name = "name")
    private String name;

    @Getter
    @Setter
    @Column(name = "opinion", columnDefinition = "TEXT")
    private String opinion;

    @Getter
    @Setter
    @Column(name = "tendencia")
    private String tendencia;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "news_id") // nombre de la columna que representa la relación
    private NewsModel news_id;


}
