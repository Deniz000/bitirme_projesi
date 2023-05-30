package com.freeSite.core.cloudinary;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;

@Configuration
public class CloudinaryConfig {

  private final String CLOUD_NAME ="demaldnim";
  private final String API_KEY ="339431129973733";
  private final String API_SECRET ="4I1KsMojoSebvKmkjDS9yVviotM";

  @Bean
  public Cloudinary cloudConfig() {
    Map<String, String> config = new HashMap<>();
    config.put("cloud_name", CLOUD_NAME);
    config.put("api_key", API_KEY);
    config.put("api_secret", API_SECRET);
    return new Cloudinary(config);
  }

}