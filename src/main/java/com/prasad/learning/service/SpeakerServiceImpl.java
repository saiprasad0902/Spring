package com.prasad.learning.service;

import com.prasad.learning.model.Speaker;
import com.prasad.learning.repository.HibernateSpeakerRepositoryImpl;
import com.prasad.learning.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
