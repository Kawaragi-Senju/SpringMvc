package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.service.ServiceS;

@Controller
public class ControllerMVC {
    @Autowired
    ServiceS service;

    @GetMapping("/")
    public String getMain(){
        return "index";
    }

    @GetMapping("/band/lp/album")
    public String getLpAlbums(Model model){
        model.addAttribute("albums", service.giveAlbum("lp"));
        return "albums";
    }

    @GetMapping("/band/thebeatles/album")
    public String getTheBeatlesAlbums(Model model){
        model.addAttribute("albums", service.giveAlbum("the beatles"));
        return "albums";
    }

    @GetMapping("/band/acdc/album")
    public String getACDCAlbums(Model model){
        model.addAttribute("albums", service.giveAlbum("acdc"));
        return "albums";
    }
}
