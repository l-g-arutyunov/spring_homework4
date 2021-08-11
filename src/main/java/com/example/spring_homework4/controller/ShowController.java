package com.example.spring_homework4.controller;

import com.example.spring_homework4.entity.Product;
import com.example.spring_homework4.repository.ProductRepository;
import com.example.spring_homework4.repository.ProductRepositoryImpl;
import com.sun.istack.internal.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
@RequiredArgsConstructor
public class ShowController {
    private final ProductRepositoryImpl productRepository;

    @GetMapping("/show")
    public String showHtml(@NotNull Model model) {
        Set<Product> products = productRepository.getProductSet();
        model.addAttribute("products", products);
        return "showHtml";
    }
}
