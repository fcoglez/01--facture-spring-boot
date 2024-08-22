package com.springboot.facture.springboot_idfacture;

import com.springboot.facture.springboot_idfacture.models.Item;
import com.springboot.facture.springboot_idfacture.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:data.yml")
public class Config {

    @Bean
    List<Item> itemsFacture(){
        return  Arrays.asList(
                new Item(
                        new Product("Camara sonic", 800), 2),
                        new Item(new Product("Bicicleta monty", 1200), 4)
        );
    }
}
