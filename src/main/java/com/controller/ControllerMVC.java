package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.service.ServiceS;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ControllerMVC {
    @Autowired
    ServiceS service;

    @GetMapping("/")
    public String getMain(Model model){
        model.addAttribute("bands", service.giveBands());
        return "index";
    }

    @GetMapping("/band/{band}/album")
        public String getAlbum(Model model, @PathVariable(name="band") String band){
        model.addAttribute("albums", service.giveAlbum(band));
        return "albums";
    }

    @GetMapping("/band/album")
    public String asad(Model model, @RequestParam(name="band") String band, @RequestParam(name = "releaseDate") Integer releaseDate) {
        model.addAttribute("albums", service.giveAlbum(band, releaseDate));
        return "albums";
    }
}
