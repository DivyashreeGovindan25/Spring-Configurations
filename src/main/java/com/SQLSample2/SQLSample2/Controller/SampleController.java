package com.SQLSample2.SQLSample2.Controller;

import com.SQLSample2.SQLSample2.Models.Samples;
import com.SQLSample2.SQLSample2.Service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sample")
public class SampleController {
    @Autowired
    SampleService ss;
    @PostMapping("/add")
    public ResponseEntity<Samples> addSample(@RequestBody Samples sample){
        ss.addSample(sample);
        return new ResponseEntity(sample, HttpStatus.OK);
    }
    @GetMapping("/getDetails")
    public ResponseEntity<Samples> addSample(@RequestParam Integer id){
        return new ResponseEntity(ss.getSample(id), HttpStatus.OK);
    }

}
