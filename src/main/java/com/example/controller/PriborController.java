package com.example.controller;

import com.example.domain.Pribor;
import com.example.repository.PriborRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Created by yasha on 28.09.2016.
 */
@Component
@Controller
public class PriborController {

    @Autowired
    private PriborRepository priborRepository;


    public void showData()
    {
               for(Pribor pribor : priborRepository.findAll())
               {
                   System.out.println("" + pribor.getName()+ "  "+pribor.getType());
               }
        }
    }

