package com.SQLSample2.SQLSample2.Service;

import com.SQLSample2.SQLSample2.Models.Samples;
import com.SQLSample2.SQLSample2.Repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class SampleService {
    @Autowired
    SampleRepository sp;
    public Samples addSample(Samples sample){
        sp.save(sample);
        return sample;
    }
    public Samples getSample(Integer id){
        return sp.findById(id).orElse(null);
    }
}
