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
        Produto maria = new Produto(null, "Mangueira", "23,00");
        Produto maa = new Produto(null, "Torneira", "25,00");
        Produto ma = new Produto(null, "Garrafa Termica", "50,00");
        useRepository.saveAll( Arrays.asList(ma,maria,maa));
    }

}
