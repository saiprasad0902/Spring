package com.prasad.learning.repository;

import com.prasad.learning.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Sai");
        speaker.setLastName("Prasad");
        speakers.add(speaker);
        return speakers;
    }
}
