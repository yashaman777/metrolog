package com.example.service;

import com.example.domain.Pribor;
import com.example.repository.PriborReposImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class PriborServiceImpl implements PriborService  {

    private PriborReposImpl priborReposImpl;
    public void setPriborReposImpl(PriborReposImpl priborReposImpl) {
        this.priborReposImpl = priborReposImpl;
    }

    @Override
    @Transactional
    public void addPribor(Pribor pribor) {
        this.priborReposImpl.addPribor(pribor);

    }

    @Override
    @Transactional
    public void updatePribor(Pribor pribor) {
        this.priborReposImpl.updatePribor(pribor);
    }

    @Override
    @Transactional
    public void removePribor(Long id) {
        this.priborReposImpl.removePribor(id);

    }

    @Override
    @Transactional
    public Pribor getPriborById(long id) {
        return this.priborReposImpl.getPriborById(id);
    }

    @Override
    @Transactional
    public List<Pribor> listPribors() {
        return this.priborReposImpl.listPribor();
    }


}
