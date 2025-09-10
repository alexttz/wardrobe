package dev.java.Wardrobe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.java.Wardrobe.model.Clothes;
import dev.java.Wardrobe.service.ClothesService;

@RestController
@RequestMapping("/clothes")
public class ClothesController {

    //Controlers definem a rota do que será feito, como criar, deletar, atualizar e listar as roupas

    //Injetamos os serviços que serão usados do Service
    @Autowired
    private final ClothesService clothesService;
    
    public ClothesController(ClothesService clothesService) {
        this.clothesService = clothesService;
    }

    @GetMapping
    public List<Clothes> getAllClothes() {
        return clothesService.getAllClothes();
    }
    
}
