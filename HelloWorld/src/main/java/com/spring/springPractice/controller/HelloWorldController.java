package com.spring.springPractice.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springPractice.model.HelloBean;

@RestController
public class HelloWorldController {
@Autowired
ResourceBundleMessageSource messageSource;
	
	@RequestMapping(value="/hello")
	public String helloworldMessage()
	{
		return "Hi this is first ";
	}
	@GetMapping(value="hellobean")
	public HelloBean getHelloBeanMessage() {
		return new HelloBean("Chaitaly","how are you");
	}
	@GetMapping("/hello-int")
	
	public String getMessagesI18NFormat(@RequestHeader 
			(name="Accept-language", required=false )String locale) {
		return messageSource.getMessage("label.hello",null,new Locale(locale));
	}
	

	@GetMapping("/hello-int2")
	public String getMessagesInI18NFormat2() {
		return messageSource.getMessage("label.hello", null, LocaleContextHolder.getLocale());
		
	}
	
}
