package com.assessment.payments.service;

import java.util.List;

import com.assessment.payments.entity.Payment;

public interface PaymentHistoryService {
	public List<Payment> getPayHistoryByUserId(String userId);

}
