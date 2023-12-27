package com.api.crud.controllers;
import com.api.crud.models.NewsModel;
import com.api.crud.models.OpinionModel;
import com.api.crud.services.newsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("api/news")
public class NewsController {

    @Autowired
    private newsService newsService;

    @GetMapping
    public List<NewsModel> getAll(){
        return newsService.getAll();
    }

    @PostMapping
    public NewsModel create(@RequestBody NewsModel newsRequest){
        return newsService.createOrUpdate(newsRequest);
    }

    @PutMapping("/{id}")
    public NewsModel update(@RequestBody NewsModel newsRequest, @PathVariable Long id){
        newsRequest.setId(id);
        return newsService.createOrUpdate(newsRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        newsService.delete(id);
    }
}
