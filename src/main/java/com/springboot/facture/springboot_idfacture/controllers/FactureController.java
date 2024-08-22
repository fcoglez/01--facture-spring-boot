package com.springboot.facture.springboot_idfacture.controllers;

import com.springboot.facture.springboot_idfacture.models.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facture")
public class FactureController {

    @Autowired
    private Facture facture;


    @GetMapping("/show")
    public Facture showFacture(){
        return facture;
    }

}
