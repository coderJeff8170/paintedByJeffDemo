package com.tts.paintedbyjeffdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.paintedbyjeffdemo.models.Product;
import com.tts.paintedbyjeffdemo.repositories.ProductRepository;


@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(long id) {
        return productRepository.findById(id);
    }

//    public List<String> findDistinctBrands() {
//        return productRepository.findDistinctBrands();
//    }

    public List<String> findDistinctCategories() {
        return productRepository.findDistinctCategories();
    }

    public void save(Product product) {
        productRepository.save(product);
    }
    
    //TODO: use this to 'delete' a product once sold; 
    //Instead perhaps use put/patch to alter the 'sold' boolean
    public void deleteById(long id) {
        productRepository.deleteById(id);
    }

    //TODO: implement this as find by size or category
    
    
  public List<Product> findByCategory(String category) {
  if(category == null)
      return productRepository.findAll();
  else 
      return  productRepository.findByCategory(category);
}
  //if we want to find items under one category, would it be findDistinctCategory??
  
  
}