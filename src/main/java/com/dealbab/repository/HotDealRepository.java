package com.dealbab.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dealbab.model.HotDeal;

public interface HotDealRepository extends MongoRepository<HotDeal, Integer> {

	
}
