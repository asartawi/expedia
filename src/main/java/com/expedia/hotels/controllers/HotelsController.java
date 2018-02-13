package com.expedia.hotels.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.expedia.hotels.service.OffersService;
import com.expedia.hotels.service.models.HotelDeals;

@RestController
@RequestMapping("/hotels")
public class HotelsController {
	
	@Autowired
	private OffersService offerService;

	@RequestMapping("/deals")
	@ResponseBody HotelDeals hotelDeals() {
		return offerService.getHotelOffers();
	}

}
