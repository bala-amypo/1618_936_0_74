package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Timestamp;
import com.example.demo.repository.Timestamprepo;
import com.example.demo.service.Timestampservice;

@Service
public class Timestampserviceimpl implements Timestampservice {

    @Autowired
    private Timestamprepo timerepo;

    @Override
    public Timestamp timeData(Timestamp timesof) {
        return timerepo.save(timesof);
    }
}
