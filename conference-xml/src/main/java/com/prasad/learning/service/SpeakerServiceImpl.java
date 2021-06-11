package com.prasad.learning.service;

import com.prasad.learning.model.Speaker;
import com.prasad.learning.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    public SpeakerServiceImpl(){

    }
    public SpeakerServiceImpl(SpeakerRepository repository)
    {
        this.repository = repository;
    }
    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
