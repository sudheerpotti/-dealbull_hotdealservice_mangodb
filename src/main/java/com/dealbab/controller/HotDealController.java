package com.dealbab.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.dealbab.exception.HotDealAlreadyExistsException;
import com.dealbab.exception.HotDealNotFoundException;
import com.dealbab.model.HotDeal;
import com.dealbab.repository.HotDealRepository;
import com.dealbab.service.HotDealService;

@RestController
@RequestMapping(value="/dealbab")
public class HotDealController {

	@Autowired
	private HotDealService hotDealService;
	@Autowired
	HotDealRepository hotDealRepository;
	 


	@CrossOrigin(origins = "http://localhost:8003")

	@PostMapping(value="/hotdeal")
	public ResponseEntity<?> createHotDeal(@Validated @RequestBody HotDeal hotDeal, UriComponentsBuilder ucBuilder){

		  if (hotDealRepository.findById(hotDeal.getId()).isPresent()) {
		        throw new HotDealAlreadyExistsException(hotDeal.getId());
		    }
		  hotDealRepository.save(hotDeal);
		    HttpHeaders headers = new HttpHeaders();
		    headers.setLocation(ucBuilder.path("/api/hotDeal/{id}").buildAndExpand(hotDeal.getId()).toUri());
		    return new ResponseEntity<>(headers, HttpStatus.CREATED);
		}

	 /*@CrossOrigin(origins = "http://localhost:8003")

	@GetMapping(value="/hotdeal/{id}")
	public Optional<HotDeal> getHotDealById(@PathVariable("id")Integer id)
	{
		return hotDealService.getHotDealById(id);
	}*/
	

	@CrossOrigin(origins = "http://localhost:8003")

		@GetMapping(value="/hotdeal/{id}")
		public ResponseEntity<HotDeal> getHotDeal(@PathVariable("id") Integer id) {
		    return hotDealRepository.findById(id)
		        .map(hotdeal -> new ResponseEntity<>(hotdeal, HttpStatus.OK))
		        .orElseThrow(() -> new HotDealNotFoundException(id));
		}

	/* @CrossOrigin(origins = "http://localhost:8003")

	@GetMapping(value="/hotdeal")
	public Iterable<HotDeal> getAllHotDeal()
	{
		return hotDealService.getAllHotDeal();
		
	}
	*/
	

	@CrossOrigin(origins = "http://localhost:8003")

		@GetMapping(value="/hotdeal")
		public ResponseEntity<?> hotdeal() {
		    List<HotDeal> hotdeal = hotDealService.getAllHotDeal();

		    if (hotdeal.isEmpty()) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
			}
		    HashMap<String, Object> hmap = new HashMap<String, Object>();
		    hmap.put("count", hotdeal.size());
		    hmap.put("hotdeal", hotdeal);
		    return new ResponseEntity<HashMap<String, Object>>(hmap, HttpStatus.OK);
	 }
	 /*

	 @CrossOrigin(origins = "http://localhost:8003")
	@DeleteMapping(value="/hotdeal/{id}")
	public void deleteHotDeal(@PathVariable("id")Integer id){
		hotDealService.deleteHotDeal(id);
}
*/
	 

	 @CrossOrigin(origins = "http://localhost:8003")
	 @DeleteMapping(value="/hotdeal/{id}")
	 public ResponseEntity<?> deleteHotDeal(@PathVariable("id") Integer id) {
	     return hotDealRepository.findById(id)
	         .map(hotdeal -> {
	        	 hotDealRepository.delete(hotdeal);
	             return new ResponseEntity(HttpStatus.NO_CONTENT);
	          })
	          .orElseThrow(() -> new HotDealNotFoundException(id));
	 }
}
