package com.service;

import org.springframework.web.multipart.MultipartFile;

public interface DataService {
    void uploadData(MultipartFile file);

}