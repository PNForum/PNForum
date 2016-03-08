package com.pnv.api.test;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.pnv.models.Titles;

public class Test {

	public static void main(String[] args) {
		  RestTemplate rt = new RestTemplate();
          rt.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
          rt.getMessageConverters().add(new StringHttpMessageConverter());
          
          Titles tt = new Titles("tt1", "test1", "ssss1");
          tt.setId(6);
          String returns = rt.postForObject("http://192.168.56.1:8080/ERP-PNV/api/title/edit", tt, String.class);
         System.out.println(returns);
	}

}
