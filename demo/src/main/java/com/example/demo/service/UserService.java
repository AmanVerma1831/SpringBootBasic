package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    private static final String FILE_PATH = "D:\\saved_data\\";

    public void uploadFile(MultipartFile file, User user){
        try {
            String fileName = StringUtils.cleanPath(file.getOriginalFilename());
            String filePath = FILE_PATH + fileName;
            Files.copy(file.getInputStream(), Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);

            if (file.getName().equals("pdfFile")) {
                user.setPdfFilePath(filePath);
            } else if (file.getName().equals("imageFile")) {
                user.setImageFilePath(filePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

}
