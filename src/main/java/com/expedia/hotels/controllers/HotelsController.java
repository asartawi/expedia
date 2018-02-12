package com.expedia.hotels.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HotelsController {
	
    @RequestMapping(method=RequestMethod.GET)
	  @ResponseBody String index() {
	    return "hello world";
	  }

}
