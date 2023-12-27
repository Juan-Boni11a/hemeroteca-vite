package com.api.crud.services;

import com.api.crud.models.OpinionModel;
import com.api.crud.repository.OpinionRepository;
import com.api.crud.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpinionService {
    @Autowired
    private OpinionRepository opinionRepository;

    public List<OpinionModel> getAll() {return opinionRepository.findAll();}

    public OpinionModel createOrUpdate(OpinionModel opinionModel) {
        return opinionRepository.save(opinionModel);
    }

    public void delete(Long id ) {
        opinionRepository.deleteById(id);
    }

}
