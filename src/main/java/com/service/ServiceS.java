package com.service;

import com.dao.RepositoryS;
import com.models.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ServiceS{
    @Autowired
    RepositoryS repository;

    public List<Album> giveAlbum(String band){
        return repository.giveAlbum(band);
    }

    public List<Album> giveAlbum(String band, Integer releaseDate){
        return repository.giveAlbums(band, releaseDate);
    }

    public Set<String> giveBands(){
        return repository.giveBands();
    }

}
