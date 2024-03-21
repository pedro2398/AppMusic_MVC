package com.AppMusic.Controller;

import com.AppMusic.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository repository;
}
