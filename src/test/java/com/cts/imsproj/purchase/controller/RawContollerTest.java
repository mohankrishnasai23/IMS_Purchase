package com.cts.imsproj.purchase.controller;

import static org.mockito.Mockito.verify;

import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cts.imsproj.purchase.service.RawService;

@RunWith(SpringRunner.class)
@WebMvcTest(value=RawController.class)
public class RawContollerTest {

	@Autowired
	private MockMvc mockMvc;
	
	private RawService service;
	
		
	@Test
	void getAllTest() throws Exception {
		Mockito.when(service.getAll()).thenReturn(Collections.emptyList());
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/getall").accept(MediaType.APPLICATION_JSON)).andReturn();
		System.out.println(mvcResult.getResponse());
		verify(service).getAll();
	}
}
