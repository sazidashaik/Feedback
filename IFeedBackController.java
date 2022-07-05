package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.FeedBack;
import com.cg.service.IFeedBackService;
@RestController
public class IFeedBackController {
	
	@Autowired
	public IFeedBackService iFeedBackService;
	
	@RequestMapping("/feedback")
	
	@PostMapping
		
		public FeedBack addFeedBack(@RequestBody FeedBack feedback) {
			return iFeedBackService.addFeedBack(feedback);
		}
	
	 @PutMapping("/{feedbackId}/{overallRating}")
	 
	 public FeedBack updateFeedBack(@PathVariable ("feedbackId") int feedbackId, @PathVariable("overallRating") int overallRating) {
		 return iFeedBackService.updateFeedBack(feedbackId,overallRating);
	 }
	 
	 @GetMapping("/{feedbackId}")
	 public FeedBack viewFeedBack(@PathVariable ("feedbackId") int feedbackId ) {
	 
		return iFeedBackService.viewFeedBack(feedbackId);
	}

	 @GetMapping
	 public List<FeedBack> viewAllFeedBack(){
		 return iFeedBackService.viewAllFeedBack();
	 }
	 
}

