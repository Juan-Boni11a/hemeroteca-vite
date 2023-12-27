package com.api.crud.repository;

import com.api.crud.models.OpinionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpinionRepository extends JpaRepository<OpinionModel, Long> {
}
