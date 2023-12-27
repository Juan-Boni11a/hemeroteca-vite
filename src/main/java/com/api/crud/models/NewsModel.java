package com.api.crud.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "news")
public class NewsModel {
    @Id
    @Getter
    @Setter
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name = "dateRegister")
    private LocalDate dateRegister;

    @Getter
    @Setter
    @Column(name = "nameResp")
    private String nameResp;

    @Getter
    @Setter
    @Column(name = "emitNoticia")
    private LocalDate emitNoticia;

    @Getter
    @Setter
    @Column(name = "seccion")
    private String seccion;

    @Getter
    @Setter
    @Column(name = "numPage")
    private int numPage;

    @Getter
    @Setter
    @Column(name = "sectorNoti")
    private String sectorNoti;

    @Getter
    @Setter
    @Column(name = "subsector")
    private String subsector;

    @Getter
    @Setter
    @Column(name = "tipoInfo")
    private String tipoInfo;

    @Getter
    @Setter
    @Column(name = "medioComunicacion")
    private String medioComunicacion;

    @Getter
    @Setter
    @Column(name = "fuente")
    private String fuente;

    @Getter
    @Setter
    @Column(name = "tendencia")
    private String tendencia;

    @Getter
    @Setter
    @Column(name = "resumen", columnDefinition = "TEXT")
    private String resumen;

    @Getter
    @Setter
    @Column(name = "comentario", columnDefinition = "TEXT")
    private String comentario;

    // Agrega la relación uno a muchos con OpinionModel
    @Getter
    @Setter
    @OneToMany(mappedBy = "news_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OpinionModel> opinions;
}
