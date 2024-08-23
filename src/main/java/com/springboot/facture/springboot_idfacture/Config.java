package com.springboot.facture.springboot_idfacture;

import com.springboot.facture.springboot_idfacture.models.Item;
import com.springboot.facture.springboot_idfacture.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class Config {


    @Bean
    List<Item> itemsFacture(){
        return  Arrays.asList(
                new Item(new Product("Camara sonic", 800), 2),
                new Item(new Product("Bicicleta monty", 1200), 4)
        );
    }

    //@Primary
    @Bean("default")
    List<Item> itemsFactureOffice(){
        return  Arrays.asList(
                new Item(new Product("Teléfono iPhone", 1000), 2),
                new Item(new Product("Silla ergonómica", 250), 4),
                new Item(new Product("Laptop Dell", 1500), 1),
                new Item(new Product("Escritorio de oficina", 300), 3),
                new Item(new Product("Monitor Samsung", 500), 2),
                new Item(new Product("Impresora HP", 200), 5)
        );
    }
}
