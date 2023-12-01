package com.service;

import com.dao.RepositoryS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceS{
    @Autowired
    RepositoryS repository;

    public List<String> giveAlbum(String band){
        return repository.giveAlbum(band);
    }
}
