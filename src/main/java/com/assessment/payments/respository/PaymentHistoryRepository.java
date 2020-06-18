package com.assessment.payments.respository;

import java.util.List;


import com.assessment.payments.entity.Payment;

public interface PaymentHistoryRepository {

	public List<Payment> getPayHistoryByUserId(String userId);
}
