package com.AppMusic.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("music")
public class MusicController {
    @Autowired
    MusicRepository repository;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("music", repository.findAll());

        return "music/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirect){
        Optional<Music> music = repository.findById(id);
        if(music.isEmpty()) {
            redirect.addFlashAttribute("message", "Music can't be deleted!");

            return "redirect:/music";
        }

         redirect.addFlashAttribute("message", "Music Deleted!");
         repository.deleteById(id);

         return "redirect:/music";
    }

    @GetMapping("new")
    public String form() {
        return "music/form";
    }

    @PostMapping
    public String add(Music music, RedirectAttributes redirect) {
        repository.save(music);
        redirect.addFlashAttribute("message", "Music Added!");
        return "redirect:/music";
    }
}
