package com.api.crud.services;
import com.api.crud.models.NewsModel;
import com.api.crud.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class newsService {
    @Autowired
    private NewsRepository maintenanceRequestRepository;

    public List<NewsModel> getAll() {
        return maintenanceRequestRepository.findAll();
    }

    public NewsModel createOrUpdate(NewsModel newsRequest) {
        return maintenanceRequestRepository.save(newsRequest);
    }

    public void delete(Long id) {
        maintenanceRequestRepository.deleteById(id);
    }
}
