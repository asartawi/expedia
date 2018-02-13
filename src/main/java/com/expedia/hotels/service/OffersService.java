package com.expedia.hotels.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.expedia.hotels.service.models.HotelDeals;

@Service
public class OffersService {
	
	public HotelDeals getHotelOffers() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";
		HotelDeals hotelOffers = restTemplate .getForObject(fooResourceUrl, HotelDeals.class);
		return hotelOffers;
	}

}
