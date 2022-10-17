package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ListFilms {
    private int id;
    private int productId;
    private String productName;
    private int productPrice;
    private int count;
}
