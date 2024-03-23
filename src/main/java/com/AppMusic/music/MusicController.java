package com.AppMusic.music;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("music")
public class MusicController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("music", List.of(
                "Musica 1",
                "Musica 2",
                "MUsica 3",
                "MUsica 4"
        ));

        return "music/index";
    }
}
