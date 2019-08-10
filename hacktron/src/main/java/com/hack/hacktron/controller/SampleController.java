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

import com.hack.hacktron.services.QueueService;
import com.hack.hacktron.vo.CustomQueue;

@RestController
@RequestMapping("/hacktron")
public class SampleController {

	@Autowired
    QueueService service;
	
	Map<String,CustomQueue>  queuesMap = new HashMap<String,CustomQueue>();
	
	@RequestMapping("/hello")
	public @ResponseBody String message() {
		return "hello";
	}
	
	@RequestMapping("/addQueue", method = RequestMethod.POST)
	public @ResponseBody String addQueue( @RequestParam("qName") String qName ) {
		String message=null;
		int queuesMapSize = queuesMap.size(); 
		if(queuesMapSize.size() == 5){
            message = "No more Queues can be added";
		} else{
			CustomQueue customQueue = new CustomQueue();
            queuesMap.push(queuesMapSize+1, customQueue);
			message = "Queue added successfully";
		}
		
		return message;
	}
	@RequestMapping("/listQueues")
	public @ResponseBody String listQueues( ) {
		
		return queuesMap;
	}
	@RequestMapping("/deleteQueue")
	public @ResponseBody String deleteQueue(@RequestParam("qName") String qName) {
		
		String message=null;
		int queuesMapSize = queuesMap.size(); 
		if(queuesMapSize.size() == 0){
            message = "No Queue available to delete";
		} else{
           String removedItem = queuesMap.remove(qName);
		   if(removedItem == null){
             message = "Queue not found";
		   }else
			message = "Queue deleted successfully";
		}
		
		return message;
	}



	@RequestMapping("/addMessage")
	public @ResponseBody String addMessage()@RequestParam("me") String qName {
		
		
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
