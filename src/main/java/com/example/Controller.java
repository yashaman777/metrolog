package com.example;

import com.example.Head.Pribor;
import com.example.repository.PriborRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yasha on 28.09.2016.
 */
@Component
public class Controller {

    @Autowired
    private PriborRepository priborRepository;


    public void showData()
    {
               for(Pribor pribor : priborRepository.findAll())
               {
                   System.out.println("" + pribor.getId());
               }
        }
    }

