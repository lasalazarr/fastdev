package com.hello.repository;

import com.hello.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created by User on 4/12/17.
 */
public interface HelloRepository extends JpaRepository<Test,Serializable> {



}
