package com.aurionpro.cloudinary.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface CloudService {
	public String uploadFile(MultipartFile file) throws IOException;
}
