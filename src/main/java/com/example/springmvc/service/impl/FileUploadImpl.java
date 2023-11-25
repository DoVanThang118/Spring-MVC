package com.example.springmvc.service.impl;

import com.cloudinary.Cloudinary;
import com.example.springmvc.entity.File;
import com.example.springmvc.repository.FileRepository;
import com.example.springmvc.service.FileUpload;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
@Service
@RequiredArgsConstructor
public class FileUploadImpl implements FileUpload {

    private final Cloudinary cloudinary;

    @Autowired
    private FileRepository fileRepository;

    @Override
    public File uploadFile(MultipartFile multipartFile) throws IOException {
        String url = cloudinary.uploader().upload(multipartFile.getBytes(), Map.of("public_id", UUID.randomUUID().toString())).get("url").toString();
        File file = new File();
        file.setUrl(url);
        return fileRepository.save(file);
    }
}
