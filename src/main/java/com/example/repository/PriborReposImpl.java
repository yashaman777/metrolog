package com.example.repository;

import com.example.domain.Pribor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PriborReposImpl implements PriborRepository{

private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addPribor(Pribor pribor) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(pribor);

    }

    @Override
    public void updatePribor(Pribor pribor) {
Session session = this.sessionFactory.getCurrentSession();
        session.update(pribor);
    }

    @Override
    public void removePribor(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Pribor pribor = (Pribor) session.load(Pribor.class, new Long(id));
        if(pribor!=null)
            session.delete(pribor);
    }

    @Override
    public Pribor getPriborById(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Pribor pribor = (Pribor) session.load(Pribor.class, new Long(id));
        return pribor;
    }

    @Override
    public List<Pribor> listPribor() {
        Session session = this.sessionFactory.getCurrentSession();
        List priborList = session.createQuery("").list();
        return priborList;
    }


}
