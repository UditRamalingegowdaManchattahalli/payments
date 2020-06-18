package com.assessment.payments.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.payments.entity.Payment;
import com.assessment.payments.respository.PaymentHistoryRepository;
import com.assessment.payments.service.PaymentHistoryService;


@Service
public class PaymentHistoryServiceImpl implements PaymentHistoryService {
	
	@Autowired
	PaymentHistoryRepository paymentHistoryRepository;
	
	@Override
	public List<Payment> getPayHistoryByUserId(String userId) {
		return paymentHistoryRepository.getPayHistoryByUserId(userId);
	}
}
