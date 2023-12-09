package com.example.damoaRecipe.service;

import com.example.damoaRecipe.entity.Image;
import com.example.damoaRecipe.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ImageService {

    private final ImageRepository imageRepository;

    @Autowired
    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public Optional<Image> getImageByImage1(String image1) {
        return imageRepository.findByImage1(image1);
    }

}

