package dev.java.Wardrobe.model;

import jakarta.persistence.*;

@Entity //Define a classe Clothes como entidade no banco de dados
@Table(name="clothes_table") //Define a tabela clothes no banco de dados

public class Clothes {

    @Id // Definimos que o primeiro item será o ID da roupa
    @GeneratedValue (strategy = GenerationType.IDENTITY) //PAREI AQUI
    private long id; // Id único da roupa
    private String brand; // Marca da roupa
    private String color; // Cor da roupa
    private String model; // Modelo (ex: Regata)
    private String size; // Tamanho (ex: Large, Medium, Small, Extra Large)
}

