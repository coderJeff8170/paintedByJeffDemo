package com.tts.paintedbyjeffdemo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tts.paintedbyjeffdemo.models.Product;
import com.tts.paintedbyjeffdemo.services.ProductService;



@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    
    //TODO: add a products attribute - it's going to be a list
    
    @GetMapping("/product/{id}")
    public String show(@PathVariable int id, Model model) {
        Product product = productService.findById(id);
        String category = product.getCategory();
        System.out.println(category);
        List<Product> products = productService.findByCategory(category);
        model.addAttribute(product);
        model.addAttribute("products", products);
        return "product";
    }

    // TODO: Either implement admin controls or remove these methods.

    @RequestMapping(value = "/product", method = {RequestMethod.POST, RequestMethod.PUT})
    public String createOrUpdate(@Valid Product product) {
        productService.save(product);
        return "redirect:/product/" + product.getId();
    }
}


