package dev.java.Wardrobe.model;

import jakarta.persistence.*;

@Entity //Define a classe Clothes como entidade no banco de dados
@Table(name="clothes_table") //Define a tabela clothes no banco de dados

public class Clothes {

    @Id // Definimos que o primeiro item será o ID da roupa
    @GeneratedValue (strategy = GenerationType.IDENTITY) // E aqui definimos que o ID será gerado automaticamente quando for criado
    private long id; // Id único da roupa
    private String brand; // Marca da roupa
    private String color; // Cor da roupa
    private String model; // Modelo (ex: Regata)
    private String size; // Tamanho (ex: Large, Medium, Small, Extra Large)

    // Construtor vazio
    public Clothes() {
    }
    
    // Construtor com parâmetros, gets e sets vão retornar os valores e definir os valores das variáveis

    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    
}

