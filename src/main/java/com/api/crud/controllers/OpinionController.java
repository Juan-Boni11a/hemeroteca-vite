package com.api.crud.controllers;

import com.api.crud.models.OpinionModel;
import com.api.crud.services.OpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("api/opinions")
public class OpinionController {
    @Autowired
    private OpinionService opinionService;

    @GetMapping
    public List<OpinionModel> getAll(){
        return opinionService.getAll();
    }

    @PostMapping
    public OpinionModel create(@RequestBody OpinionModel opinionModel){
        return opinionService.createOrUpdate(opinionModel);
    }

    @PutMapping("/{id}")
    public OpinionModel update(@RequestBody OpinionModel opinionModel, @PathVariable Long id){
        opinionModel.setId(id);
        return opinionService.createOrUpdate(opinionModel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        opinionService.delete(id);
    }

}
