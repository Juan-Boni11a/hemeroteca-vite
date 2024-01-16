package com.api.crud.repository;

import com.api.crud.models.NewsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<NewsModel, Long>{

    @Query("SELECT COUNT(n) AS cantidad, n.tendencia FROM NewsModel n GROUP BY n.tendencia")
    List<Object[]> countByTendence();

}
