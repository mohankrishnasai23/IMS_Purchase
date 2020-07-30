package com.cts.imsproj.purchase.controller;

import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cts.imsproj.purchase.entity.RawMaterials;
import com.cts.imsproj.purchase.service.RawService;

//@RunWith(SpringRunner.class)
@WebMvcTest(value=RawController.class)
public class RawContollerTest {

	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private RawService service;
	
	@InjectMocks
	RawController controller;
	
	public void init() {
	    MockitoAnnotations.initMocks(this);
	}

		
	@Test
	public void getAllTest() throws Exception {
		Mockito.when(service.getAll()).thenReturn(getAllRawMaterials());
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/getall").accept(MediaType.APPLICATION_JSON)).andReturn();
		System.out.println(mvcResult.getResponse());
		verify(service).getAll();
	}
	
	private List<RawMaterials> getAllRawMaterials() {
		List<RawMaterials> l=new ArrayList<RawMaterials>();
		l.add(new RawMaterials());
		l.add(new RawMaterials());
		return l;
	}
}
