package com.freeSite.api.cloudinary;

import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.freeSite.core.cloudinary.FileUploadService;

import lombok.RequiredArgsConstructor;

//restapi ye gerek yok direk bunu kullanıyoruz  
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class FileUploadController {
	
	private final FileUploadService fileUploadService;

	@PostMapping()
	public String uploadFile(@RequestParam("image")MultipartFile multipartFile) throws IOException {
		//String imageUrl = 
		fileUploadService.uploadFile(multipartFile);

		//model.addAttribute("image", imageUrl);
		return "gallery";
	}
}
