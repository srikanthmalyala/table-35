package com.hack.hacktron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hack.hacktron.services.QueeService;
import com.hack.hacktron.vo.CustomQueue;

@RestController
@RequestMapping("/hacktron")
public class SampleController {

	@Autowired
    QueeService service;
	
	@RequestMapping("/hello")
	public @ResponseBody String message() {
		return "hello";
	}
	
	@RequestMapping("/addQuee")
	public @ResponseBody String addQuee(   ) {
		
		return "hello";
	}
	@GetMapping
    public ResponseEntity<List<CustomQueue>> getAllEmployees() {
        List<CustomQueue> list = service.getAllQuees();
 
        return new ResponseEntity<List<CustomQueue>>(list, new HttpHeaders(), HttpStatus.OK);
    }
	@RequestMapping("/updateQuee")
	public @ResponseBody String addQuee(@RequestParam  Integer qid ) {
		
		return "hello";
	}
	@RequestMapping("/deleteQuee")
	public @ResponseBody String deleteQuee() {
		return "hello";
	}
	@RequestMapping("/addMessage")
	public @ResponseBody String addMessage() {
		return "hello";
	}
	@RequestMapping("/updateMessage")
	public @ResponseBody String updateMessage() {
		return "hello";
	}
	@RequestMapping("/deleteMessage")
	public @ResponseBody String deleteMessage() {
		return "hello";
	}

	
	
	
}
