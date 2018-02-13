package com.expedia.hotels.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.expedia.hotels.service.models.HotelDeals;

@Service
public class OffersService {
	
	public HotelDeals getHotelOffers(String destinationName, String minTripStartDate, String maxTripStartDate, String minStarRating,
			String maxStarRating, String minGuestRating, String maxGuestRating, String minTotalRate, String maxTotalRate, String lengthOfStay, 
			String minAverageRate, String maxAverageRate) {
		RestTemplate restTemplate = new RestTemplate();
		String offersUrl = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(offersUrl);
		if (!StringUtils.isEmpty(destinationName)) {
			builder.queryParam("destinationName", destinationName);
		}
		
		if (!StringUtils.isEmpty(minTripStartDate)) {
			builder.queryParam("minTripStartDate", minTripStartDate);
		}
		
		if (!StringUtils.isEmpty(maxTripStartDate)) {
			builder.queryParam("maxTripStartDate", maxTripStartDate);
		}
		
		if (!StringUtils.isEmpty(minStarRating)) {
			builder.queryParam("minStarRating", minStarRating);
		}
		
		if (!StringUtils.isEmpty(maxStarRating)) {
			builder.queryParam("maxStarRating", maxStarRating);
		}

		if (!StringUtils.isEmpty(minGuestRating)) {
			builder.queryParam("minGuestRating", minGuestRating);
		}
		
		if (!StringUtils.isEmpty(maxGuestRating)) {
			builder.queryParam("maxGuestRating", maxGuestRating);
		}
		
		if (!StringUtils.isEmpty(minTotalRate)) {
			builder.queryParam("minTotalRate", minTotalRate);
		}
		
		if (!StringUtils.isEmpty(maxTotalRate)) {
			builder.queryParam("maxTotalRate", maxTotalRate);
		}
		
		if (!StringUtils.isEmpty(minAverageRate)) {
			builder.queryParam("minAverageRate", minAverageRate);
		}
		
		if (!StringUtils.isEmpty(maxAverageRate)) {
			builder.queryParam("maxAverageRate", maxAverageRate);
		}
		
		if (!StringUtils.isEmpty(lengthOfStay)) {
			builder.queryParam("lengthOfStay", lengthOfStay);
		}
		
		HotelDeals hotelOffers = restTemplate .getForObject(builder.toUriString(), HotelDeals.class);
		return hotelOffers;
	}

}
