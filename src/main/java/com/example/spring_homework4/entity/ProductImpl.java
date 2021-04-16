package com.example.spring_homework4.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class ProductImpl implements Product{
    private int id;
    private String title;
    private int cost;

    @Override
    public String toString() {
        return "Наименование: " + title + " Артикул: " + id + " Цена: " + cost;
    }
}
