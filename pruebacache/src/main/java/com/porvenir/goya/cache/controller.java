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
	    @ResponseBody
    @RequestMapping(value = "/sample-image", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
    @Cacheable("images")
    public byte[] image() throws IOException {
        //Image picture = ImageIO.read(new File("background.png"));
        //URL url = new URL("https://cdn.pixabay.com/photo/2015/10/01/17/17/car-967387__480.png");
       String archivo= "C:\\Users\\dgalindu\\OneDrive - NTT DATA EMEAL\\Documentos\\imagenes\\backgroundcasualito.png";

        //URL url = new URL("C:\\Users\\dgalindu\\OneDrive - NTT DATA EMEAL\\Documentos\\imagenes\\backgroundcasualito.png");
        // URL url = new URL("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5Ojf/2wBDAQoKCg0MDRoPDxo3JR8lNzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzf/wAARCAAsAEADASIAAhEBAxEB/8QAGgAAAgMBAQAAAAAAAAAAAAAABAYBAwUHAv/EAC8QAAEDAwMCBAMJAAAAAAAAAAEAAgMEBRESITGS0RMiQVEGU7EyYXFygZGhweH/xAAZAQACAwEAAAAAAAAAAAAAAAACBAEDBQb/xAAcEQACAgMBAQAAAAAAAAAAAAABAgADESExBBL/2gAMAwEAAhEDEQA/AOTNiI9ERGMIrwQeAvTKYk7BdiEImQ1oPZNM8hwymm0TRADUBlYEFC9xGAmG0WuRzhlEebiVrKTqNlBVRuYGhoQt3hEjTgLWttn0RgnlU3KlLcpZWX71AIONxHqbcXO2HJWDdaYNe5o9/psn8QFznOx9hpP6+iUbhSPdM448o+iYz9akVuVbMEbTHKMpqRxI2Q9BcIpCNRCZqHwZAMEKxbFI1Is+xoyuipg3GWrapCIiCAvcFOwgYwixTDCB3WVDMNguWluELXVwkCqMICqMBkkaxu5JVC1oDmEXbGJLnBlFx55jgfgEvXPTnw2j8x9ymC4Fsb9LTu1ulv3D/TlYNS1pydg0cuPAViY7AyTOUQVT4nZBW3br7JCRlykWCk+ZP1DspFgpfmT9Q7LFr9JWdNZQlnRGa3/FI2DnJipb9FK0eYLnjLLA07TT9Q7LQpKBrMYnm6h2T1foDdEz7fFjYMfRcI3cOCKZVNpaZ1U/AdjEeeM+6TqJro5PLI/LfU4P9Ii5CSdrRLUTO5O5HZMFgREDS31iXV14hjyS7W7+Es3C9GQ7u2HA9Apqrex5OZpv3HZZ77LA47zT9Q7Jez1BeCP0+AHZM//Z");
        //InputStream in = new BufferedInputStream(url.openStream());
        //Image image = ImageIO.read(f);
        //System.out.println(f.exists());


            //return (image);
    return Files.readAllBytes(Paths.get(archivo));

        //return FileCopyUtils.copyToByteArray(in); // using Spring's FileCopyUtils


    }

}
