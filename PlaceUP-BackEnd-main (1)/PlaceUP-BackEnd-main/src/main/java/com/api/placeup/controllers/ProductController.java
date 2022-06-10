package com.api.placeup.controllers;

import com.api.placeup.models.Product;
import com.api.placeup.repositories.ProductRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/api/product")
public class ProductController {

    private final ProductRepository products;

    public ProductController(ProductRepository products) {
        this.products = products;
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<Object> save(@RequestBody Product product){
        Product savedProduct = products.save(product);
        return ResponseEntity.ok(savedProduct);
    }

    @GetMapping
    public ResponseEntity<Object> find( Product filter, @RequestParam("order") String order) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher( ExampleMatcher.StringMatcher.CONTAINING );

        // Sort sort = Sort.by("price").ascending();

        // sort.isSorted();
        // System.out.println(sort);

        Example<Product> example = Example.of(filter, matcher);
        List<Product> list = products.findAll(example);

        list.sort(Comparator.comparingDouble(Product::getPrice));

        if(Objects.equals(order, "descending")) list.sort(Comparator.reverseOrder());


//        Collections.sort(list);

        return ResponseEntity.ok(list);
    }


}
