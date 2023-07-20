package com.example.storebookservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "books")
@ToString
public class Book {

    @Id
    private Long id;
    private String name;
    private String description;
    private String status;
    private double price;

    // Приватный конструктор для использования Builder
}

