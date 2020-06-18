 package com.assessment.payments.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.assessment.payments.entity.Payment;
import com.assessment.payments.service.PaymentHistoryService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/payments")
public class PaymentHistoryController {
	
	@Autowired
	PaymentHistoryService paymentHistoryService;

	@GetMapping("/History")
	@ApiOperation(value = "Getting Last 30 Payments History By UserId",
	notes="Provide an UserId to look up the specific Users Last 30 Payments",
	response= Payment.class)
	public @ResponseBody List<Payment> getPayHistoryByUser(@ApiParam(value="UserId value of the User to retrieve Last 30 Payments",required=true)
	        @RequestParam("userId") String  userId,HttpServletResponse response) throws Exception {
		try {
		List<Payment> paymentHistoryList = paymentHistoryService.getPayHistoryByUserId(userId);
		return paymentHistoryList;
	     }
		catch (Exception exc) {
	         throw new ResponseStatusException(
	           HttpStatus.NOT_FOUND, "Invalid UserId", exc);
	    }
	}
}

