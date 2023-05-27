package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/api/users")
public class FormController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @PostMapping
    public void userRegister(@ModelAttribute User user,
                               @RequestParam("pdfFile") MultipartFile pdfFile,
                               @RequestParam("imageFile") MultipartFile imageFile){
        try {
            System.out.println(user.toString());

            if (pdfFile != null) {
                userService.uploadFile(pdfFile, user);
            }

            if (imageFile != null) {
                userService.uploadFile(imageFile, user);
            }

            userService.saveUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
