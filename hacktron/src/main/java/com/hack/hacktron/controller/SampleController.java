package com.hack.hacktron.controller;

import java.util.Iterator;
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
import com.hack.hacktron.appConstats.Constants;

@RestController
@RequestMapping("/hacktron")
public class SampleController extends Constants {

	@Autowired
	QueueService service;

	Map<String, CustomQueue> queuesMap = new HashMap<String, CustomQueue>();
	List<CustomMessgaes> messagesList = new ArrayList<CustomMessages>();

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
	public @ResponseBody String listQueues() {

		return queuesMap;
	}

	@RequestMapping("/deleteQueue")
	public @ResponseBody String deleteQueue(@RequestParam("qName") String qName) {

		String message = null;
		int queuesMapSize = queuesMap.size();
		if (queuesMapSize.size() == 0) {
			message = "No Queue available to delete";
		} else {
			String removedItem = queuesMap.remove(qName);
			if (removedItem == null) {
				message = "Queue not found";
			} else
				message = "Queue deleted successfully";
		}

		return message;
	}

	@RequestMapping("/addMessage")
	public @ResponseBody String addMessage()@RequestParam("me") String qName {
		
		int qId=0 ;
				
				for (Map.Entry<String,CustomQueue> entry : queuesMap.entrySet())  {
		            System.out.println("Key = " + entry.getKey() + 
		                             ", Value = " + entry.getValue()); 
		            CustomQueue q =  entry.getValue();
		            if(q.getQueue_name().equals(qName)){
		            	qid = q.getQueue_id();
		            }
		    } 
		
				if(qId==0){
					return "invalid queue provided";
				}
				
		int msgsCount=0;
		for(CustomeMessages cm : messagesList){
			if(cm.getQueue_id()==qId){
				msgsCount++;
			}
		}
		
		if(msgsCount>QUEUE_SIZE){
			return "Queue is already full";
		}else{
			CustomeMessages cmsgs = new CustomeMessages();
			cmsgs.setMessage_description(message);
			cmsgs.setQueue_id(qId);
			messagesList.add(cmsgs);
		}
				
		return "Message is added successfully.";
	}

	@RequestMapping("/updateMessage")
	public @ResponseBody String updateMessage() {
		return "hello";
	}

	@RequestMapping("/deleteMessage")
	public @ResponseBody String deleteMessage()@RequestParam("messageId") String mId {
		
		
		
		return "hello";
	}

}
