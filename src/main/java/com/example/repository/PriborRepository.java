package com.example.repository;

import com.example.Head.Pribor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yasha on 28.09.2016.
 */
@Repository
public interface PriborRepository extends CrudRepository<Pribor, Long> {
}
