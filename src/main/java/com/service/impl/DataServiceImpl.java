package com.service.impl;

import com.repository.AgentRepository;
import com.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private AgentRepository agentRepository;


    @Override
    public void uploadData(MultipartFile file) {

    }
}
