package com.dealbab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealbab.model.HotDeal;
import com.dealbab.repository.HotDealRepository;
@Service
public class HotDealService {
@Autowired
public HotDealRepository hotDealRepository;
	public HotDeal createHotDeal(HotDeal hotDeal) {
		
		return hotDealRepository.save(hotDeal);
	}
	public Optional<HotDeal> getHotDealById(Integer id) {
		
		return hotDealRepository.findById(id) ;
	}
	public List<HotDeal> getAllHotDeal() {
		
		return hotDealRepository.findAll();
	}
	public void deleteHotDeal(Integer id) {
		hotDealRepository.deleteById(id);
		
	}

}
