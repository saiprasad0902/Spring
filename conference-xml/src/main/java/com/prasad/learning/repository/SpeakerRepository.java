package com.prasad.learning.repository;

import com.prasad.learning.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
