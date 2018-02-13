package com.expedia.hotels.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@ResponseBody HotelDeals hotelDeals(@RequestParam(name="destinationName", required=false) String destinationName,
			@RequestParam(name="minTripStartDate", required=false) String minTripStartDate,
			@RequestParam(name="maxTripStartDate", required=false) String maxTripStartDate,
			@RequestParam(name="minStarRating", required=false) String minStarRating,
			@RequestParam(name="maxStarRating", required=false) String maxStarRating,
			@RequestParam(name="minGuestRating", required=false) String minGuestRating,
			@RequestParam(name="maxGuestRating", required=false) String maxGuestRating,
			@RequestParam(name="minTotalRate", required=false) String minTotalRate,
			@RequestParam(name="maxTotalRate", required=false) String maxTotalRate,
			@RequestParam(name="minAverageRate", required=false) String minAverageRate,
			@RequestParam(name="maxAverageRate", required=false) String maxAverageRate,
			@RequestParam(name="lengthOfStay", required=false) String lengthOfStay) {
		return offerService.getHotelOffers(destinationName, minTripStartDate, maxTripStartDate, minStarRating,
				maxStarRating, minGuestRating, maxGuestRating, minTotalRate, maxTotalRate, lengthOfStay);
	}

}
