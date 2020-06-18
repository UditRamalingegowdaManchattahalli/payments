package com.assessment.payments.respository.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.assessment.payments.entity.Payment;
import com.assessment.payments.respository.PaymentHistoryRepository;

@Repository
public class PaymentHistoryRepositoryImpl implements PaymentHistoryRepository {
	 @PersistenceContext
	private EntityManager entityManager;

	public List<Payment> getPayHistoryByUserId(String userId) {
		final long  MS_IN_DAY = 86400000;
		Date now = new Date();
		Date thirtyDaysAgo = new Date(now.getTime() - (30 * MS_IN_DAY));

		Query q = entityManager.createQuery("Select p from Payment p " 
		    + "where p.date < :now and p.date > :thirtyDays");
		q.setParameter("now", now); 
		q.setParameter("thirtyDays", thirtyDaysAgo);

		List<Payment> results = (List<Payment>) q.getResultList();
		return results;
		
	}

}
