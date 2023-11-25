package com.example.springmvc.controller;


import com.example.springmvc.entity.File;
import com.example.springmvc.service.FileUpload;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
@Controller
@RestController
@RequiredArgsConstructor
public class FileUploadController {

    private final FileUpload fileUpload;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/upload")
    public File uploadFile(@RequestParam("image")MultipartFile multipartFile) throws IOException {
        return fileUpload.uploadFile(multipartFile);
    }
}
