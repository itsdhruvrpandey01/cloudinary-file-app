package com.aurionpro.cloudinary.service;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
@Service
public class CloudinaryServiceImpl implements CloudService{

	 @Autowired
	 private Cloudinary cloudinary;
	 
	@Override
	public String uploadFile(MultipartFile file) throws IOException {
		Map<?, ?> result = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
        return result.get("secure_url").toString();
	}

}
