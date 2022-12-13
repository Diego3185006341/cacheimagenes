package com.porvenir.goya.cache;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hazelcast.core.HazelcastInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentMap;

@RestController
public class controller {
	@ResponseBody
	@RequestMapping(value = "/sample-image", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
	@Cacheable("images")
	public byte[] image() throws IOException {

	            URL url = new URL("https://cdn.pixabay.com/photo/2015/10/01/17/17/car-967387__480.png");
	            InputStream in = new BufferedInputStream(url.openStream());
	            return FileCopyUtils.copyToByteArray(in); // using Spring's FileCopyUtils
	

	
	}

}
