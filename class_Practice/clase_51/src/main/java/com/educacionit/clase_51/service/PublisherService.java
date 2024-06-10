package com.educacionit.clase_51.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educacionit.clase_51.entities.Publisher;
import com.educacionit.clase_51.repository.PublisherRepository;

@Service
public class PublisherService {
    @Autowired
    PublisherRepository publisherRepository;

    public Publisher savePublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    public void deletePublisher(Long publisherId){
        publisherRepository.deleteById(publisherId);
    }

    public List<Publisher> findAllPublishers(){
        return publisherRepository.findAll();
    }
}
