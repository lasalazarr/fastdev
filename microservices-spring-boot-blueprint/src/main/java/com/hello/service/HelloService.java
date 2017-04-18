package com.hello.service;

import com.hello.entity.Test;
import com.hello.repository.HelloRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by User on 4/12/17.
 */
@Service
public class HelloService {

    @Inject
    protected HelloRepository helloRepository;


    public List<Test> getAll(){
        return helloRepository.findAll();
    }

}
