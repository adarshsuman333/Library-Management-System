package com.learning.LibraryManagementSystem.services;

import com.learning.LibraryManagementSystem.entity.Publisher;
import com.learning.LibraryManagementSystem.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService{

    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public List<Publisher> findAllPublishers() {
        return publisherRepository.findAll();
    }

    public Publisher findPublisherById(Long id){
        Publisher publisher = publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher with id " + id + " not found!"));
        return publisher;
    }

    public void createPublisher(Publisher publisher){
        publisherRepository.save(publisher);
    }

    public void updatePublisher(Publisher publisher){
      publisherRepository.save(publisher);
    }

    public void deletePublisher(Long id){
        Publisher publisher = publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher with id " + id + " not found!"));
        publisherRepository.deleteById(publisher.getId());
    }
}
