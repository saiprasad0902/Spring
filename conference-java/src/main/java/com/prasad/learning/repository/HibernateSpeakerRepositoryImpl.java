package com.prasad.learning.repository;

import com.prasad.learning.model.Speaker;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
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
