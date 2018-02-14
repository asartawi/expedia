package com.expedia.hotles;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.expedia.hotels.ExpediaApplication;
import com.expedia.hotels.service.OffersService;
import com.expedia.hotels.service.models.Hotel;
import com.expedia.hotels.service.models.HotelDeals;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ExpediaApplication.class)
public class ExpediaApplicationTests {
	
	@Autowired
	private OffersService offerService;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testExpediaApi() {
		HotelDeals hotelOffers = offerService.getHotelOffers(null, null, null, null, null, null, null, null, null, null, null, null);
		Assert.assertNotNull(hotelOffers);
		Assert.assertNotNull(hotelOffers.getOffers());
		Assert.assertNotNull(hotelOffers.getUserInfo());

	}
	
	@Test
	public void testExpediaApiWithFilter() {
		HotelDeals hotelOffers = offerService.getHotelOffers(null, null, null, null, null, null, null, null, null, null, "100", null);
		Assert.assertNotNull(hotelOffers);
		Assert.assertNotNull(hotelOffers.getOffers());
		Assert.assertNotNull(hotelOffers.getUserInfo());
		for(Hotel offer: hotelOffers.getOffers().getHotel()) {
			Assert.assertNotNull(offer.getHotelPricingInfo());
			Assert.assertTrue(offer.getHotelPricingInfo().getAveragePriceValue()>=100.0);
		}
	}
}
