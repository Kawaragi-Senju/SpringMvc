package com.dao;

import com.models.Album;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class RepositoryS {
    private HashMap<String, List<Album>> hashMap = new HashMap<>();

    public RepositoryS(){
        hashMap.put("lp", List.of(new Album("Hybrid Theory", 2003, "Linkin Park"),
                new Album("Numb", 2000, "Linkin Park")));
        hashMap.put("thebeatles", List.of(new Album("Help", 1965, "The Beatles"),
                new Album("Abbey Road", 1969, "The Beatles"),
                new Album("Revolver", 1966, "The Beatles")));
        hashMap.put("acdc", List.of(new Album("Back in Black", 1980, "ACDC"),
                new Album("Highway to Hell", 1979, "ACDC"),
                new Album("Rock or Bust", 2014, "ACDC")));

    }

    public List<Album> giveAlbums(String band, Integer releaseDate){
        return hashMap.get(band).stream().filter((album) -> (album.getReleaseDate().equals(releaseDate))).collect(Collectors.toList());
    }

    public List<Album> giveAlbum(String band){
        return hashMap.get(band);
    }

    public Set<String> giveBands(){
        return hashMap.keySet();
    }
}
