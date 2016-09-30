package com.example.service;

import com.example.domain.Pribor;

import java.util.List;

/**
 * Created by yasha on 30.09.2016.
 */
public interface PriborService {

    public void addPribor(Pribor pribor);
    public void updatePribor(Pribor pribor);
    public void removePribor(Long id);
    public Pribor getPriborById(long id);
    public List<Pribor> listPribors();
}
