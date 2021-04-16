package com.example.spring_homework4.controller;

import com.example.spring_homework4.entity.ProductImpl;
import com.example.spring_homework4.repository.ProductRepository;
import com.sun.istack.internal.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class CreateController {
    private final ProductRepository productRepository;

    @PostMapping("/create")
    public String addHtml(@NotNull ProductImpl ProductImpl) {
        productRepository.addProduct(ProductImpl);
        return "addHtml";
    }

    @GetMapping("/create")
    public String addHtmlForm(@NotNull Model model) {
        model.addAttribute("product", new ProductImpl());
        return "addHtml";
    }
}
