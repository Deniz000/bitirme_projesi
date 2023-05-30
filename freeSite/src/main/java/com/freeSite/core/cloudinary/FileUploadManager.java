package com.freeSite.core.cloudinary;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FileUploadManager implements FileUploadService{
	
	private final Cloudinary cloudinary;
	
	@SuppressWarnings("rawtypes")
	public String uploadFile(MultipartFile multipartFile) throws IOException{
		String url =  cloudinary.uploader()
				.upload(multipartFile.getBytes(),
						Map.of("public_id",UUID.randomUUID().toString()))
						.get("url")
						.toString();
		
		cloudinary.url().transformation(new Transformation().width(100).height(150).crop("fill")).generate("olympic_flag");
		return url;
	}


}
