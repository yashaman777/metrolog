package com.example.repository;

import com.example.domain.Pribor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yasha on 28.09.2016.
 */
@Repository
public interface PriborRepository {

    public void addPribor(Pribor pribor);
    public void updatePribor(Pribor pribor);
    public void removePribor(Long id);
    public Pribor getPriborById(Long id);
    public List<Pribor> listPribor();

}
