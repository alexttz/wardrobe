package dev.java.Wardrobe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.java.Wardrobe.model.Clothes;
import dev.java.Wardrobe.repository.ClothRepository;

@Service
public class ClothesService {
    //Services definem o que será feito, como criar, deletar, atualizar e listar as roupas
    private final ClothRepository clothRepository;

    //Construtor que recebe o repositório
    public ClothesService(ClothRepository clothRepository) {
        this.clothRepository = clothRepository;
    }
    //Função que retorna todas as roupas
    public List<Clothes> getAllClothes() {
        return clothRepository.findAll();
    }
    //Função que salva uma roupa nova
    public Clothes saveClothes(Clothes clothes) {
        return clothRepository.save(clothes);
    }   
    //Função que deleta uma roupa pelo ID
    public void deleteClothes(long id) {
        clothRepository.deleteById(id);
    }

}
