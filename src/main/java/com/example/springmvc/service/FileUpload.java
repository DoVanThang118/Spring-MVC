package com.example.springmvc.service;

import com.example.springmvc.entity.File;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileUpload {

    File uploadFile(MultipartFile multipartFile) throws IOException;
}
