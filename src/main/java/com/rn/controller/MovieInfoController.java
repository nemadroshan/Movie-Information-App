package com.rn.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.rn.model.MovieInfo;

@Controller
public class MovieInfoController {
	@Autowired
	private RestTemplate restTemplate;

	public static final String uri = "http://www.omdbapi.com/?i=tt3896198&apikey=ae362ab7&t=dhoom";

	@GetMapping(path = "/home")
	public String getHome() {
		return "home1";
	}

	@PostMapping("/getMovieInfos")
	public String getMovieInfo(Model model, @RequestParam("name") String name) throws IllegalAccessException, URISyntaxException {
		
		StringBuffer buffer = new StringBuffer();
		String[] split = name.split(" ");
		for(int i =0;i<split.length;i++) {
			buffer.append(split[i]+"%20");
		}
	
		String url = "http://www.omdbapi.com/?i=tt3896198&apikey=ae362ab7&t=" + buffer;
		URI uri = new URI(url);
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		MovieInfo body = restTemplate.getForObject(uri, MovieInfo.class);
		 if(body.getTitle() == null) {
			 throw new IllegalAccessException("Movie Not Found Please Write  the Correct Name");
		 }
		System.out.println(body);
		model.addAttribute("movieInfo", body);
		return "home1";
	}
}
