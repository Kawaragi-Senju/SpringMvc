package com.dao;

import com.models.Album;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

@Repository
public class RepositoryS {
    private HashMap<String, List<Album>> hashMap = new HashMap<>();

    public RepositoryS(){ "Help", "Abbey Road", "Revolver"
        hashMap.put("lp", List.of(new Album("Hybrid Theory", 2003, "Linkin Park"),
                new Album("Numb", 2000, "Linkin Park")));
        hashMap.put("the_beatles", List.of());
        hashMap.put("acdc", List.of("Back in Black", "Highway to hell", "Rock or Bust"));
    }

    public List<String> giveAlbum(String band){
        return hashMap.get(band);
    }

    public Set<String> giveBands(){
        return hashMap.keySet();
    }
}
