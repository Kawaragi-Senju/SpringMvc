package com.dao;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class RepositoryS {
    private HashMap<String, List<String>> hashMap = new HashMap<>();

    public RepositoryS(){
        hashMap.put("lp", List.of("Hybrid Theory", "Numb", "One More Light"));
        hashMap.put("the beatles", List.of("Help", "Abbey Road", "Revolver"));
        hashMap.put("acdc", List.of("Back in Black", "Highway ti hell", "Rock or Bust"));
    }

    public List<String> giveAlbum(String band){
        return hashMap.get(band);
    }
}
