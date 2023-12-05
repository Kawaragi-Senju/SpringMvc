package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.service.ServiceS;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class ControllerMVC {
    @Autowired
    ServiceS service;

    @GetMapping("/")
    public String getMain(Model model){
        model.addAttribute("albums", service.giveBands());
        return "index";
    }

    @GetMapping("/band/{band}/album")
        public String getAlbum(Model model, @PathVariable(name="band") String band){
        model.addAttribute("albums", service.giveAlbum(band));
        return "albums";
    }
}
