package dev.java.Wardrobe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.java.Wardrobe.model.Clothes;
import dev.java.Wardrobe.repository.ClothRepository;

@Service
public class ClothesService {

    private final ClothRepository clothRepository;

    public ClothesService(ClothRepository clothRepository) {
        this.clothRepository = clothRepository;
    }

    public List<Clothes> getAllClothes() {
        return clothRepository.findAll();
    
    }



}
