package com.freeSite.core.cloudinary;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {
	String uploadFile(MultipartFile multipartFile) throws IOException;
}
