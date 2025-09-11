package dev.java.Wardrobe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.java.Wardrobe.model.Clothes;

public interface ClothRepository extends JpaRepository<Clothes, Long> {
}
