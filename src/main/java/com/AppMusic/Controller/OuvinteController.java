package com.AppMusic.Controller;

import com.AppMusic.Repository.OuvinteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OuvinteController {

    @Autowired
    OuvinteRepository repository;
}
