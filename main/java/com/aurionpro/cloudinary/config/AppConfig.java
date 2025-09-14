package com.aurionpro.cloudinary.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Configuration
public class AppConfig {
	@Bean
    Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "dbub9myft",
            "api_key", "822599316929669",
            "api_secret", "IWOae5drHTpWEjo3oJ2yvyzznEk"
        ));
    }
}
