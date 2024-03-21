package com.AppMusic.Controller;

import com.AppMusic.Repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MusicaController {

    @Autowired
    MusicaRepository repository;
}
