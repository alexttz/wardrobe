package dev.java.Wardrobe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    //Construtor que recebe o serviço
    public ClothesController(ClothesService clothesService) {
        this.clothesService = clothesService;
    }
    //Função que retorna todas as roupas quando a rota for acessada, no caso a rota Get /clothes
    @GetMapping
    public List<Clothes> getAllClothes() {
        return clothesService.getAllClothes();
    }
    //Função que salva uma roupa nova quando a rota for acessada, no caso a rota Post /clothes
    @PostMapping
    public Clothes saveClothes(@RequestBody Clothes clothes) {
        return clothesService.saveClothes(clothes);
    }
    
}
