package com.unyleya.ecommerce.config;

import java.sql.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.unyleya.ecommerce.domain.Produto;
import com.unyleya.ecommerce.repository.UseRepository;
@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private UseRepository useRepository;
    @Override
    public void run(String... args) throws Exception {
        useRepository.deleteAll();
        Produto maria = new Produto(null, "Maria", "23");
        Produto maa = new Produto(null, "Mria", "23");
        Produto ma = new Produto(null, "Maia", "23");
        useRepository.saveAll( Arrays.asList(ma,maria,maa));
    }

}
