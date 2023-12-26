package com.api.crud.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Table(name="news")

public class NewsModel {
    @Id
    @Getter
    @Setter
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @JoinColumn(name = "dateRegister")
    private LocalDate dateRegister;

    @Getter
    @Setter
    @JoinColumn(name = "nameResp")
    private String nameResp;

    @Getter
    @Setter
    @JoinColumn(name = "emitNoticia")
    private LocalDate emitNoticia;

    @Getter
    @Setter
    @JoinColumn(name = "seccion")
    private String seccion;

    @Getter
    @Setter
    @JoinColumn(name = "numPage")
    private int numPage;

    @Getter
    @Setter
    @JoinColumn(name = "sectorNoti")
    private String sectorNoti;

    @Getter
    @Setter
    @JoinColumn(name = "subsector")
    private String subsector;

    @Getter
    @Setter
    @JoinColumn(name = "tipoInfo")
    private String tipoInfo;

    @Getter
    @Setter
    @JoinColumn(name = "medioComunicacion")
    private String medioComunicacion;

    @Getter
    @Setter
    @JoinColumn(name = "fuente")
    private String fuente;

    @Getter
    @Setter
    @JoinColumn(name = "tendencia")
    private String tendencia;

    @Getter
    @Setter
    @JoinColumn(name = "resumen", columnDefinition = "TEXT")
    private String resumen;

    @Getter
    @Setter
    @JoinColumn(name = "comentario", columnDefinition = "TEXT")
    private String comentario;



}
