package com.AppMusic.Controller;

import com.AppMusic.Repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ArtistaController {

    @Autowired
    ArtistaRepository repository;
}
